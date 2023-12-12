/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 03:24:09
 * @Description: 
 */
package edu.neu.cal.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.protobuf.Type;

import edu.neu.cal.dao.FoodHistoryDao;
import edu.neu.cal.dao.UserProfileDao;
import edu.neu.cal.domain.FoodHistory;
import edu.neu.cal.domain.HealthGoalPlan;
import edu.neu.cal.domain.HealthGoalPlanImpl;
import edu.neu.cal.domain.User;
import edu.neu.cal.domain.UserProfile;
import edu.neu.cal.main.CalOMatic9000;
import edu.neu.cal.utils.TypewriterEffectPrinter;

public class CalorieController {

    private static User user;
    private static FoodHistory foodHistory;
    private static FoodHistoryDao foodHistoryDao;

    private static UserProfile userProfile;

    public static void defaultOperation() {

        TypewriterEffectPrinter.println("\nHere is your eating history:");
        showCalorieHistory();
        TypewriterEffectPrinter.println("Here is your calorie intake last week:");

        showCalorieIntakeLastWeek();
    }

    private static void showCalorieIntakeLastWeek() {
        user = CalOMatic9000.getUser();

        UserProfileDao userProfileDao = new UserProfileDao();
        userProfile = userProfileDao.getUserProfileByName(user.getname());

        foodHistory = new FoodHistory();
        foodHistoryDao = new FoodHistoryDao();
        foodHistory.setid(user.getId());

        LinkedList<FoodHistory> foodHistories = new LinkedList<>();
        foodHistories = foodHistoryDao.getFoodHistories(foodHistory.getid());

        // 创建包含每个日期食物名称数组的链表
        Map<LocalDate, List<String>> foodsByDate = foodHistories.stream()
                .collect(Collectors.groupingBy(
                        fh -> fh.getTimestamp().toLocalDateTime().toLocalDate(),
                        Collectors.mapping(FoodHistory::getname, Collectors.toList())));

        Map<LocalDate, List<Double>> amountsByDate = foodHistories.stream()
                .collect(Collectors.groupingBy(
                        fh -> fh.getTimestamp().toLocalDateTime().toLocalDate(),
                        Collectors.mapping(FoodHistory::getamount, Collectors.toList())));
        // TypewriterEffectPrinter.println(amountsByDate.toString());

        Map<LocalDate, List<Double>> groupedAmounts = foodHistories.stream()
                .collect(Collectors.groupingBy(
                        fh -> fh.getTimestamp().toLocalDateTime().toLocalDate(),
                        Collectors.mapping(FoodHistory::getamount, Collectors.toList())));

        // 创建包含每个日期name数组的链表
        LinkedList<String[]> foodsByDateList = new LinkedList<>();

        for (List<String> foods : foodsByDate.values()) {
            String[] foodsArray = foods.toArray(new String[0]);
            foodsByDateList.add(foodsArray);
        }
        // 创建包含每个日期 amount 数组的链表
        LinkedList<Double[]> amountsByDateList = new LinkedList<>();
        for (List<Double> amounts : groupedAmounts.values()) {
            Double[] amountsArray = amounts.toArray(new Double[0]);
            amountsByDateList.add(amountsArray);
        }

        // Print the amountsByDateList
        // for (Double[] amountsArray : amountsByDateList) {
        // for (Double amount : amountsArray) {
        // TypewriterEffectPrinter.print(amount + " ");
        // }
        // System.out.println();
        // }

        HealthGoalPlan plan = new HealthGoalPlan(userProfile, 5, 0.1);
        HealthGoalPlanImpl imp = new HealthGoalPlanImpl(plan);
        // for (Double[] amountsArray : amountsByDateList) {
        // for (Double amount : amountsArray) {
        // TypewriterEffectPrinter.print(amount + " ");
        // }
        // System.out.println();
        // }

        for (int i = 0; i < amountsByDateList.size(); i++) {
            double[] amountsArray = Arrays.stream(amountsByDateList.get(i)).mapToDouble(Double::doubleValue).toArray();
            imp.updateAllForOneDay(foodsByDateList.get(i), amountsArray, i + 1);
        }

        TypewriterEffectPrinter.println(Arrays.toString(imp.getActualCalorieIntake()));

    }

    // show the user the calorie history
    public static void showCalorieHistory() {
        user = CalOMatic9000.getUser();

        foodHistory = new FoodHistory();
        foodHistoryDao = new FoodHistoryDao();
        foodHistory.setid(user.getId());

        LinkedList<FoodHistory> foodHistories = new LinkedList<>();
        foodHistories = foodHistoryDao.getFoodHistories(foodHistory.getid());

        Map<LocalDate, List<String>> foodsByDate = foodHistories.stream()
                .collect(Collectors.groupingBy(
                        fh -> fh.getTimestamp().toLocalDateTime().toLocalDate(),
                        Collectors.mapping(FoodHistory::getname, Collectors.toList())));

        StringBuilder formattedOutput = new StringBuilder();
        for (Map.Entry<LocalDate, List<String>> entry : foodsByDate.entrySet()) {
            formattedOutput.append(entry.getKey()).append(": ");
            formattedOutput.append(String.join(", ", entry.getValue()));
            formattedOutput.append("\n");
        }

        TypewriterEffectPrinter.println(formattedOutput.toString());
    }

}

package edu.neu.cal.test;

import edu.neu.cal.calculators.CalorieCalculator2;
import edu.neu.cal.domain.HealthGoalPlan;
import edu.neu.cal.domain.HealthGoalPlanImpl;
import edu.neu.cal.domain.UserProfile;

/*
 * @Author: Jiang Han
 * @Date: 2023-12-08 23:06:33
 * @Description: 
 */

public class test1 {
    public static void main(String[] args) {
        // CalorieCalculator2 myCalculator = new CalorieCalculator2();
        // // 数据库链接成功
        // System.out.println("Access successfully");

        String[] foodname = { "酸奶", "番茄", "豆腐包子" };
        double[] foodQuantities = { 100, 200, 500 };

        // double mycalorie =
        // myCalculator.getTotalCaloriesByFoodNameandQuantities(foodname,
        // foodQuantities);
        // myCalculator.close();
        // System.out.println(mycalorie);
        // // 注意，access 类应该只做数据库连接，查询数据应该由DAO层的类去完成，这里仅做演示和方便使用
        UserProfile user1 = new UserProfile("", 22, "male", "Wang", 80.0, 1.85, 23);
        System.out.println(user1);
        HealthGoalPlan plan = new HealthGoalPlan(user1, 30, 0.1);
        HealthGoalPlanImpl imp = new HealthGoalPlanImpl(plan);
        System.out.println(imp);
        imp.updateAllForOneDay(foodname, foodQuantities, 1);
        double[] aci = imp.getActualCalorieIntake();
        System.out.println(aci[0]);
        System.out.println(imp);
        imp.updateAllForOneDay(foodname, foodQuantities, 2);
        System.out.println(imp);
    }
}

/*
*@Author:Jiani Lyu
*@Date:12-09-2023
*@Detail:Retrieve data from food,userProfile, and PlanImpl
*/

package edu.neu.cal.calculators;

import edu.neu.cal.domain.Food;
import edu.neu.cal.domain.Plan;
import edu.neu.cal.domain.PlanImpl;
import edu.neu.cal.domain.User;
import edu.neu.cal.domain.UserProfile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class DataRetriever {

    private Map<String, Food> foodMap;
    private UserProfile userProfile;
    private PlanImpl plan;

    public DataRetriever(String foodFileName, String userFileName, String planFileName) {
        this.foodMap = getAllFoodData(foodFileName);
        this.userProfile = getUserData(userFileName);
        this.plan = getPlanData(planFileName);
    }

    private Map<String, Food> getAllFoodData(String filename) {
        Map<String, Food> foodMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); // Skip the header line
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int foodId = Integer.parseInt(data[0].trim());
                String fName = data[1].trim();
                int calories = Integer.parseInt(data[2].trim());
                double protein = Double.parseDouble(data[3].trim());
                double carbs = Double.parseDouble(data[4].trim());
                double fat = Double.parseDouble(data[5].trim());
                foodMap.put(fName, new Food(foodId, fName, calories, protein, carbs, fat));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return foodMap;
    }

    public Food getFoodName(String foodName) {
        return foodMap.get(foodName);
    }

    public Food getFoodID(String foodID) {
        return foodMap.get(foodID);
    }

    public static UserProfile getUserData(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine(); // Read the header line
            line = reader.readLine(); // Read the first line of actual data
            if (line != null) {
                String[] userData = line.split(",");
                int age = Integer.parseInt(userData[0].trim());
                int sex = Integer.parseInt(userData[1].trim());
                String userName = userData[2].trim();
                double weight = Double.parseDouble(userData[3].trim());
                double height = Double.parseDouble(userData[4].trim());
                double bodyFatRate = Double.parseDouble(userData[5].trim());

                return new UserProfile(age, sex, userName, weight, height, bodyFatRate);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PlanImpl getPlanData(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            reader.readLine(); // Skip the header line

            String userLine = reader.readLine();
            User user = createUser(userLine);

            int days = Integer.parseInt(reader.readLine().trim());
            Plan.PlanType planType = Plan.PlanType.valueOf(reader.readLine().trim());

            Plan plan = new Plan(user, days, planType);
            PlanImpl planImpl = new PlanImpl(plan);

            double[] actualCalorieIntake = Arrays.stream(reader.readLine().split(","))
                                                 .mapToDouble(Double::parseDouble)
                                                 .toArray();
            double[] actualExerciseTime = Arrays.stream(reader.readLine().split(","))
                                                .mapToDouble(Double::parseDouble)
                                                .toArray();

            planImpl.setActualCalorieIntakeForAll(actualCalorieIntake);
            planImpl.setActualExerciseTimeForAll(actualExerciseTime);

            return planImpl;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private User createUser(String userData) {
        String[] userFields = userData.split(",");
        int id = Integer.parseInt(userFields[0].trim());
        String name = userFields[1].trim();
        String password = userFields[2].trim();
        String email = userFields[3].trim();

        return new User(id, name, password, email);
    }
}

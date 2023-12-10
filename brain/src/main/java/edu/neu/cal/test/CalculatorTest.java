/*
*@Author:Jiani Lyu
*@Date:12-09-2023
*@Detail:Calculator Test, executable
*/


package edu.neu.cal.test;

import edu.neu.cal.calculators.CalorieCalculator;
import edu.neu.cal.calculators.DataRetriever;
import edu.neu.cal.calculators.NutrientCalculator;
import edu.neu.cal.domain.Food;
import edu.neu.cal.domain.UserProfile;
import edu.neu.cal.domain.PlanImpl;

import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {
    public static void main(String[] args) {
        // File paths for the data files
        String foodDataFile = "path/to/food_data.csv";
        String userDataFile = "path/to/user_data.csv";
        String planDataFile = "path/to/plan_data.csv";

        // Creating a DataRetriever instance
        DataRetriever dataRetriever = new DataRetriever(foodDataFile, userDataFile, planDataFile);

        // Using DataRetriever to get UserProfile and PlanImpl
        UserProfile userProfile = dataRetriever.getUserProfile();
        PlanImpl plan = dataRetriever.getPlan();

        // Displaying some user profile data
        System.out.println("User Profile: " + userProfile);

        // Creating a CalorieCalculator instance
        CalorieCalculator calorieCalculator = new CalorieCalculator(dataRetriever);

        // Calculate and display the average calorie intake
        double avgCalorieIntake = calorieCalculator.calculateAverageCalorieIntake();
        System.out.println("Average Daily Calorie Intake: " + avgCalorieIntake);

        // Creating a list of Food items for nutrient calculation
        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food(1, "Apple", 95, 0.5, 25, 0.3)); // Example food items
        foodList.add(new Food(2, "Chicken Breast", 165, 31, 0, 3.6));

        // Calculating and displaying nutrient intakes
        double totalCarbs = NutrientCalculator.calculateCarbohydrateIntake(foodList);
        double totalProtein = NutrientCalculator.calculateProteinIntake(foodList);
        double totalFat = NutrientCalculator.calculateFatIntake(foodList);

        System.out.println("Total Carbohydrate Intake: " + totalCarbs);
        System.out.println("Total Protein Intake: " + totalProtein);
        System.out.println("Total Fat Intake: " + totalFat);
    }
}

package edu.neu.Jiani;

import java.util.List;

// Assuming Food class is correctly placed inside the ProteinCalculator file
import edu.neu.Jiani.ProteinCalculator.Food;

public class Test {
    public static void main(String[] args) {
        // Retrieves user data, assuming this method exists and works correctly
        UserData user = DataRetriever.getUserData("userData.txt");

        // Retrieves food data, assuming this method exists and works correctly
        List<Food> foods = List.of(
            DataRetriever.getFoodData("Apple"),
            DataRetriever.getFoodData("Bread")
        );

        // Calculate the daily calorie, protein, and carbohydrate intake
        // Assumes that these methods are correctly implemented in their classes
        double dailyCalorie = CalorieCalculator.calculateDailyCalorie(user);
        double dailyProtein = ProteinCalculator.calculateProteinIntake(foods);
        double dailyCarbs = CarbohydrateCalculator.calculateCarbohydrateIntake(foods);

        // Outputs the daily intake values to the console
        System.out.println("Daily Calorie Intake: " + dailyCalorie);
        System.out.println("Daily Protein Intake: " + dailyProtein);
        System.out.println("Daily Carbohydrate Intake: " + dailyCarbs);
    }
}

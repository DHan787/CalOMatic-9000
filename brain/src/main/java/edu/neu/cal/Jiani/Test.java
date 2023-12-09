package edu.neu.Jiani;

import java.util.List;
import edu.neu.cal.Food.Food;

public class Test {
    public static void main(String[] args) {
        UserData user = DataRetriever.getUserData("userData.txt");

        List<Food> foods = List.of(
            DataRetriever.getFoodData("Apple"),
            DataRetriever.getFoodData("Bread")
        );


        double dailyCalorie = CalorieCalculator.calculateDailyCalorie(user);
        double dailyProtein = ProteinCalculator.calculateProteinIntake(foods);
        double dailyCarbs = CarbohydrateCalculator.calculateCarbohydrateIntake(foods);

        System.out.println("Daily Calorie Intake: " + dailyCalorie);
        System.out.println("Daily Protein Intake: " + dailyProtein);
        System.out.println("Daily Carbohydrate Intake: " + dailyCarbs);
    }
}

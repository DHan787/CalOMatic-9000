/*
*@Author:Jiani Lyu
*@Date:12-09-2023
*@Detail:Calculator Test, executable
*/


package edu.neu.cal.test;

import edu.neu.cal.calculators.CalorieCalculator;
import edu.neu.cal.calculators.DataFromDB;
import edu.neu.cal.calculators.NutrientCalculator;
import edu.neu.cal.domain.PlanImpl;

public class CalculatorTest {
    public static void main(String[] args) {

        // Creating a DataFromDB instance
        DataFromDB dataFromDB = new DataFromDB();

        // Creating a CalorieCalculator instance
        CalorieCalculator calorieCalculator = new CalorieCalculator(dataFromDB);

        // Using DataFromDB to get PlanImpl
        PlanImpl plan = dataFromDB.getPlan(); // Assuming DataFromDB has a method getPlan()

        // Displaying some plan data (if needed)
        // System.out.println("Plan: " + plan);

        // Calculate and display the average calorie intake
        double avgCalorieIntake = calorieCalculator.calculateAverageCalorieIntake();
        System.out.println("Average Daily Calorie Intake: " + avgCalorieIntake);

        // Creating a NutrientCalculator instance
        NutrientCalculator nutrientCalculator = new NutrientCalculator(dataFromDB);

        // Calculating and displaying nutrient intakes
        double totalCarbs = nutrientCalculator.calculateCarbohydrateIntake();
        double totalProtein = nutrientCalculator.calculateProteinIntake();
        double totalFat = nutrientCalculator.calculateFatIntake();

        System.out.println("Total Carbohydrate Intake: " + totalCarbs);
        System.out.println("Total Protein Intake: " + totalProtein);
        System.out.println("Total Fat Intake: " + totalFat);
    }
}

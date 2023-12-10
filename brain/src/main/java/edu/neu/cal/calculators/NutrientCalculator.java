/*
*@Author:Jiani Lyu
*@Date:12-09-2023
*@Detail:Nutrient Calculator
*/
package edu.neu.cal.calculators;

import edu.neu.cal.domain.Food;
import java.util.List;

public class NutrientCalculator{

    /**
     * Calculate the total carbohydrate intake.
     * @param foods List of food items.
     * @return Total carbohydrate intake.
     */
    public static double calculateCarbohydrateIntake(List<Food> foods) {
        double totalCarbs = 0.0;
        for (Food food : foods) {
            totalCarbs += food.getFoodCarb();
        }
        return totalCarbs;
    }

    /**
     * Calculate the total protein intake.
     * @param foods List of food items.
     * @return Total protein intake.
     */
    public static double calculateProteinIntake(List<Food> foods) {
        double totalProtein = 0.0;
        for (Food food : foods) {
            totalProtein += food.getFoodProtein();
        }
        return totalProtein;}

     /**
     * Calculate the total fat intake.
     * @param foods List of food items.
     * @return Total fat intake.
     */

    public static double calculateFatIntake(List<Food> foods) {
        double totalFat = 0.0;
        for (Food food : foods) {
            totalFat += food.getFoodFat();
        }
        return totalFat;
    }}



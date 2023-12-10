/*
*@Author:Jiani Lyu
*@Date:12-09-2023
*@Detail:Nutrient Calculator
*/
package edu.neu.cal.calculators;

import edu.neu.cal.domain.Food;
import java.util.List;

public class NutrientCalculator {

    private DataFromDB dataFromDB;

    public NutrientCalculator() {
        this.dataFromDB = new DataFromDB();
    }

    /**
     * Calculate the total carbohydrate intake.
     * @return Total carbohydrate intake.
     */
    public double calculateCarbohydrateIntake() {
        List<Food> foods = dataFromDB.getAllFoods();
        double totalCarbs = 0.0;
        for (Food food : foods) {
            totalCarbs += food.getFoodCarb();
        }
        return totalCarbs;
    }

    /**
     * Calculate the total protein intake.
     * @return Total protein intake.
     */
    public double calculateProteinIntake() {
        List<Food> foods = dataFromDB.getAllFoods();
        double totalProtein = 0.0;
        for (Food food : foods) {
            totalProtein += food.getFoodProtein();
        }
        return totalProtein;
    }

    /**
     * Calculate the total fat intake.
     * @return Total fat intake.
     */
    public double calculateFatIntake() {
        List<Food> foods = dataFromDB.getAllFoods();
        double totalFat = 0.0;
        for (Food food : foods) {
            totalFat += food.getFoodFat();
        }
        return totalFat;
    }
}

/*
*@Author:Jiani Lyu
*@Date:12-09-2023
*@Detail:Calorie Calculator
*/

package edu.neu.cal.calculators;

import edu.neu.cal.domain.HealthGoalPlan;
import edu.neu.cal.domain.HealthGoalPlanImpl;
import java.util.List;

public class CalorieCalculator {

    private DataFromDB dataFromDB;

    public CalorieCalculator(DataFromDB dataFromDB) {
        this.dataFromDB = dataFromDB;
    }

    /**
     * Calculates the total calorie intake for a specific day.
     * 
     * @param day The day for which to calculate the calorie intake.
     * @return The total calorie intake for the day.
     */
    // public double calculateDailyCalorieIntake(int day) {
    // HealthGoalPlanImpl plan = dataFromDB.getPlan();
    // if (day < 1 || day > plan.getActualCalorieIntake().length) {
    // throw new IllegalArgumentException("Invalid day: " + day);
    // }
    // return plan.getActualCalorieIntake()[day - 1];
    // }

    /**
     * Calculates the average calorie intake over the duration of the plan.
     * 
     * @return The average daily calorie intake.
     */
    // public double calculateAverageCalorieIntake() {
    // HealthGoalPlanImpl plan = dataFromDB.getPlan();
    // double[] calorieIntakes = plan.getActualCalorieIntake();
    // double total = 0;
    // for (double intake : calorieIntakes) {
    // total += intake;
    // }
    // return total / calorieIntakes.length;
    // }

    /**
     * Compares actual calorie intake with the planned calorie intake for a specific
     * day.
     * 
     * @param day The day to compare calorie intake.
     * @return The difference between actual and planned calorie intake.
     */
    // public double compareWithPlanCalorieIntake(int day) {
    // HealthGoalPlanImpl plan = dataFromDB.getPlan();
    // if (day < 1 || day > plan.getActualCalorieIntake().length) {
    // throw new IllegalArgumentException("Invalid day: " + day);
    // }
    // double actualIntake = plan.getActualCalorieIntake()[day - 1];
    // double plannedIntake = plan.getPlanCalorieIntake()[day - 1];
    // return actualIntake - plannedIntake;
    // }

}

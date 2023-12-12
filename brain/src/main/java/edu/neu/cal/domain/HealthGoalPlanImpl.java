/*
 * @Author: Jiang Han
 * @Date: 2023-11-27 17:10:52
 * @Description: 
 */
package edu.neu.cal.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import edu.neu.cal.calculators.CalorieCalculator2;

/**
 * @author Haipeng Wang
 * @since 2023/11/26
 */

// TODO: 这个类应该叫HealthGoalImpl，而不是PlanImpl，接口待完善
// TODO: 方法写注释
public class HealthGoalPlanImpl {
    /**
     * 计划信息
     */
    private HealthGoalPlan plan;
    /**
     * 实际食物摄入名称（列表）
     */
    private List<String>[] foodName;
    /**
     * 实际卡路里摄入量 (列表)
     */
    private List<Double>[] foodQuantities;
    /**
     * 实际卡路里摄入量（数组）
     */
    private double[] actualCalorieIntake;

    public HealthGoalPlanImpl(HealthGoalPlan plan) {
        this.plan = plan;
        actualCalorieIntake = new double[plan.getDays()];
        foodName = new ArrayList[plan.getDays()];
        foodQuantities = new ArrayList[plan.getDays()];
    }

    public HealthGoalPlanImpl() {
        actualCalorieIntake = new double[plan.getDays()];
        foodName = new ArrayList[plan.getDays()];
        foodQuantities = new ArrayList[plan.getDays()];
    }

    public HealthGoalPlan getHealthGoalPlan() {
        return this.plan;
    }

    public void resetHealthGoalPlan(HealthGoalPlan plan) {
        this.plan = plan;
        this.actualCalorieIntake = new double[plan.getDays()];
        this.foodName = new ArrayList[plan.getDays()];
        this.foodQuantities = new ArrayList[plan.getDays()];
    }

    public double[] getActualCalorieIntake() {
        return actualCalorieIntake;
    }

    public void setActualCalorieIntakeForAll(double[] actualCalorieIntake) {
        this.actualCalorieIntake = actualCalorieIntake;
    }

    public void setActualCalorieIntakeForOneDay(double actualCalorieIntake, int day) {
        this.actualCalorieIntake[day - 1] = actualCalorieIntake;
    }

    public void updateAllForOneDay(String[] foodName, double[] foodQuantities, int day) {
        if (day < 1 || day > this.plan.getDays()) {
            throw new ArithmeticException(
                    "Access denied - the day number must be between 1 and " + this.plan.getDays() + ".");
        }
        CalorieCalculator2 myCalculator = new CalorieCalculator2();
        double mycalorie = myCalculator.getTotalCaloriesByFoodNameandQuantities(foodName, foodQuantities);
        myCalculator.close();
        this.foodName[day - 1] = transferStringArrayIntoStringList(foodName);
        this.foodQuantities[day - 1] = transferDoubleArrayIntoDoubleList(foodQuantities);
        this.actualCalorieIntake[day - 1] = mycalorie;
    }

    public double[] getPlanCalorieIntake() {
        return this.plan.getPlanCalorieIntake();
    }

    public void setPlanCalorieIntake(double[] planCalorieIntake) {
        this.plan.setPlanCalorieIntake(planCalorieIntake);
    }

    public List<String>[] getAllFoodName() {
        return this.foodName;
    }

    public String[] getFoodNameForOneDay(int day) {
        return transferStringListIntoStringArray(foodName[day - 1]);
    }

    public void setFoodName(String[] foodName, int day) {
        this.foodName[day - 1] = transferStringArrayIntoStringList(foodName);
    }

    public List<Double>[] getAllFoodQuantities() {
        return this.foodQuantities;
    }

    public double[] getFoodQuantitiesForOneDay(int day) {
        return transferDoubleListIntoDoubleArray(foodQuantities[day - 1]);
    }

    public void setFoodQuantities(double[] foodQuantities, int day) {
        this.foodQuantities[day - 1] = transferDoubleArrayIntoDoubleList(foodQuantities);
    }

    private List<String> transferStringArrayIntoStringList(String[] a) {
        return Stream.of(a).collect(Collectors.toList());
    }

    private String[] transferStringListIntoStringArray(List<String> a) {
        return a.stream().toArray(String[]::new);
    }

    private List<Double> transferDoubleArrayIntoDoubleList(double[] a) {
        return Arrays.stream(a).boxed().collect(Collectors.toList());
    }

    private double[] transferDoubleListIntoDoubleArray(List<Double> a) {
        return a.stream().mapToDouble(Double::doubleValue).toArray();
    }

    public String toString() {
        return "PlanImpl{" +
                "plan = " + plan +
                ", actualCalorieIntake = " + Arrays.toString(actualCalorieIntake) +
                '}';
    }
}

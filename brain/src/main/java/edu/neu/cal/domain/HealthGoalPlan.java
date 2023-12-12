package edu.neu.cal.domain;

import java.util.Arrays;
import edu.neu.cal.domain.PrintContent;

/**
 * @author Haipeng Wang
 * @since 2023/11/26
 */

// TODO: 这个类应该叫HealthGoal，而不是Plan，接口待完善
public class HealthGoalPlan {
    /**
     * 用户信息
     */
    private UserProfile user;
    /**
     * 计划总时长
     */
    private int days;
    /**
     * 卡路里摄入计划值
     */
    private double[] planCalorieIntake;
    /**
     * 卡路里摄入计划值
     */
    private double calorieReducingRate;

    public HealthGoalPlan(UserProfile user, int days, double calorieReducingRate) {
        this.user = user;
        this.days = days;
        this.calorieReducingRate = calorieReducingRate;
        this.planCalorieIntake = calorieArraySetter();
    }

    public HealthGoalPlan(UserProfile user, int days) {
        this.user = user;
        this.days = days;
        this.calorieReducingRate = 0.1;
        this.planCalorieIntake = calorieArraySetter();
    }

    public HealthGoalPlan(UserProfile user, double calorieReducingRate) {
        this.user = user;
        this.days = 5;
        this.calorieReducingRate = calorieReducingRate;
        this.planCalorieIntake = calorieArraySetter();
    }

    public HealthGoalPlan(UserProfile user) {
        this.user = user;
        this.days = 5;
        this.calorieReducingRate = 0.1;
        this.planCalorieIntake = calorieArraySetter();
    }

    public void recommandation() {
        PrintContent p = new PrintContent();
        int j = (int) Math.floor(this.planCalorieIntake[0] / 100);
        switch (j) {
            case 10:
                p.c10();
                break;
            case 11:
                p.c11();
                break;
            case 12:
                p.c12();
                break;
            case 13:
                p.c13();
                break;
            case 14:
                p.c14();
                break;
            case 15:
                p.c15();
                break;
            case 16:
                p.c16();
                break;
            case 17:
                p.c17();
                break;
            case 18:
                p.c18();
                break;
            case 19:
                p.c19();
                break;
            default:
                p.c15();
                break;
        }
    }

    public UserProfile getUser() {
        return user;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double[] getPlanCalorieIntake() {
        return planCalorieIntake;
    }

    public void setPlanCalorieIntake(double[] planCalorieIntake) {
        this.planCalorieIntake = planCalorieIntake;
    }

    public void setPlanCalorieIntakeForOneDay(double planCalorieIntake, int day) {
        this.planCalorieIntake[day - 1] = planCalorieIntake;
    }

    public double getCalorieReducingRate() {
        return calorieReducingRate;
    }

    public void setCalorieReducingRate(double calorieReducingRate) {
        this.calorieReducingRate = calorieReducingRate;
    }

    /**
     * 计划的卡路里摄入计算
     * 
     * @return 每天的计划摄入卡路里（数组）
     */
    public double[] calorieArraySetter() {
        double[] calorie = new double[this.days];
        for (int index = 0; index < this.days; index++) {
            calorie[index] = this.user.getBmr() * (1 - this.calorieReducingRate);
        }
        return calorie;
    }

    /**
     * toString方法
     */
    public String toString() {
        return "Plan{" +
                "user = " + user.getUserName() +
                ", days = " + days +
                ", calorieReducingRate = " + calorieReducingRate +
                ", planCalorieIntake = " + Arrays.toString(planCalorieIntake) +
                '}';
    }
}
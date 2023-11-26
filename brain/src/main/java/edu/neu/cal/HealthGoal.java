package com.example;
import java.util.Arrays;

import com.example.Plan.PlanType;

class Plan {
    //用户信息
    private User user;
    //计划总天数
    private int days;
    //计划类型
    private PlanType planType;
    //计划卡路里摄入
    private double[] planCalorieIntake;
    //计划运动量
    private double[] planExerciseTime;

    public Plan(User user, int days, PlanType planType){
        this.user = user;
        this.days = days;
        this.planType = planType;
        this.planCalorieIntake = calorieCalculator();
        this.planExerciseTime = exerciseCalculator();
    }

    // getter和setter方法
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public PlanType getPlanType() {
        return planType;
    }

    public void setPlanType(PlanType planType) {
        this.planType = planType;
    }

    public double[] getPlanCalorieIntake() {
        return planCalorieIntake;
    }

    public void setPlanCalorieIntake(double[] planCalorieIntake) {
        this.planCalorieIntake = planCalorieIntake;
    }

    public double[] getPlanExerciseTime() {
        return planExerciseTime;
    }

    public void setPlanExerciseTime(double[] planExerciseTime) {
        this.planExerciseTime = planExerciseTime;
    }

    public enum PlanType {
        RUNNING,
        SWIMMING,
        WEIGHTLIFTING,
        YOGA
    }

    public double[] calorieCalculator(){
        return new double[this.days];
    }

    public double[] exerciseCalculator(){
        return new double[this.days];
    }

    public String toString() {
    return "TrainingPlan{" +
            "user=" + user +
            ", days=" + days +
            ", planType=" + planType +
            ", planCalorieIntake=" + Arrays.toString(planCalorieIntake) +
            ", planExerciseTime=" + Arrays.toString(planExerciseTime) +
            '}';
    }
}

class Implementation {
    //计划
    Plan plan;
    //实际摄入卡路里
    private double[] actualCalorieIntake;
    //实际运动时间
    private double[] actualExerciseTime;
    //体重记录
    private double[] weightRecord;

    public Implementation(Plan plan){
        this.plan = plan;
        actualCalorieIntake = new double[plan.getDays()];
        actualExerciseTime = new double[plan.getDays()];
        weightRecord = new double[plan.getDays()];
    }

    //setter and getter
    public double[] getActualCalorieIntake() {
        return actualCalorieIntake;
    }

    public void setActualCalorieIntakeForAll(double[] actualCalorieIntake) {
        this.actualCalorieIntake = actualCalorieIntake;
    }

    public void setActualCalorieIntakeForOneDay(double actualCalorieIntake, int day) {
        this.actualCalorieIntake[day-1] = actualCalorieIntake;
    }

    public double[] getActualExerciseTime() {
        return actualExerciseTime;
    }

    public void setActualExerciseTimeForALL(double[] actualExerciseTime) {
        this.actualExerciseTime = actualExerciseTime;
    }

    public void setActualExerciseTimeForOneDay(double actualExerciseTime, int day) {
        this.actualExerciseTime[day-1] = actualExerciseTime;
    }

    public double[] getWeightRecord() {
        return weightRecord;
    }

    public void setWeightRecordForALL(double[] weightRecord) {
        this.weightRecord = weightRecord;
    }
    public void setWeightRecordForOneDay(double weightRecord, int day) {
        this.weightRecord[day-1] = weightRecord;
    }
    public String toString() {
    return "UserPlan{" +
            "plan=" + plan +
            ", actualCalorieIntake=" + Arrays.toString(actualCalorieIntake) +
            ", actualExerciseTime=" + Arrays.toString(actualExerciseTime) +
            ", weightRecord=" + Arrays.toString(weightRecord) +
            '}';
}
}


public class HealthGoal {
    public static void main(String[] args) {
        User user1 = new User(22, "male", "Wang", 80.0, 1.85, 23);
        Plan plan = new Plan(user1, 30, PlanType.RUNNING);
        Implementation imp = new Implementation(plan);
        System.out.println(imp);
    }
}
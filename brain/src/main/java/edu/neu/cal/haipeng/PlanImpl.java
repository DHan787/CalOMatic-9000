package edu.neu.cal.haipeng;

import java.util.Arrays;

/**
 * @author Haipeng Wang
 * @since 2023/11/26
 */
class PlanImpl {
    /**
     * 计划信息
     */
    Plan plan;
    /**
     * 实际卡路里摄入量
     */
    private double[] actualCalorieIntake;
    /**
     * 实际运动量
     */
    private double[] actualExerciseTime;
    /**
     * 体重记录
     */
    private double[] weightRecord;

    public PlanImpl(Plan plan) {
        this.plan = plan;
        actualCalorieIntake = new double[plan.getDays()];
        actualExerciseTime = new double[plan.getDays()];
        weightRecord = new double[plan.getDays()];
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

    public double[] getActualExerciseTime() {
        return actualExerciseTime;
    }

    public void setActualExerciseTimeForAll(double[] actualExerciseTime) {
        this.actualExerciseTime = actualExerciseTime;
    }

    public void setActualExerciseTimeForOneDay(double actualExerciseTime, int day) {
        this.actualExerciseTime[day - 1] = actualExerciseTime;
    }

    public double[] getWeightRecord() {
        return weightRecord;
    }

    public void setWeightRecordForAll(double[] weightRecord) {
        this.weightRecord = weightRecord;
    }

    public void setWeightRecordForOneDay(double weightRecord, int day) {
        this.weightRecord[day - 1] = weightRecord;
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

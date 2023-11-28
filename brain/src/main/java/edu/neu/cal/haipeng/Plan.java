package edu.neu.cal.haipeng;
import java.util.Arrays;

/**
 * @author Haipeng Wang
 * @since 2023/11/26
 */
class Plan {
    /**
     * 用户信息
     */
    private User user;
    /**
     * 计划总时长
     */
    private int days;
    /**
     * 计划类型
     */
    private PlanType planType;
    /**
     * 卡路里摄入计划值
     */
    private double[] planCalorieIntake;
    /**
     * 运动量计划值
     */
    private double[] planExerciseTime;

    public Plan(User user, int days, PlanType planType){
        this.user = user;
        this.days = days;
        this.planType = planType;
        this.planCalorieIntake = calorieCalculator();
        this.planExerciseTime = exerciseCalculator();
    }

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

    /**
     * 计划类型
     */
    public enum PlanType {
        /**
         * 跑步
         */
        RUNNING,
        /**
         * 游泳
         */
        SWIMMING,
        /**
         * 引体向上
         */
        WEIGHTLIFTING,
        /**
         * 瑜伽
         */
        YOGA
    }

    /**
     * 卡路里计算器(未完成)
     * @return 总卡路里摄入量
     */
    public double[] calorieCalculator(){
        return new double[this.days];
    }

    /**
     * 运动量计算器（未完成）
     * @return 总运动量
     */
    public double[] exerciseCalculator(){
        return new double[this.days];
    }

    /**
     * toString方法
     */
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
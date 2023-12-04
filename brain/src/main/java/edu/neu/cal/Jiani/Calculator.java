/*
*@Author:Jiani
*@Date:11-28-2023
*@Detail:Calorie Calculator in metric
*/

package edu.neu.cal.jiani;

public class Calculator {
    public static void main(String[] args) {

        UserData user = new UserData("Male", 25, 175, 70, 2500, "3");
        // 假设已经有用户数据，这里创建一个 UserData 实例
        double BMR = 0;
        // 初始化 BMR 变量
        if ("Male".equals(user.getGender())) {
            // 根据性别计算 BMR
            BMR = 66.5 + (13.75 * user.getWeight()) + (5.003 * user.getHeight()) - (6.75 * user.getAge());
        } else if ("Female".equals(user.getGender())) {
            BMR = 655.1 + (9.563 * user.getWeight()) + (1.850 * user.getHeight()) - (4.676 * user.getAge());
        }

        double totalCalories = 0;
        // 初始化总热量变量
        switch (user.getExercise()) {
            // 根据运动水平计算总热量
            case "nothing":
                totalCalories = user.getFoodCalories() - BMR;
                break;
            case "1":
                totalCalories = user.getFoodCalories() - (BMR * 1.375);
                break;
            case "2":
                totalCalories = user.getFoodCalories() - (BMR * 1.55);
                break;
            case "3":
                totalCalories = user.getFoodCalories() - (BMR * 1.725);
                break;
            case "4":
                totalCalories = user.getFoodCalories() - (BMR * 1.9);
                break;
        }
        // 计算用户的 BMR 和一天总热量
        System.out.println("User's BMR is: " + BMR + " calories");
        System.out.println("User's total number of calories in a day is: " + totalCalories + " calories");
    }
}
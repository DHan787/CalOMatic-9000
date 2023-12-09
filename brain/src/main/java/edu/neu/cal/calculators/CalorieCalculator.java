/*
*@Author:Jiani
*@Date:11-28-2023
*@Detail:Calorie Calculator in metric
*/

package edu.neu.cal.calculators;

import edu.neu.cal.dao.UserDao;
import edu.neu.cal.domain.User;

public class CalorieCalculator {

    // TODO: 主类单独拿出来
    public static void main(String[] args) {
        // Create a user with specified parameters
        // TODO:你看看这是user还是userprofile
        User user = new User("Male", 25, 175, 70, 2500, "3");

        double BMR = calculateBMR(user);
        double totalCalories = calculateTotalCalories(user, BMR);

        // Output results
        System.out.println("用户的基础代谢率 (BMR) 是: " + BMR + " 卡路里");
        System.out.println("用户一天的总热量是: " + totalCalories + " 卡路里");
    }

    // BMR 为什么会在计算器里，这个是不是应该在用户的profile里面
    // Calculate BMR method
    private static double calculateBMR(User user) {
        double BMR = 0;

        if (user.getSex().equals("male")) {
            // Male BMR calculation formula
            BMR = 88.362 + (13.397 * user.getWeight()) + (4.799 * user.getHeight()) - (5.677 * user.getAge());
        } else if (user.getSex().equals("female")) {
            // Female BMR calculation formula
            BMR = 447.593 + (9.247 * user.getWeight()) + (3.098 * user.getHeight()) - (4.330 * user.getAge());
        }

        return BMR;
    }

    // Calculate total calories method
    private static double calculateTotalCalories(User user, double BMR) {
        double totalCalories = 0;

        switch (user.getExerciseLevel()) {
            case "NOTHING":
                // No exercise
                break;
            case "LOW":
                // Low-intensity exercise
                break;
            // ... Other cases
            default:
                // Default case, return 0 for now
                return 0;
        }

        return totalCalories;
    }
}

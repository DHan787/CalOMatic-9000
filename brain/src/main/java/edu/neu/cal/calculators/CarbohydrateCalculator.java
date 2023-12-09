/*
 * @Author: Jiang Han
 * @Date: 2023-12-08 23:56:44
 * @Description: 
 */
package edu.neu.cal.calculators;

import java.util.List;

import edu.neu.cal.domain.Food;

//TODO: 这个类应该叫NutrientCalculator，而不是CarbohydrateCalculator，接口待完善，可以计算其他各种摄入，参考food类的属性
public class CarbohydrateCalculator {
    public static double calculateCarbohydrateIntake(List<Food> foods) {
        double totalCarbs = 0.0;
        for (Food food : foods) {
            totalCarbs += food.getCarbohydrate();
        }
        return totalCarbs;
    }
}

// class Food
// private String name;
// private double protein;
// private double carbohydrate;

// public Food(String name, double protein, double carbohydrate) {
// this.name = name;
// this.protein = protein;
// this.carbohydrate = carbohydrate;
// }

// public String getName() {
// return name;
// }

// // Setter for name
// public void setName(String name) {
// this.name = name;
// }

// // Getter for protein
// public double getProtein() {
// return protein;
// }

// // Setter for protein
// public void setProtein(double protein) {
// this.protein = protein;
// }

// // Getter for carbohydrate
// public double getCarbohydrate() {
// return carbohydrate;
// }

// // Setter for carbohydrate
// public void setCarbohydrate(double carbohydrate) {
// this.carbohydrate = carbohydrate;

// public double getCarbohydrate() {
// return carbohydrate;
// }

// public void setCarbohydrate(double carbohydrate) {
// this.carbohydrate = carbohydrate;
// }
// }

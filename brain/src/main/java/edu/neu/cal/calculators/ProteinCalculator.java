/*
 * @Author: Jiang Han
 * @Date: 2023-12-08 23:56:44
 * @Description: 
 */
package edu.neu.cal.calculators;

import java.util.List;

import edu.neu.cal.domain.Food;

// TODO：试着整合到一个nutrientCalculator里面
public class ProteinCalculator {
    public static double calculateProteinIntake(List<Food> foods) {
        double totalProtein = 0.0;
        for (Food food : foods) {
            totalProtein += food.getProtein();
        }
        return totalProtein;
    }

    public class Food {
        private String name;
        private double protein; // Protein content in grams

        public Food(String name, double protein) {
            this.name = name;
            this.protein = protein;
        }

        // Getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getProtein() {
            return protein;
        }

        public void setProtein(double protein) {
            this.protein = protein;
        }
    }

}

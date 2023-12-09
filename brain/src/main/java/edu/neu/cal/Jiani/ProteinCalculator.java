package edu.neu.Jiani;

import java.util.List;

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

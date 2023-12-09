package edu.neu.cal.Jiani;

import edu.neu.cal.Food.Food;
import java.util.List;

public class CarbohydrateCalculator {
    public static double calculateCarbohydrateIntake(List<Food> foods) {
        double totalCarbs = 0.0;
        for (Food food : foods) {
            totalCarbs += food.getCarbohydrate();
        }
        return totalCarbs;
    }
}

class Food 
    private String name;
    private double protein; 
    private double carbohydrate; 

    public Food(String name, double protein, double carbohydrate) {
        this.name = name;
        this.protein = protein;
        this.carbohydrate = carbohydrate;
    }

    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for protein
    public double getProtein() {
        return protein;
    }

    // Setter for protein
    public void setProtein(double protein) {
        this.protein = protein;
    }

    // Getter for carbohydrate
    public double getCarbohydrate() {
        return carbohydrate;
    }

    // Setter for carbohydrate
    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}

package edu.neu.cal.Hongkai;

public class FoodEntry {
    private int id;
    private String foodName;
    private int calories;
    private String protein;

    public FoodEntry(int id, String foodName, int calories, String protein) {
        this.id = id;
        this.foodName = foodName;
        this.calories = calories;
        this.protein = protein;
    }

    public int getId() {
        return id;
    }

    public int getCalories() {
        return calories;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getProtein() {
        return protein;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }
}

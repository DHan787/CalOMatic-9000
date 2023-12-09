package edu.neu.cal.Food;

/ 定义一个公共类Food
// Defines a public class named Food.
public class Food {
    private int foodId; // 食物条目的唯一标识符 Unique identifier for the food entry
    private String foodName; // 食物名称 Name of the food
    private int calories; // 食物的卡路里含量 Caloric content
    private double foodProtein; // 食物的蛋白质含量 Protein content
    private double foodCarb; // 食物的碳水化合物含量 Carbohydrate content
    private double foodFat; // 食物的脂肪含量 Fat content

    // 构造函数
    // Constructor
    public Food(int foodId, String foodName, int calories, double foodProtein, double foodCarb, double foodFat) {
        this.foodId = foodId; // 初始化食物ID Initialize foodId
        this.foodName = foodName; // 初始化食物名称 Initialize foodName
        this.calories = calories; // 初始化卡路里 Initialize calories
        this.foodProtein = foodProtein; // 初始化蛋白质含量 Initialize foodProtein
        this.foodCarb = foodCarb; // 初始化碳水化合物含量 Initialize foodCarb
        this.foodFat = foodFat; // 初始化脂肪含量 Initialize foodFat
    }

    // Getters
    public int getFoodId() {
        return foodId; // 获取食物ID Get foodId
    }

    public String getFoodName() {
        return foodName; // 获取食物名称 Get foodName
    }

    public int getCalories() {
        return calories; // 获取卡路里 Get calories
    }

    public double getFoodProtein() {
        return foodProtein; // 获取蛋白质含量 Get foodProtein
    }

    public double getFoodCarb() {
        return foodCarb; // 获取碳水化合物含量 Get foodCarb
    }

    public double getFoodFat() {
        return foodFat; // 获取脂肪含量 Get foodFat
    }

    // Setters
    public void setFoodId(int foodId) {
        this.foodId = foodId; // 设置食物ID Set foodId
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName; // 设置食物名称 Set foodName
    }

    public void setCalories(int calories) {
        this.calories = calories; // 设置卡路里 Set calories
    }

    public void setFoodProtein(double foodProtein) {
        this.foodProtein = foodProtein; // 设置蛋白质含量 Set foodProtein
    }

    public void setFoodCarb(double foodCarb) {
        this.foodCarb = foodCarb; // 设置碳水化合物含量 Set foodCarb
    }

    public void setFoodFat(double foodFat) {
        this.foodFat = foodFat; // 设置脂肪含量 Set foodFat
    }
}


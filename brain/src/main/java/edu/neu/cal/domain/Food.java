/*
 * @Author: Jiang Han
 * @Date: 2023-12-08 23:06:33
 * @Description: 
 */
package edu.neu.cal.domain;

// 定义一个公共类Food

public class Food {

    /** 食物ID Food ID */
    private int foodId;
    /** 食物名称 Name of the food */
    private String foodName;

    /** 食物的卡路里含量 Caloric content */
    private int calories;

    /** 食物的蛋白质含量 Protein content */
    private double foodProtein;

    /** 食物的碳水化合物含量 Carbohydrate content */
    private double foodCarb;

    /** 食物的脂肪含量 Fat content */
    private double foodFat;

    /**
     * 构造函数 Constructor
     * 
     * @param foodId      初始化食物ID Initialize foodId
     * @param foodName    初始化食物名称 Initialize foodName
     * @param calories    初始化卡路里 Initialize calories
     * @param foodProtein 初始化蛋白质含量 Initialize foodProtein
     * @param foodCarb    初始化碳水化合物含量 Initialize foodCarb
     * @param foodFat     初始化脂肪含量 Initialize foodFat
     */
    public Food(int foodId, String foodName, int calories, double foodProtein, double foodCarb, double foodFat) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.calories = calories;
        this.foodProtein = foodProtein;
        this.foodCarb = foodCarb;
        this.foodFat = foodFat;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getFoodProtein() {
        return foodProtein;
    }

    public void setFoodProtein(double foodProtein) {
        this.foodProtein = foodProtein;
    }

    public double getFoodCarb() {
        return foodCarb;
    }

    public void setFoodCarb(double foodCarb) {
        this.foodCarb = foodCarb;
    }

    public double getFoodFat() {
        return foodFat;
    }

    public void setFoodFat(double foodFat) {
        this.foodFat = foodFat;
    }
}

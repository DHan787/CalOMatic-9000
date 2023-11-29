/*
*@Author:Jiani
*@Date:11-28-2023
*@Detail:Calorie Calculator in metric
*/

package edu.neu;

public class UserData {
    private String gender;
    private float age;
    private float height;
    private float weight;
    private double foodCalories;
    private String exercise;


    public UserData(String gender, float age, float height, float weight, double foodCalories, String exercise) {
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.foodCalories = foodCalories;
        this.exercise = exercise;
    }
    // 获取用户性别
    public String getGender() {
        return gender;
    }
    // 获取用户年龄
    public float getAge() {
        return age;
    }
    // 获取用户身高
    public float getHeight() {
        return height;
    }
    // 获取用户体重
    public float getWeight() {
        return weight;
    }
    // 获取用户食物卡路里摄入
    public double getFoodCalories() {
        return foodCalories;
    }
    // 获取用户运动水平
    public String getExercise() {
        return exercise;
    }
}
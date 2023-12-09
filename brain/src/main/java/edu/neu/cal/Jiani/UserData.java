/*
*@Author:Jiani
*@Date:11-28-2023
*@Detail:Calorie Calculator in metric
*/

package edu.neu.Jiani;

public class UserData {
    private Gender gender; 
    private float age;     
    private float height;  
    private float weight;  
    private double foodCalories;
    private ExerciseLevel exercise; 

    public UserData(Gender gender, float age, float height, float weight, double foodCalories, ExerciseLevel exercise) {
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.foodCalories = foodCalories;
        this.exercise = exercise;
    }

    public Gender getGender() {
        return gender;
    }

    public ExerciseLevel getExercise() {
        return exercise;
    }
}

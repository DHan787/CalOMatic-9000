package edu.neu.Jiani;

import edu.neu.cal.Food.Food;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DataRetriever {

    public static UserData getUserData(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine(); // Reads the first line from userData.txt
            if (line != null) {
                String[] data = line.split(",");
                // Assuming the order is Name, Gender, Age, Height, Weight
                String name = data[0];
                String gender = data[1];
                int age = Integer.parseInt(data[2].trim());
                double height = Double.parseDouble(data[3].trim());
                double weight = Double.parseDouble(data[4].trim());
                // Create a new UserData object with the fetched data
                return new UserData(name, gender, age, height, weight);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null; // Or handle this with a custom exception or default value
    }
public static Map<String, Food> getAllFoodData(String filename) {
        Map<String, Food> foodMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                // Assuming the order is ID, Name, Calories, Protein, Carbs, Fat
                int foodId = Integer.parseInt(data[0].trim());
                String foodName = data[1];
                int calories = Integer.parseInt(data[2].trim());
                double protein = Double.parseDouble(data[3].trim());
                double carbs = Double.parseDouble(data[4].trim());
                double fat = Double.parseDouble(data[5].trim());
                Food food = new Food(foodId, foodName, calories, protein, carbs, fat);
                foodMap.put(foodName, food);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return foodMap; // Returns a map with food name as key and Food object as value
    }

    // Fetch individual Food data
 public static Food getFoodData(String foodName) {
        Map<String, Food> foodMap = getAllFoodData("foodData.txt");
        return foodMap.get(foodName); // Returns the Food object for the given food name
    }
}

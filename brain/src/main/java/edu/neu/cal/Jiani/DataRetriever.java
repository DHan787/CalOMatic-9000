package edu.neu.cal.Jiani;

import edu.neu.cal.Food.Food;
import edu.neu.cal.Hongkai.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DataRetriever {

    private Map<String, Food> foodMap;

    public DataRetriever(String filename) {
        foodMap = getAllFoodData(filename);
    }

    private Map<String, Food> getAllFoodData(String filename) {
        Map<String, Food> foodMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); 
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int foodId = Integer.parseInt(data[0].trim());
                String fName = data[1].trim(); 
                int calories = Integer.parseInt(data[2].trim());
                double protein = Double.parseDouble(data[3].trim());
                double carbs = Double.parseDouble(data[4].trim());
                double fat = Double.parseDouble(data[5].trim());
                foodMap.put(fName, new Food(foodId, fName, calories, protein, carbs, fat));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return foodMap;
    }

    public Food getFoodData(String foodName) {
        return foodMap.get(foodName);
    }
    public static User getUserData(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine(); // Read the header line
            line = reader.readLine(); // Read the first line of actual data
            if (line != null) {
                String[] userData = line.split(",");
                int age = Integer.parseInt(userData[0].trim());
                String sex = userData[1].trim();
                String userName = userData[2].trim();
                double weight = Double.parseDouble(userData[3].trim());
                double height = Double.parseDouble(userData[4].trim());
                double bodyFatRate = Double.parseDouble(userData[5].trim());

                // Determine the correct constructor to use based on the sex format
                if (sex.equals("male") || sex.equals("female")) {
                    return new User(age, sex, userName, weight, height, bodyFatRate);
                } else {
                    int sexInt = Integer.parseInt(sex);
                    return new User(age, sexInt, userName, weight, height, bodyFatRate);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null; // Return null or throw a custom exception as needed
    }
    }

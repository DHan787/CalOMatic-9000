/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 03:25:03
 * @Description: 
 */
package edu.neu.cal.controller;

import java.util.Scanner;

import com.google.protobuf.Type;

import edu.neu.cal.dao.FoodDao;
import edu.neu.cal.domain.Food;
import edu.neu.cal.domain.FoodEntry;
import edu.neu.cal.domain.User;
import edu.neu.cal.main.CalOMatic9000;
import edu.neu.cal.utils.InputHandler;
import edu.neu.cal.utils.TypewriterEffectPrinter;

public class FoodEntryController {

    private static User user;

    private static FoodEntry foodEntry;

    static FoodDao foodDao;

    Food food;

    public static void defaultOperation() {

        user = CalOMatic9000.getUser();
        // ask the user what do they have today
        // ask the user how much do they have today

        Scanner scanner = new Scanner(System.in);
        TypewriterEffectPrinter.println("What do you have today?");

        Boolean operation = true;

        while (operation) {

            TypewriterEffectPrinter.println("Type each item and press enter to confirm, type \"exit\" to exit");

            String input = "";
            if (scanner.hasNext()) {
                input = scanner.nextLine();
            } else {
                break;
            }
            // 检查用户是否输入了 "exit"
            if ("exit".equalsIgnoreCase(input.trim())) {
                System.out.println("Exiting...");
                break; // 退出 while 循环
            }
            foodEntry = new FoodEntry();
            if (foodEntry.findFood(input)) {
                TypewriterEffectPrinter.println("How much do you have?");
                String amount = "";
                if (scanner.hasNext()) {
                    amount = scanner.nextLine();
                    while (!InputHandler.handleInput(amount, Double.class, Double::parseDouble)) {
                        TypewriterEffectPrinter.println("Invalid input, please try again!");
                        amount = scanner.nextLine();
                    }
                } else {
                    break;
                }

                double amountDouble = Double.parseDouble(amount);
                foodEntry.addFood(user.getId(), input, amountDouble);

            } else {
                TypewriterEffectPrinter.println("Sorry, we don't have this food in our database");
                TypewriterEffectPrinter.println("Do you want to add this food to our database?");
                TypewriterEffectPrinter.println("1. Yes | 2. No");
                String addFood = "";
                if (scanner.hasNext()) {
                    addFood = scanner.nextLine();
                } else {
                    break;
                }

                switch (addFood) {
                    case "1":
                        addNewFood();
                        break;
                    case "2":
                        break;
                    default:
                        TypewriterEffectPrinter.println("Invalid input, please try again");
                        break;
                }

            }
        }
    }

    public static void addNewFood() {
        Scanner scanner = new Scanner(System.in);
        foodDao = new FoodDao();
        TypewriterEffectPrinter.println("Please enter the name of this food");
        String name = "";
        name = scanner.nextLine();
        TypewriterEffectPrinter.println("Please enter the calories of this food");
        String calories = "";
        calories = scanner.nextLine();
        TypewriterEffectPrinter.println("Please enter the carbohydrates of this food");
        String carbohydrates = "";
        carbohydrates = scanner.nextLine();
        TypewriterEffectPrinter.println("Please enter the protein of this food");
        String protein = "";
        protein = scanner.nextLine();
        TypewriterEffectPrinter.println("Please enter the fat of this food");
        String fat = "";
        fat = scanner.nextLine();

        Food food = new Food(name, calories, carbohydrates, protein, fat);

        FoodDao foodDao = new FoodDao();
        foodDao.addFood(food);
    }
}

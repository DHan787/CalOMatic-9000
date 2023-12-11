/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 03:14:54
 * @Description: 
 */
/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 03:14:54
 * @Description: 
 */
/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 03:14:54
 * @Description: 
 */
package edu.neu.cal.main;

import java.util.Scanner;

import com.google.protobuf.Type;

import edu.neu.cal.controller.AdvisorController;
import edu.neu.cal.controller.CalorieController;
import edu.neu.cal.controller.FoodEntryController;
import edu.neu.cal.controller.UserProfileController;
import edu.neu.cal.domain.User;
import edu.neu.cal.utils.TypewriterEffectPrinter;

public class afterLoginService {

    public static void afterLogin() {
        // ask the user what they want to do next
        // 1. check or change the user profile
        // 2. check the calories intake history
        // 3. input the food they eat today
        // 4. get the dietary advice
        boolean operation = true;

        TypewriterEffectPrinter.println("What can CalOMatic do for you?");
        TypewriterEffectPrinter.println("1. Check or change the user profile");
        TypewriterEffectPrinter.println("2. Check the calories intake history");
        TypewriterEffectPrinter.println("3. Input the food you eat today");
        TypewriterEffectPrinter.println("4. Get the dietary advice");
        TypewriterEffectPrinter.println("5. Exit");

        try (Scanner scanner = new Scanner(System.in)) {
            while (operation) {
                String input = scanner.nextLine();

                // 检查用户是否输入了 "exit"
                if ("exit".equalsIgnoreCase(input.trim())) {
                    System.out.println("Exiting...");
                    break; // 退出 while 循环
                }

                // 将输入转换为整数，用于 switch 语句
                int CaseOperation;
                try {
                    CaseOperation = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input, please enter a number or 'exit' to quit.");
                    continue; // 跳过当前循环的剩余部分
                }

                switch (CaseOperation) {
                    case 1:
                        UserProfileController.defaultOperation();
                        break;
                    case 2:
                        CalorieController.defaultOperation();
                        break;
                    case 3:
                        FoodEntryController.defaultOperation();
                        break;
                    case 4:
                        AdvisorController.defaultOperation();
                        break;
                    case 5:
                        TypewriterEffectPrinter.println("Now exiting...");
                        operation = false;
                        break;
                    default:
                        System.out.println("Invalid operation, re-enter!");
                }
            }
        }
    }

}

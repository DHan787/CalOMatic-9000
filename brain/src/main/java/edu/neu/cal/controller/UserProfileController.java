/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 03:22:11
 * @Description: 
 */
package edu.neu.cal.controller;

import java.util.Scanner;

import edu.neu.cal.dao.UserDao;
import edu.neu.cal.dao.UserProfileDao;
import edu.neu.cal.domain.User;
import edu.neu.cal.domain.UserProfile;
import edu.neu.cal.main.CalOMatic9000;
import edu.neu.cal.utils.InputHandler;
import edu.neu.cal.utils.TypewriterEffectPrinter;

public class UserProfileController {
    private static User user;
    private static UserProfile userprofile;
    private static UserProfileDao userProfileDao;

    public static void defaultOperation() {
        Scanner scanner = new Scanner(System.in);
        // 让用户选择操作
        // 1. 查看个人信息
        // 2. 修改个人信息
        // 3. 返回上一级
        // 4. 退出系统
        while (true) {
            boolean operation = true;
            while (operation) {

                TypewriterEffectPrinter.println("Please select your operation:");
                TypewriterEffectPrinter.println("1. View your profile.");
                TypewriterEffectPrinter.println("2. Modify your profile");
                TypewriterEffectPrinter.println("3. Back to previous menu");
                TypewriterEffectPrinter.println("4. Exit");
                String input = "";
                if (scanner.hasNext()) {
                    input = scanner.nextLine();
                } else {
                    break;
                }

                // 检查用户是否输入了 "exit"
                if ("exit".equalsIgnoreCase(input.trim())) {
                    TypewriterEffectPrinter.println("Exiting...");
                    break; // 退出 while 循环
                }

                // 将输入转换为整数，用于 switch 语句
                int CaseOperation;
                try {
                    CaseOperation = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    TypewriterEffectPrinter.println("Invalid input, please enter a number or 'exit' to quit.");
                    continue; // 跳过当前循环的剩余部分
                }
                switch (CaseOperation) {
                    case 1:
                        viewProfile();
                        break;
                    case 2:
                        modifyProfile();
                        break;
                    case 3:
                        operation = false;
                        return;
                    case 4:
                        System.exit(0);
                    default:
                        TypewriterEffectPrinter.println("Invalid input, please try again.");
                        break;
                }
                // scanner.close();
            }
        }
    }

    private static void modifyProfile() {// ask the user what they want to do next
        // 1.change their name
        // 2.change their age
        // 3.change their height
        // 4.change their weight
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean operation = true;
            while (operation) {

                TypewriterEffectPrinter.println("Please select your operation:");
                TypewriterEffectPrinter.println("1. Change your name");
                TypewriterEffectPrinter.println("2. Change your age");
                TypewriterEffectPrinter.println("3. Change your height");
                TypewriterEffectPrinter.println("4. Change your weight");
                TypewriterEffectPrinter.println("5. Change your bodyfatrate ");
                TypewriterEffectPrinter.println("6. Back to previous menu");

                String input = "";
                if (scanner.hasNext()) {
                    input = scanner.nextLine();
                } else {
                    break;
                }

                // 检查用户是否输入了 "exit"
                if ("exit".equalsIgnoreCase(input.trim())) {
                    TypewriterEffectPrinter.println("Exiting...");
                    break; // 退出 while 循环
                }

                // 将输入转换为整数，用于 switch 语句
                int CaseOperation;
                try {
                    CaseOperation = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    TypewriterEffectPrinter.println("Invalid input, please enter a number or 'exit' to quit.");
                    continue; // 跳过当前循环的剩余部分
                }
                switch (CaseOperation) {
                    case 1:
                        modifyName();
                        break;
                    case 2:
                        modifyAge();
                        break;
                    case 3:
                        modifyHeight();
                        break;
                    case 4:
                        modifyWeight();
                        break;
                    case 5:
                        modifyBodyfatrate();
                        break;
                    case 6:
                        operation = false;
                        return;
                    default:
                        TypewriterEffectPrinter.println("Invalid input, please try again.");
                        break;
                }
                // scanner.close();
            }
        }
    }

    private static void modifyBodyfatrate() {
        user = CalOMatic9000.getUser();
        Scanner scanner = new Scanner(System.in);
        TypewriterEffectPrinter.println("Please enter your new bodyfatrate:");
        String input = scanner.next();
        while (!InputHandler.handleInput(input, Double.class, Double::valueOf)) {
            TypewriterEffectPrinter.println("Input incorrect, Please enter your new bodyfatrate:");
            input = scanner.next();
        }
        double newBodyfatrate = Double.parseDouble(input);
        TypewriterEffectPrinter.println("Do you want to change your bodyfatrate to " + newBodyfatrate + "?");
        TypewriterEffectPrinter.println("Please enter 'yes' or 'no'");
        input = scanner.next();
        if ("yes".equalsIgnoreCase(input.trim())) {
            UserProfileDao userProfileDao = new UserProfileDao();
            userProfileDao.updateBodyfatrate(user.getname(), newBodyfatrate);
            userProfileDao.close();
        } else if ("no".equalsIgnoreCase(input.trim())) {
            TypewriterEffectPrinter.println("Now redirect to previous menu!");
        } else {
            TypewriterEffectPrinter.println("Invalid input, please try again.");
        }
    }

    private static void modifyHeight() {
        user = CalOMatic9000.getUser();
        Scanner scanner = new Scanner(System.in);
        TypewriterEffectPrinter.println("Please enter your new height:");
        String input = scanner.next();
        while (!InputHandler.handleInput(input, Double.class, Double::valueOf)) {
            TypewriterEffectPrinter.println("Input incorrect, Please enter your new height:");
            input = scanner.next();
        }
        double newHeight = Double.parseDouble(input);
        TypewriterEffectPrinter.println("Do you want to change your height to " + newHeight + "?");
        TypewriterEffectPrinter.println("Please enter 'yes' or 'no'");
        input = scanner.next();
        if ("yes".equalsIgnoreCase(input.trim())) {
            UserProfileDao userProfileDao = new UserProfileDao();
            userProfileDao.updateHeight(user.getname(), newHeight);
            userProfileDao.close();
        } else if ("no".equalsIgnoreCase(input.trim())) {
            TypewriterEffectPrinter.println("Now redirect to previous menu!");
        } else {
            TypewriterEffectPrinter.println("Invalid input, please try again.");
        }
        // scanner.close();
    }

    private static void modifyWeight() {
        user = CalOMatic9000.getUser();
        Scanner scanner = new Scanner(System.in);
        TypewriterEffectPrinter.println("Please enter your new weight:");
        String input = scanner.next();
        while (!InputHandler.handleInput(input, Double.class, Double::valueOf)) {
            TypewriterEffectPrinter.println("Input incorrect, Please enter your new weight:");
            input = scanner.next();
        }
        double newWeight = Double.parseDouble(input);
        TypewriterEffectPrinter.println("Do you want to change your weight to " + newWeight + "?");
        TypewriterEffectPrinter.println("Please enter 'yes' or 'no'");
        input = scanner.next();
        if ("yes".equalsIgnoreCase(input.trim())) {
            UserProfileDao userProfileDao = new UserProfileDao();
            userProfileDao.updateWeight(user.getname(), newWeight);
            userProfileDao.close();
        } else if ("no".equalsIgnoreCase(input.trim())) {
            TypewriterEffectPrinter.println("Now redirect to previous menu!");
        } else {
            TypewriterEffectPrinter.println("Invalid input, please try again.");
        }
        // scanner.close();

    }

    private static void modifyAge() {
        user = CalOMatic9000.getUser();
        Scanner scanner = new Scanner(System.in);
        TypewriterEffectPrinter.println("Please enter your new age:");
        String input = scanner.next();
        while (!InputHandler.handleInput(input, Integer.class, Integer::valueOf)) {
            TypewriterEffectPrinter.println("Input incorrect, Please enter your new age:");
            input = scanner.next();
        }
        int newAge = Integer.parseInt(input);
        TypewriterEffectPrinter.println("Do you want to change your age to " + newAge + "?");
        TypewriterEffectPrinter.println("Please enter 'yes' or 'no'");
        input = scanner.next();
        while (input != "yes" && input != "no") {
            TypewriterEffectPrinter.println("Invalid input, please try again.");
            input = scanner.next();
        }
        if ("yes".equalsIgnoreCase(input.trim())) {
            UserProfileDao userProfileDao = new UserProfileDao();
            userProfileDao.updateAge(user.getname(), newAge);
            userProfileDao.close();
        } else {
            TypewriterEffectPrinter.println("Now redirect to previous menu!");
        }
        // scanner.close();
    }

    private static void addUserProfile() {
        user = CalOMatic9000.getUser();
        System.out.println(user.toString());
        Scanner scanner = new Scanner(System.in);
        TypewriterEffectPrinter.println("Please enter your age:");
        String input = scanner.next();
        while (!InputHandler.handleInput(input, Integer.class, Integer::valueOf)) {
            TypewriterEffectPrinter.println("Input incorrect, Please enter your age:");
            input = scanner.next();
        }
        int age = Integer.parseInt(input);

        TypewriterEffectPrinter.println("Please enter your height:");
        input = scanner.next();
        while (!InputHandler.handleInput(input, Double.class, Double::valueOf)) {
            TypewriterEffectPrinter.println("Input incorrect, Please enter your height:");
            input = scanner.next();
        }
        double height = Double.parseDouble(input);

        TypewriterEffectPrinter.println("Please enter your weight:");
        input = scanner.next();
        while (!InputHandler.handleInput(input, Double.class, Double::valueOf)) {
            TypewriterEffectPrinter.println("Input incorrect, Please enter your weight:");
            input = scanner.next();
        }
        double weight = Double.parseDouble(input);

        // sex
        TypewriterEffectPrinter.println("Please enter your sex: male or female");
        // check the input is valid or not
        String sex = scanner.next();
        if (sex == "male" || sex == "female") {
            TypewriterEffectPrinter.println("INVALID INPUT, PLEASE TRY AGAIN");
            sex = scanner.next();
        }

        // input bodyfatrate
        TypewriterEffectPrinter.println("Please enter your bodyfatrate:");
        input = scanner.next();
        while (!InputHandler.handleInput(input, Double.class, Double::valueOf)) {
            TypewriterEffectPrinter.println("Input incorrect, Please enter your bodyfatrate:");
            input = scanner.next();
        }
        double bodyfatrate = Double.parseDouble(input);
        System.out.println(user.getId());
        UserProfile userProfile = new UserProfile(user.getId(), age, sex, user.getname(), weight, height, bodyfatrate);
        UserProfileDao userProfileDao = new UserProfileDao();
        TypewriterEffectPrinter.println("Adding user profile...");
        TypewriterEffectPrinter.println(userProfile.toFormatString());
        userProfileDao.addUserProfile(userProfile);
        userProfileDao.close();
        // scanner.close();
    }

    /**
     * @description: view the user profile
     * @return {*}
     */
    private static void viewProfile() {
        userProfileDao = new UserProfileDao();
        user = CalOMatic9000.getUser();
        if (!userProfileDao.findUserProfileByName(user.getname())) {
            TypewriterEffectPrinter.println("No user profile found, please add a new one.");
            addUserProfile();
        }
        UserProfileDao userProfileDao = new UserProfileDao();
        userprofile = userProfileDao.getUserProfileByName(user.getname());
        userProfileDao.close();
        System.out.println(userprofile.toFormatString());
    }

    /**
     * @description: modify the user name
     * @return {*}
     */
    private static void modifyName() {
        User user = CalOMatic9000.getUser();
        Scanner scanner = new Scanner(System.in);
        TypewriterEffectPrinter.println("Please enter your new name:");
        String newName = scanner.nextLine();
        String newname = newName.trim();
        TypewriterEffectPrinter.println("Do you want to change your name to " + newname + "?");
        TypewriterEffectPrinter.println("Please enter 'yes' or 'no'");
        String input = scanner.nextLine();
        if ("yes".equalsIgnoreCase(input.trim())) {
            user.setname(newname);
            System.out.println(user.getname());
            UserProfileDao userProfileDao = new UserProfileDao();
            userProfileDao.updateName(user.getId(), newname);
            userProfileDao.close();
        } else if ("no".equalsIgnoreCase(input.trim())) {
            TypewriterEffectPrinter.println("Now redirect to previous menu!");
        } else {
            TypewriterEffectPrinter.println("Invalid input, please try again.");
        }
        // scanner.close();
    }
}

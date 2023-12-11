package edu.neu.cal.controller;

import java.util.Scanner;

import edu.neu.cal.dao.UserProfileDao;
import edu.neu.cal.domain.User;
import edu.neu.cal.domain.UserProfile;
import edu.neu.cal.main.CalOMatic9000;

public class UserProfileController {
    private static User user;
    private static UserProfile userprofile;

    public static void defaultOperation() {

        // 让用户选择操作
        // 1. 查看个人信息
        // 2. 修改个人信息
        // 3. 返回上一级
        // 4. 退出系统
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please select your operation:");
            System.out.println("1. View your profile");
            System.out.println("2. Modify your profile");
            System.out.println("3. Back to previous menu");
            System.out.println("4. Exit");
            boolean operation = true;
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
                        viewProfile();
                        break;
                    case 2:
                        modifyProfile();
                        break;
                    case 3:
                        return;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid input, please try again.");
                        break;
                }

            }
        }
    }

    private static void modifyProfile() {

    }

    private static void viewProfile() {
        user = CalOMatic9000.getUser();
        UserProfileDao userProfileDao = new UserProfileDao();
        userprofile = userProfileDao.getUserProfileByName(user.getname());
        userProfileDao.close();
        System.out.println(userprofile.toFormatString());
    }
}

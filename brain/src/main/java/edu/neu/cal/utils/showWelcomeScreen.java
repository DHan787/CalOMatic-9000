/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 00:34:45
 * @Description: 
 */
package edu.neu.cal.utils;

public class showWelcomeScreen {
    public static void showWelcomeScreen() {
        // 艺术字
        String asciiArt = "   _____           _    ____    __  __           _     _        \n"
                + "  / ____|         | |  / __ \\  |  \\/  |         | |   (_)       \n"
                + " | |        __ _  | | | |  | | | \\  / |   __ _  | |_   _    ___ \n"
                + " | |       / _` | | | | |  | | | |\\/| |  / _` | | __| | |  / __|\n"
                + " | |____  | (_| | | | | |__| | | |  | | | (_| | | |_  | | | (__ \n"
                + "  \\_____|  \\__,_| |_|  \\____/  |_|  |_|  \\__,_|  \\__| |_|  \\___|\n"
                + "                                                                \n";

        System.out.println(asciiArt);
        // 简短的欢迎语
        System.out.println("\nWelcome to CalOMatic9000 - Your Personal Calorie Management Companion!");
        TypewriterEffectPrinter.print("Manage your daily intake, get dietary advice, and track your eating habits.");

        // 请用户选择登录或注册
        TypewriterEffectPrinter.print("\nPlease select an option to get started: 1. Login or 2. Register");

        // 打印一个分割线
        System.out.println("\n---------------------------------------------------------------");
    }

    // 打字效果方法
    public static void printWithTypingEffect(String message) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            // 模拟打字机效果
            try {
                Thread.sleep(50); // 50毫秒的延迟
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(); // 新行
    }

}

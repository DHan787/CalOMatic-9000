/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 01:22:23
 * @Description: 
 */
package edu.neu.cal.utils;

public class TypewriterEffectPrinter {

    // 打字机效果的打印方法
    public static void print(String message) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            // 模拟打字机效果
            try {
                Thread.sleep(25); // 50毫秒的延迟
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // 用于替代System.out.println的方法
    public static void println(String message) {
        print(message);
        System.out.println(); // 新行
    }

    // 用于替代没有换行的System.out.print的方法
    public static void printWithNoNewLine(String message) {
        print(message);
    }
}

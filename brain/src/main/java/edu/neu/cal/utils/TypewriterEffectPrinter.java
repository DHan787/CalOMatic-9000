/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 01:22:23
 * @Description: 
 */
package edu.neu.cal.utils;

public class TypewriterEffectPrinter {

    private static final long DEFAULT_DELAY = 10; // 默认延迟100毫秒

    // 模拟打字机效果的基本打印方法
    private static void printWithEffect(String message, long delay) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("\n打印中断");
                return;
            }
        }
    }

    // 替代 println 方法
    public static void println(String message) {
        printWithEffect(message + "\n", DEFAULT_DELAY);
    }

    // 替代 print 方法
    public static void print(String message) {
        printWithEffect(message, DEFAULT_DELAY);
    }

    // 替代 printf 方法
    public static void printf(String format, Object... args) {
        String message = String.format(format, args);
        printWithEffect(message, DEFAULT_DELAY);
    }
}

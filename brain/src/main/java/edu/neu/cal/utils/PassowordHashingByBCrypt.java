/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 00:50:05
 * @Description: 
 */
package edu.neu.cal.utils;

import org.mindrot.jbcrypt.BCrypt;

public class PassowordHashingByBCrypt {
    // 哈希密码
    public static String hashPassword(String plainTextPassword) {
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
    }

    // 验证密码
    public static boolean checkPassword(String plainTextPassword, String hashedPassword) {
        return BCrypt.checkpw(plainTextPassword, hashedPassword);
    }
}

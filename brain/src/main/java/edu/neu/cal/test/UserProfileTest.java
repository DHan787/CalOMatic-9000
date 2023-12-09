/*
 * @Author: Jiang Han
 * @Date: 2023-11-27 17:10:52
 * @Description: 
 */
package edu.neu.cal.test;

import edu.neu.cal.domain.User;

/**
 * @author Haipeng Wang
 */
public class UserProfileTest {
    public static void main(String[] args) {
        User user1 = new User(22, "male", "Wang", 80.0, 1.85, 23);
        System.out.println(user1);
    }
}
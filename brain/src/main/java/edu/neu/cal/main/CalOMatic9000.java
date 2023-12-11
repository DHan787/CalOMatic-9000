/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 01:30:32
 * @Description: 
 */
package edu.neu.cal.main;

import edu.neu.cal.Haoyin.authService;
import edu.neu.cal.Haoyin.authUser;
import edu.neu.cal.utils.showWelcomeScreen;

public class CalOMatic9000 {
    public static void main(String[] args) {
        showWelcomeScreen.showWelcomeScreen();
        authUser.userOperation();

    }
}

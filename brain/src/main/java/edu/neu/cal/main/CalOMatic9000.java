/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 01:30:32
 * @Description: 
 */
package edu.neu.cal.main;

import edu.neu.cal.auth.authService;
import edu.neu.cal.auth.authUser;
import edu.neu.cal.controller.UserProfileController;
import edu.neu.cal.domain.User;
import edu.neu.cal.utils.TypewriterEffectPrinter;
import edu.neu.cal.utils.showWelcomeScreen;

public class CalOMatic9000 {
    private static User user;

    // getter
    public static User getUser() {
        return user;
    }

    // setter
    public static void setUser(User user) {
        CalOMatic9000.user = user;
    }

    public static void main(String[] args) {
        authUser authUser = new authUser();
        showWelcomeScreen.showWelcomeScreen();
        authUser.userOperation();
        UserProfileController userProfileController = new UserProfileController();
        afterLoginService.afterLogin();
        // say goodbye to the user
        TypewriterEffectPrinter.println("Goodbye " + user.getname() + "!");

    }
}

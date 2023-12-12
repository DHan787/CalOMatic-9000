/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 03:26:03
 * @Description: 
 */
package edu.neu.cal.controller;

import edu.neu.cal.dao.UserDao;
import edu.neu.cal.dao.UserProfileDao;
import edu.neu.cal.domain.HealthGoalPlan;
import edu.neu.cal.domain.PrintContent;
import edu.neu.cal.domain.User;
import edu.neu.cal.domain.UserProfile;
import edu.neu.cal.main.CalOMatic9000;
import edu.neu.cal.utils.TypewriterEffectPrinter;

public class AdvisorController {

    static User user;
    static UserProfileDao userprofiledao;
    static UserProfile userprofile;

    public static void defaultOperation() {
        user = CalOMatic9000.getUser();
        userprofiledao = new UserProfileDao();
        userprofile = new UserProfile();
        userprofile = userprofiledao.getUserProfileByName(user.getname());
        TypewriterEffectPrinter.println("I am your personal advisor.");
        TypewriterEffectPrinter.println("I will help you to make a healthy diet plan.");
        TypewriterEffectPrinter.println("Here is your eating suggestion:");
        HealthGoalPlan healthGoalPlan = new HealthGoalPlan(userprofile);
        healthGoalPlan.recommandation();

    }
}

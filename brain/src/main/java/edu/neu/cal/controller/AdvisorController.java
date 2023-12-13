/**
 * This class represents the AdvisorController, which is responsible for providing personalized advice and creating a healthy diet plan for the user.
 * It interacts with the User, UserProfileDao, UserProfile, and HealthGoalPlan classes to retrieve user information and generate recommendations.
 * The defaultOperation method is the entry point for the advisor functionality and displays the eating suggestion based on the user's profile.
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

    /**
     * Performs the default operation of the AdvisorController.
     * Retrieves the user's profile, generates a health goal plan, and displays the
     * eating suggestion.
     */
    public static void defaultOperation() {
        user = CalOMatic9000.getUser();
        userprofiledao = new UserProfileDao();
        userprofile = new UserProfile();
        userprofile = userprofiledao.getUserProfileByName(user.getname());
        TypewriterEffectPrinter.println("\nI am your personal advisor.");
        TypewriterEffectPrinter.println("I will help you to make a healthy diet plan.");
        TypewriterEffectPrinter.println("Here is your eating suggestion:");
        HealthGoalPlan healthGoalPlan = new HealthGoalPlan(userprofile);
        healthGoalPlan.recommandation();

    }
}

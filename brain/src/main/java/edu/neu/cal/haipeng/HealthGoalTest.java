package edu.neu.cal.haipeng;
import edu.neu.cal.haipeng.Plan.PlanType;

/**
 * @author Haipeng Wang
 * @since 2023/11/26
 */
public class HealthGoalTest {
    public static void main(String[] args) {
        User user1 = new User(24, "male", "Wang", 80.0, 1.85, 20);
        Plan plan = new Plan(user1, 30, PlanType.RUNNING);
        PlanImpl imp = new PlanImpl(plan);
        System.out.println(imp);
    }
}
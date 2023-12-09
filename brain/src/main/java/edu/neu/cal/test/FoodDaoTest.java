/*
 * @Author: Jiang Han
 * @Date: 2023-12-09 00:09:04
 * @Description: 
 */
package edu.neu.cal.test;

import edu.neu.cal.dao.FoodDao;
import edu.neu.cal.domain.Food;

public class FoodDaoTest {
    public static void main(String[] args) {
        FoodDao FoodDAO = new FoodDao();
        System.out.println(FoodDAO.getproteinByFoodName("testname"));
        System.out.println(FoodDAO.getcaloriesByFoodName("testname"));
        // Food NewFood = new Food(1, "aa", 10, "aa");
        // FoodDao.addFood(NewFood);
        // FoodDao.close();

    }

}
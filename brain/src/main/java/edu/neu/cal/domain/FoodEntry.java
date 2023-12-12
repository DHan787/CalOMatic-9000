/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 22:42:32
 * @Description: 
 */
package edu.neu.cal.domain;

import edu.neu.cal.dao.FoodDao;
import edu.neu.cal.dao.FoodHistoryDao;

public class FoodEntry {
    private String id;

    private String name;

    private Double amount;

    FoodDao foodDao;

    public FoodEntry(String id, String name, Double amount) {
        this.foodDao = new FoodDao();
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public FoodEntry() {
        this.foodDao = new FoodDao();
    }

    public Double getamount() {
        return amount;
    }

    public void setamount(Double amount) {
        this.amount = amount;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public Boolean findFood(String name) {
        return this.foodDao.findFoodByName(name);
    }

    public void addFood(String id, String input, Double amount) {
        FoodHistory foodHistory = new FoodHistory(id, input, amount);
        FoodHistoryDao foodHistoryDao = new FoodHistoryDao();
        foodHistoryDao.addFoodHistory(foodHistory.getid(), foodHistory.getname(), foodHistory.getamount());
    }
}

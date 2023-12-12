/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 23:17:24
 * @Description: 
 */
package edu.neu.cal.domain;

public class FoodHistory {
    private String id;

    private String name;

    private double amount;

    public FoodHistory(String id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public FoodHistory() {
    }

    public double getamount() {
        return amount;
    }

    public void setamount(double amount) {
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
}

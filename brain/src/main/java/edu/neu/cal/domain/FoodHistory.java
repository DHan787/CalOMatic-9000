/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 23:17:24
 * @Description: 
 */
package edu.neu.cal.domain;

import java.sql.Timestamp;

public class FoodHistory {
    private String id;

    private String name;

    private double amount;

    private Timestamp timestamp;

    public FoodHistory(String id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public FoodHistory(String id, String name, double amount, Timestamp timestamp) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public FoodHistory() {
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
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

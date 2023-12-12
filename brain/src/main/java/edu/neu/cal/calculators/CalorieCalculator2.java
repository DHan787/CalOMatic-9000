/*
*@Author:Haipeng Wang
*@Date:12-010-2023
*@Detail:Calorie Calculator
*/

package edu.neu.cal.calculators;

import edu.neu.cal.Dbconnector.DbAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.NoSuchElementException;
import java.lang.RuntimeException;

public class CalorieCalculator2 {
    private DbAccess myAccess;

    private Connection connection;

    public CalorieCalculator2() {
        this.myAccess = new DbAccess();
        this.connection = this.myAccess.getConnection();
    }

    public void close() {
        this.myAccess.closeConnection(this.connection);
    }

    public double getTotalCaloriesByFoodNameandQuantities(String[] foodName, double[] foodQuantities) {
        int[] caloriePerHundred = getcaloriesPerHundredByFoodName(foodName);
        return calculateCalorie(foodQuantities, caloriePerHundred);
    }

    public int[] getcaloriesPerHundredByFoodName(String[] foodName) {
        // 准备语句
        PreparedStatement pstmt = null;

        // 准备结果集
        ResultSet rs = null;

        // 准备列表存结果
        ArrayList<Integer> calorieList = new ArrayList<Integer>();

        // 报错输出值
        int[] error = { 0 };

        try {
            // 准备sql语句
            StringBuilder sql = new StringBuilder("SELECT Calories FROM food WHERE foodName IN (");

            // 为每个foodName添加一个占位符
            for (int index = 0; index < foodName.length; index++) {
                sql.append("?");
                if (index < foodName.length - 1) {
                    sql.append(", ");
                }
            }
            sql.append(")");

            pstmt = this.connection.prepareStatement(sql.toString());
            for (int index = 0; index < foodName.length; index++) {
                // 设置参数
                pstmt.setString(index + 1, foodName[index]);
            }
            // 执行查询
            rs = pstmt.executeQuery();
            // 处理结果集
            try {
                while (rs.next()) {
                    calorieList.add(rs.getInt("Calories"));
                }
            } catch (NoSuchElementException e) {
                return error;
            }
            return transferListIntoArray(calorieList);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return error;
    }

    public int[] transferListIntoArray(List<Integer> a) {
        return a.stream().mapToInt(Integer::intValue).toArray();
    }

    public double calculateCalorie(double[] foodQuantities, int[] foodCaloriePerHundred) {
        double error = 0;
        double calorie = 0;
        try {
            for (int index = 0; index < foodQuantities.length; index++) {
                calorie += foodQuantities[index] * foodCaloriePerHundred[index] / 100;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return error;
        }
        return calorie;
    }
}

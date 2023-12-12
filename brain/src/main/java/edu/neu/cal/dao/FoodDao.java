/*
 * @Author: Jiang Han
 * @Date: 2023-12-02 18:20:10
 * @Description: 
 */
package edu.neu.cal.dao;

import java.sql.*;

import edu.neu.cal.Dbconnector.DbAccess;
import edu.neu.cal.domain.Food;

public class FoodDao {

    private DbAccess myAccess;

    private Connection connection;

    public FoodDao() {
        this.myAccess = new DbAccess();
        this.connection = this.myAccess.getConnection();
    }

    public void close() {
        this.myAccess.closeConnection(this.connection);
    }

    public void addFood(Food entry) {
        String sql = "INSERT INTO food (foodName, Calories, Protein, Carb,  Fat) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, entry.getFoodName());
            pstmt.setInt(2, entry.getCalories());
            pstmt.setDouble(3, entry.getFoodProtein());
            pstmt.setDouble(4, entry.getFoodCarb());
            pstmt.setDouble(5, entry.getFoodFat());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // public Food getFoodEntry(int id) {
    // String sql = "SELECT * FROM food_entries WHERE id = ?";
    // try (PreparedStatement pstmt = connection.prepareStatement(sql)) {

    // pstmt.setInt(1, id);
    // ResultSet rs = pstmt.executeQuery();

    // if (rs.next()) {
    // return new Food(rs.getInt("id"),
    // rs.getString("name"),
    // rs.getInt("calories"),
    // rs.getString("protien"));
    // }
    // } catch (SQLException e) {
    // System.out.println(e.getMessage());
    // }
    // return null; }

    public int getcaloriesByFoodName(String foodName) {
        // 准备语句
        PreparedStatement pstmt = null;

        // 准备结果集
        ResultSet rs = null;

        try {
            // 准备sql语句
            String sql = "SELECT calories FROM food WHERE foodName = ?";

            pstmt = this.connection.prepareStatement(sql);
            // 设置参数
            pstmt.setString(1, foodName);
            // 执行查询
            rs = pstmt.executeQuery();
            // 处理结果集
            if (rs.next()) {
                return rs.getInt("calories");
            } else {
                return 0;
            }
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
        return 0;

    }

    public String getproteinByFoodName(String foodName) {
        // 准备语句
        PreparedStatement pstmt = null;

        // 准备结果集
        ResultSet rs = null;

        try {
            // 准备sql语句
            String sql = "SELECT protein FROM food WHERE foodName = ?";

            pstmt = this.connection.prepareStatement(sql);
            // 设置参数
            pstmt.setString(1, foodName);
            // 执行查询
            rs = pstmt.executeQuery();
            // 处理结果集
            if (rs.next()) {
                return rs.getString("protein");
            } else {
                return null;
            }
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
        return "no result";

    }

    public void updateFood(Food entry) {
        String sql = "UPDATE food SET foodName = ?, Calories = ? WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, entry.getFoodName());
            pstmt.setInt(2, entry.getCalories());
            pstmt.setInt(3, entry.getFoodId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteFood(int id) {
        String sql = "DELETE FROM food WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Boolean findFoodByName(String name) {
        String sql = "SELECT * FROM food WHERE foodName = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            if (!rs.next()) {
                return false;
            } else {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}

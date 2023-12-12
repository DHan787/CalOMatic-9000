/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 23:15:58
 * @Description: 
 */
package edu.neu.cal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.naming.spi.DirStateFactory.Result;

import edu.neu.cal.Dbconnector.DbAccess;
import edu.neu.cal.domain.FoodHistory;

public class FoodHistoryDao {
    private DbAccess myAccess;

    private Connection connection;

    public FoodHistoryDao() {
        this.myAccess = new DbAccess();
        this.connection = this.myAccess.getConnection();
    }

    public void close() {
        this.myAccess.closeConnection(this.connection);
    }

    public void addFoodHistory(String id, String name, double amount) {
        // 准备语句
        PreparedStatement pstmt = null;

        try {
            // 准备sql语句
            String sql = "INSERT INTO foodhistory (userid, name, amount) VALUES (?, ?, ?)";

            pstmt = this.connection.prepareStatement(sql);
            // 设置参数
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setDouble(3, amount);
            // 执行查询
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public LinkedList<FoodHistory> getFoodHistories(String id) {
        PreparedStatement pstmt = null;

        try {
            // 准备sql语句
            String sql = "SELECT * FROM foodhistory Where userid = ?";

            ResultSet rs;
            pstmt = this.connection.prepareStatement(sql);
            // 设置参数
            pstmt.setString(1, id);
            // 执行查询
            rs = pstmt.executeQuery();
            // 处理结果集
            LinkedList<FoodHistory> foodHistories = new LinkedList<FoodHistory>();

            while (rs.next()) {
                FoodHistory foodHistory = new FoodHistory(
                        rs.getString("userid"),
                        rs.getString("name"),
                        rs.getDouble("amount"), rs.getTimestamp("date"));
                foodHistories.add(foodHistory);
            }
            return foodHistories;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

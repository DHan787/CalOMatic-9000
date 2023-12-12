/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 23:15:58
 * @Description: 
 */
package edu.neu.cal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import edu.neu.cal.Dbconnector.DbAccess;

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
}

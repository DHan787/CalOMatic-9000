/*
 * @Author: Jiang Han
 * @Date: 2023-12-03 20:47:13
 * @Description: UserDao class
 */
package edu.neu.cal.dao;

import java.sql.Connection;

import edu.neu.cal.Hongkai.User;
import edu.neu.cal.connector.DbAccess;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: Jiang Han
 * @Date: 2023-12-03 20:47:13
 * @Description:
 */
public class UserDao {

    private DbAccess myAccess;

    private Connection connection;

    /**
     * @description: default constructor
     * @return {*}
     */
    public UserDao() {
        this.myAccess = new DbAccess();
        this.connection = this.myAccess.getConnection();
    }

    /**
     * @description: close the database connection
     * @return {*}
     */
    public void close() {
        this.myAccess.closeConnection(this.connection);
    }

    /**
     * @description: get password by username
     * @param {String} username
     * @return {*}  
     */
    public String getPasswordByName(String name) {
        // 准备语句
        PreparedStatement pstmt = null;

        // 准备结果集
        ResultSet rs = null;

        try {
            // 准备sql语句
            String sql = "SELECT password FROM users WHERE name = ?";

            pstmt = this.connection.prepareStatement(sql);
            // 设置参数
            pstmt.setString(1, name);
            // 执行查询
            rs = pstmt.executeQuery();
            // 处理结果集
            if (rs.next()) {
                return rs.getString("password");
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

public int getIdByName(String name) {
        // 准备语句
        PreparedStatement pstmt = null;

        // 准备结果集
        ResultSet rs = null;

        try {
            // 准备sql语句
            String sql = "SELECT Id FROM users WHERE name = ?";

            pstmt = this.connection.prepareStatement(sql);
            // 设置参数
            pstmt.setString(1, name);
            // 执行查询
            rs = pstmt.executeQuery();
            // 处理结果集
            if (rs.next()) {
                return rs.getInt("Id");
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

public String getEmailByName(String name) {
        // 准备语句
        PreparedStatement pstmt = null;

        // 准备结果集
        ResultSet rs = null;

        try {
            // 准备sql语句
            String sql = "SELECT Email FROM users WHERE name = ?";

            pstmt = this.connection.prepareStatement(sql);
            // 设置参数
            pstmt.setString(1, name);
            // 执行查询
            rs = pstmt.executeQuery();
            // 处理结果集
            if (rs.next()) {
                return rs.getString("Email");
            } else {
                return "no result";
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

    public void addUser(User user) {
        String sql = "INSERT INTO users (name, password, email) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, user.getname());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getEmail());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteUserByName(String name) {
        String sql = "DELETE FROM users WHERE name = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateUser(User user) {
        String sql = "UPDATE users SET id = ?, password = ?, email = ? WHERE name = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setInt(1,user.getId());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getname());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void newUser(User user){
        user.getname();
    }

}

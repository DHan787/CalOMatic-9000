/*
 * @Author: Jiang Han
 * @Date: 2023-12-02 18:20:10
 * @Description: 
 */
package edu.neu.cal.Hongkai;

import java.sql.*;

import edu.neu.cal.connector.DbAccess;

public class UserDAO {

    private Connection conn;

    public void UserDAO() {
        DbAccess myConnector = new DbAccess();
        this.conn = myConnector.getConnection();
    }

    /**
     * @description:
     * @param {User} user
     * @return {*}
     */
    public void addUser(User user) {
        String sql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getEmail());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public User getUser(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new User(rs.getString("username"), rs.getString("password"), rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void updateUser(User user) {
        String sql = "UPDATE users SET password = ?, email = ? WHERE username = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, user.getPassword());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getUsername());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteUser(String username) {
        String sql = "DELETE FROM users WHERE username = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, username);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

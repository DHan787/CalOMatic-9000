/*
*@Author:Jiani Lyu
*@Date:12-09-2023
*@Detail:Retrieve data from Database
*/

package edu.neu.cal.calculators;

import edu.neu.cal.domain.Food;
import edu.neu.cal.domain.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataFromDB {

    private static final String DATABASE_URL = "jdbc:your_database_type://host:port/database_name";
    private static final String DATABASE_USERNAME = "your_username";
    private static final String DATABASE_PASSWORD = "your_password";

    public DataFromDB() {
    }

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
    }

    public List<Food> getAllFoods() {
        String sql = "SELECT * FROM food_entries";
        List<Food> foods = new ArrayList<>();

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Food food = new Food(rs.getInt("id"),
                                     rs.getString("name"),
                                     rs.getInt("calories"),
                                     rs.getDouble("protein"),
                                     rs.getDouble("carbs"),
                                     rs.getDouble("fat"));
                foods.add(food);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return foods;
    }

    // Method to retrieve a user by username
    public User getUserByName(String username) {
        String sql = "SELECT * FROM users WHERE name = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, username);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new User(rs.getInt("id"), rs.getString("name"), rs.getString("password"), rs.getString("email"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    // Method to add a new user
    public void addUser(User user) {
        String sql = "INSERT INTO users (name, password, email) VALUES (?, ?, ?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, user.getname());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getEmail());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }



}

package edu.neu.cal.Hongkai;

import java.sql.*;

public class FoodEntryDAO {

    private Connection connect() throws SQLException {
        // Replace with your database connection details
        String url = "jdbc:mysql://localhost:3306/yourDatabaseName";
        String user = "yourUsername";
        String password = "yourPassword";
        return DriverManager.getConnection(url, user, password);
    }

    public void addFoodEntry(FoodEntry entry) {
        String sql = "INSERT INTO food_entries (name, calories, user_id) VALUES (?, ?, ?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, entry.getName());
            pstmt.setInt(2, entry.getCalories());
            pstmt.setInt(3, entry.getUserId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public FoodEntry getFoodEntry(int id) {
        String sql = "SELECT * FROM food_entries WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new FoodEntry(rs.getInt("id"), rs.getString("name"), rs.getInt("calories"), rs.getInt("user_id"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void updateFoodEntry(FoodEntry entry) {
        String sql = "UPDATE food_entries SET name = ?, calories = ? WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, entry.getName());
            pstmt.setInt(2, entry.getCalories());
            pstmt.setInt(3, entry.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteFoodEntry(int id) {
        String sql = "DELETE FROM food_entries WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

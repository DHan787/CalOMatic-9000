/*
 * @Author: Jiang Han
 * @Date: 2023-12-02 18:20:10
 * @Description: 
 */
/*
 * @Author: Jiang Han
 * @Date: 2023-12-02 18:20:10
 * @Description: 
 */
package edu.neu.cal.Hongkai;

import java.sql.*;

import edu.neu.cal.connector.DbAccess;

public class FoodEntryDAO {
    private Connection conn;

    public void FoodEntryDAO() {
        DbAccess myConnector = new DbAccess();
        this.conn = myConnector.getConnection();
    }

    public void addFoodEntry(FoodEntry entry) {
        String sql = "INSERT INTO food_entries (name, calories, protien) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, entry.getFoodName());
            pstmt.setInt(2, entry.getCalories());
            pstmt.setString(3, entry.getProtein());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public FoodEntry getFoodEntry(int id) {
        String sql = "SELECT * FROM food_entries WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new FoodEntry(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("calories"),
                        rs.getString("protien"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void updateFoodEntry(FoodEntry entry) {
        String sql = "UPDATE food_entries SET name = ?, calories = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, entry.getFoodName());
            pstmt.setInt(2, entry.getCalories());
            pstmt.setInt(3, entry.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteFoodEntry(int id) {
        String sql = "DELETE FROM food_entries WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

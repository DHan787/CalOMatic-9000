/*
*@Author:Jiani Lyu
*@Date:12-09-2023
*@Detail:Retrieve data from Database
*/

package edu.neu.cal.calculators;

import edu.neu.cal.Dbconnector.DbAccess;
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

    DbAccess myAccess;

    Connection connection;

    public DataFromDB() {
        this.myAccess = new DbAccess();
        this.connection = this.myAccess.getConnection();
    }

    public void close() {
        this.myAccess.closeConnection(this.connection);
    }

    public List<Food> getAllFoods() {
        String sql = "SELECT * FROM food";
        List<Food> foods = new ArrayList<>();

        try (
                PreparedStatement pstmt = connection.prepareStatement(sql);
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

}

/*
 * @Author: Jiang Han
 * @Date: 2023-11-21 22:06:52
 * @Description: Databse access class
 */

package edu.neu.cal.Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAccess {
    private Connection connect = null;

    // URL of database DO NOT change
    private String databaseURL = "jdbc:mysql://calomatic-db.mysql.database.azure.com:3306/testdb";
    // username of database DO NOT change
    private String user = "deckard";
    // password of database NO NOT change
    private String password = "INFO5100@cal";

    /**
     * @description: connect the database
     * @return {*}
     */
    public void connectToDatabase() {
        try {
            // load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Setup the connection with the DB
            connect = DriverManager.getConnection(databaseURL, user, password);

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection to database failed");
            e.printStackTrace();
        }
    }

    /**
     * @description: close the connection
     * @return {*}
     */
    public void close() {
        try {
            if (connect != null) {
                connect.close();
            }
        } catch (SQLException e) {
            System.out.println("Failed to close the connection");
            e.printStackTrace();
        }
    }

    /**
     * @description: read the data from database
     * @param {String} type
     * @return {based on the requirement return}
     */
    public String readUsersData(String type) {
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connect.createStatement();
            // 查询语句的书写方式
            String sql = "SELECT * FROM Users";
            // 执行查询语句
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String id = String.valueOf(resultSet.getInt("id"));
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                // 注意：实际情况中不应该读取和显示密码，这里仅作示例
                String password = resultSet.getString("password");
                switch (type) {
                    case "id":
                        return id;
                    case "name":
                        return name;
                    case "email":
                        return email;
                    case "password":
                        return password;
                    default:
                        break;
                }
            }
            return "No such data!";
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return "error!";
    }
}

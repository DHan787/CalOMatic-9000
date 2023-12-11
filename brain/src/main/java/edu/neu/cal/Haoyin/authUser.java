/*
 * @Author: Jiang Han
 * @Date: 2023-12-09 18:24:31
 * @Description: 
 */
package edu.neu.cal.Haoyin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import edu.neu.cal.connector.DbAccess;
import edu.neu.cal.utils.PassowordHashingByBCrypt;
import edu.neu.cal.utils.UUIDGen;

public class authUser {

    // for user to choose login or register
    public static void userOperation() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    authService.loginUser(scanner);
                    break;

                case 2:
                    authService.registerUser(scanner);
                    break;

                default:
                    System.out.println("Invalid operation, re-enter!");
            }
        }

    }

    // insert the registered information into the database for login
    public static void insertTable(String registerUsername, String registerEmail, String registerPassword) {
        Connection connection = null;
        DbAccess dbAccess = new DbAccess();
        connection = dbAccess.getConnection();
        String UUID = UUIDGen.generateUUID();
        System.out.println(registerPassword);
        String hashedPassword = PassowordHashingByBCrypt.hashPassword(registerPassword);
        System.out.println(hashedPassword);
        String insertTableQuery = "INSERT INTO users (id, name, password, email) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertTableQuery)) {
            preparedStatement.setString(1, UUID);
            preparedStatement.setString(2, registerUsername);
            preparedStatement.setString(3, hashedPassword);
            preparedStatement.setString(4, registerEmail);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

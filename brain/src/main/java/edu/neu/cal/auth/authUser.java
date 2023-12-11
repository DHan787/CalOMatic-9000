/*
 * @Author: Jiang Han
 * @Date: 2023-12-09 18:24:31
 * @Description: 
 */
package edu.neu.cal.auth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import edu.neu.cal.Dbconnector.DbAccess;
import edu.neu.cal.domain.User;
import edu.neu.cal.utils.PassowordHashingByBCrypt;
import edu.neu.cal.utils.UUIDGen;

public class authUser {

    User user = null;

    authService authService = new authService();

    public User getUser() {
        return this.user;
    }

    // for user to choose login or register
    public void userOperation() {
        boolean operation = true;
        Scanner scanner = new Scanner(System.in);
        while (operation) {
            String input = scanner.nextLine();

            // 检查用户是否输入了 "exit"
            if ("exit".equalsIgnoreCase(input.trim())) {
                System.out.println("Exiting...");
                break; // 退出 while 循环
            }

            // 将输入转换为整数，用于 switch 语句
            int CaseOperation;
            try {
                CaseOperation = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number or 'exit' to quit.");
                continue; // 跳过当前循环的剩余部分
            }

            switch (CaseOperation) {
                case 1:
                    this.user = authService.loginUser(scanner);
                    System.out.println(this.user.toString());
                    operation = false;
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
    public void insertTable(String registerUsername, String registerEmail, String registerPassword) {
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

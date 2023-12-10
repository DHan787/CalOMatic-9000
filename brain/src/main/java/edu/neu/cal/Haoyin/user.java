package brain.src.main.java.edu.neu.cal.Haoyin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class user {
    
    //for user to choose login or register
    static void userOperation(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Login");
            System.out.println("2.Register");

            System.out.println("Select your operation please.");
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
    //creat the table in database for user information
    static void createTable() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://calomatic-db.mysql.database.azure.com:3306/testdb", "deckard", "INFO5100@cal")) {
            String createTableQuery = "CREATE TABLE IF NOT EXISTS users (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "username VARCHAR(20) NOT NULL," +
                    "password VARCHAR(20) NOT NULL," +
                    "email VARCHAR(30) NOT NULL" +
                    ")";
            try (PreparedStatement preparedStatement = connection.prepareStatement(createTableQuery)) {
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //insert the registered information into the database for login
    static void insertTable(String registerUsername, String registerEmail, String registerPassword) {

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://calomatic-db.mysql.database.azure.com:3306/testdb", "deckard", "INFO5100@cal")) {
            String insertTableQuery ="INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertTableQuery)) {
                preparedStatement.setString(1, registerUsername);
                preparedStatement.setString(2, registerEmail);
                preparedStatement.setString(3, registerPassword);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

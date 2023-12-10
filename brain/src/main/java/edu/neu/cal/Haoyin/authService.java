package brain.src.main.java.edu.neu.cal.Haoyin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class authService {
    
     public static void main( String[] args )
    {
        user.createTable();
        
        user.userOperation();

    }

    //user login
    static void loginUser(Scanner scanner){
        
        //user input the username for login
        System.out.println("Username: ");
        String username = scanner.next();
        //user input the password for login
        System.out.println("Password: ");
        String password = scanner.next();

        //check whether the user name and password are correct from the database
        String selectUserSQL = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://calomatic-db.mysql.database.azure.com:3306/testdb", "deckard", "INFO5100@cal")) {
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        System.out.println("Welcome! " + username);
                    } else {
                        System.out.println("The username or password is incorrect. Please try again");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //user register
    public static void registerUser(Scanner scanner){
        
        //user input the username for register
        System.out.println("Username: ");
        String registerUsername = scanner.next();

        //user input the email for register
        String registerEmail;
        boolean validEmail = false;
        do {
            System.out.println("Email: ");
            registerEmail = scanner.next();

            //check if the email are usable
            if (!registerEmail.contains("@")) {
                System.out.println("Invalid email address. Please re-enter!");
            } else {
                validEmail = true;
            }
        } while (!validEmail);

        //user input the password for register
        String registerPassword;
        boolean validPassword = false;
        do{
            //password requirement
            System.out.println("(The password has to be 8-14 length, contains numbers and uppercase and lowercase letters)");
            System.out.println("Password: ");
            registerPassword = scanner.next();

            //password length requirement check
            if (registerPassword.length() <8 || registerPassword.length() >14) {
                System.out.println("Password must be between 8 and 14 characters in length, please re-enter!");
                continue;
            }   
            //password elements requirements check
            if (!registerPassword.matches(".*\\d.*") || !registerPassword.matches(".*[A-Z].*")
                || !registerPassword.matches(".*[a-z].*")){
                
                System.out.println("Password must contain numbers and upper and lower case letters, please re-enter!");
                continue;
            }
            //re-enter the password 
            System.out.println("Re-enter password: ");
            String repassword = scanner.next();
            //check if the re-enter password are same as the previous one  
            if (!registerPassword.equals(repassword)) {
                System.out.println("Password doea not match, please re-enter!");
                continue;
            }
            
            validPassword = true;
        } while (!validPassword);

        System.out.println("Register successful!");
        //insert the registered information into the database for login
        user.insertTable(registerUsername, registerEmail, registerPassword);
        //go back to login
        System.out.println("Now redirect to login!");
        loginUser(scanner);
    }
}
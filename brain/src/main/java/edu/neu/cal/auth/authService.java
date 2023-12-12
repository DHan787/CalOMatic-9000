package edu.neu.cal.auth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import edu.neu.cal.Dbconnector.DbAccess;
import edu.neu.cal.domain.User;
import edu.neu.cal.main.CalOMatic9000;
import edu.neu.cal.utils.PassowordHashingByBCrypt;
import edu.neu.cal.utils.TypewriterEffectPrinter;

public class authService {

    public static void main(String[] args) {
        authUser authUser = new authUser();
        authUser.userOperation();

    }

    // user login
    public User loginUser(Scanner scanner) {

        authUser authService = new authUser();

        Connection connection = null;

        User user = null;

        DbAccess dbAccess = new DbAccess();
        connection = dbAccess.getConnection();
        // user input the username for login
        TypewriterEffectPrinter.print("Please enter your username: ");
        String username = scanner.next();
        // user input the password for login
        TypewriterEffectPrinter.print("Please enter your password:");
        String password = scanner.next();

        // check whether the user name and password are correct from the database
        String selectUserSQL = "SELECT * FROM users WHERE name = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(selectUserSQL)) {
            preparedStatement.setString(1, username);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    if (PassowordHashingByBCrypt
                            .checkPassword(password, resultSet.getString("password"))) {
                        user = new User(resultSet.getString("id"),
                                resultSet.getString("name"),
                                resultSet.getString("email"));
                        TypewriterEffectPrinter.print("Login successful!");
                        return user;
                    } else {
                        TypewriterEffectPrinter.print("The username or password is incorrect. Please try again");
                        loginUser(scanner);
                    }
                } else {
                    TypewriterEffectPrinter.print("The username not exist. Do you want to register?");
                    TypewriterEffectPrinter.print("\n1. Yes | 2. No");
                    while (true) {
                        int operation = scanner.nextInt();

                        switch (operation) {
                            case 1:
                                registerUser(scanner);
                                break;

                            case 2:
                                TypewriterEffectPrinter.print("Now redirect to login!");
                                loginUser(scanner);
                                break;

                            default:
                                System.out.println("Invalid operation, re-enter!");
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    // user register
    public void registerUser(Scanner scanner) {

        authUser authUser = new authUser();

        // user input the username for register
        TypewriterEffectPrinter.print("Username: ");
        String registerUsername = scanner.next();

        // user input the email for register
        String registerEmail;
        boolean validEmail = false;
        do {
            TypewriterEffectPrinter.print("Email: ");
            registerEmail = scanner.next();

            // check if the email are usable
            if (!registerEmail.contains("@")) {
                TypewriterEffectPrinter.print("Invalid email address. Please re-enter!");
            } else {
                validEmail = true;
            }
        } while (!validEmail);

        // user input the password for register
        String registerPassword;
        boolean validPassword = false;
        do {
            // password requirement
            TypewriterEffectPrinter.print(
                    "(The password has to be 8-14 length, contains numbers and uppercase and lowercase letters)");
            TypewriterEffectPrinter.print("\nPassword: ");
            registerPassword = scanner.next();

            // password length requirement check
            if (registerPassword.length() < 8 || registerPassword.length() > 14) {
                TypewriterEffectPrinter
                        .print("Password must be between 8 and 14 characters in length, please re-enter!");
                continue;
            }
            // password elements requirements check
            if (!registerPassword.matches(".*\\d.*") || !registerPassword.matches(".*[A-Z].*")
                    || !registerPassword.matches(".*[a-z].*")) {
                TypewriterEffectPrinter
                        .print("Password must contain numbers and upper and lower case letters, please re-enter!");
                continue;
            }
            // re-enter the password
            TypewriterEffectPrinter.print("Re-enter password: ");
            String repassword = scanner.next();
            // check if the re-enter password are same as the previous one
            if (!registerPassword.equals(repassword)) {
                TypewriterEffectPrinter.print("Password doea not match, please re-enter!");
                continue;
            }

            validPassword = true;
        } while (!validPassword);

        TypewriterEffectPrinter.print("\nRegister successful!");
        // insert the registered information into the database for login
        authUser.insertTable(registerUsername, registerEmail, registerPassword);
        // go back to login
        TypewriterEffectPrinter.print("\nNow redirect to login!");
        CalOMatic9000.setUser(loginUser(scanner));
        ;
    }
}
package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // JDBC URL, username, and password of your database
        String url = "jdbc:oracle:thin:@//34.125.20.216:51521";
        String username = "system";
        String password = "mysecurepassword";

        // SQL query to insert a new book
        String insertQuery = "INSERT INTO BOOK (NAME, ISBN) VALUES (?, ?)";

        // Registering the Oracle JDBC driver
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        try (
                // Establishing connection to the database
                Connection connection = DriverManager.getConnection(url, username, password);
                // Creating a prepared statement to insert books
                PreparedStatement statement = connection.prepareStatement(insertQuery);
        ) {
            // Inserting 100 dummy books
            for (int i = 1; i <= 100; i++) {
                // Setting values for the prepared statement
                statement.setString(1, "Book " + i);
                statement.setString(2, "ISBN" + RandomISBN());
                // Executing the statement to insert the book
                statement.executeUpdate();
            }
            System.out.println("100 books inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static long RandomISBN() {
        Random random = new Random();
        // Generating a random number between 10^12 and 10^13 - 1
        long random13DigitNumber = (long) (Math.pow(10, 12) + random.nextDouble() * Math.pow(10, 12));
        return random13DigitNumber;
    }
}
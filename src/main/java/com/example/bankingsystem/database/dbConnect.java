package com.example.bankingsystem.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dbConnect {
    public dbConnect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Load the MySQL JDBC driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/bankingsystem";
        String username = "root";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println(connection);
            // Now you have a connection to the database
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}

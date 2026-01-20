package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MyConnection {
    private static final String username = "root";
    private static final String password = "";
    private static final String dataCon = "jdbc:mysql://localhost:3306/student_management"; // Fixed typo
    private static Connection con = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Fixed 'class' to 'Class'
            con = DriverManager.getConnection(dataCon, username, password); // Fixed syntax
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Database connection error: " + ex.getMessage());
        }
        return con;
    }
}



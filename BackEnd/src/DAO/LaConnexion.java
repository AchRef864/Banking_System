/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LaConnexion {
    private static Connection con;

    public static Connection seConnecter() {
        if (con == null) {
            try {
                // Load the SQL Server JDBC driver
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                // Modified connection URL with encrypt=false
                String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=bank;encrypt=false";

                con = DriverManager.getConnection(connectionUrl, "sa", "Bank_System");

                System.out.println("Connection established");
            } catch (ClassNotFoundException e) {
                System.out.println("Driver not found: " + e.getMessage());
            } catch (SQLException ex) {
                System.out.println("Database not found or authentication issue: " + ex.getMessage());
            }
        }
        return con;
    }
}



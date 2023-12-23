/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.Statement;

public class TestDAO {
    public static void main(String[] args) {
        Connection connection = LaConnexion.seConnecter();
        if (connection != null) {
            System.out.println("Database connectivity test passed.");
            /*try {
                connection.close();
                System.out.println("Connection closed.");
            } catch (Exception e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }*/
        } else {
            System.out.println("Database connectivity test failed.");
        }
    }
}


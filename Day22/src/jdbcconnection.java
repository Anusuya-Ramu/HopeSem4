package Day22.src;

import java.sql.*;

public class jdbcconnection {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/studentdb";
            String username = "anusuya";
            String password = "anusuya@1818";

            Connection connection = DriverManager.getConnection(url, username, password);

            System.out.println(connection.getSchema());
            System.out.println("Connection successful with database");

            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
package com.javaproject.me2aevents;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection con;

    
    public static Connection createDBConnection() {
        try {
            //load the driver Class
            //Class.forName("com.mysql.jdbc.Driver");
            //get Connection
            String url = "jdbc:mysql://localhost:3306/m2a_events?useSSL=false";
            String username = "root";
            String password = "";
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return con;
    }
}

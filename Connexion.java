package Projet;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class Connexion {
    public static Connection Connect() {
        try {
            Properties p = new Properties();
            try (FileInputStream file = new FileInputStream("BaseDonne.properties")) {
                p.load(file);
            }
            String urlPilote = p.getProperty("jdbc.driver.class");
            Class.forName(urlPilote);
            System.out.println("Le Pilote  a été bien chargé ");
            String urlBD = p.getProperty("jdbc.url");
            String user = p.getProperty("jdbc.user");
            String password = p.getProperty("jdbc.password");
            Connection con = DriverManager.getConnection(urlBD, user, password);
            System.out.println("Connexion bien établie ");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

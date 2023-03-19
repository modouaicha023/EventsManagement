package com.javaproject.me2aevents;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Visiteur {
    Connection con;

    public Visiteur() {
    }

    public int rechercherSalle(int capacite) throws InputMismatchException {
        con = DBConnection.createDBConnection();
        String query = "select * from salle where capacite >= ? and disponible=0 order by capacite";
        System.out.println("👉🏽 Noms des Salles : \n");
        int n = 0;
        int choixSalle = 0;
        try {
            Statement stmt = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, capacite);
            ResultSet result = pstmt.executeQuery();
            while (result.next()) {
                n++;
                System.out.format(" %d. %s\n", result.getInt(1), result.getString(2));
                System.out.println("🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼");
            }
            Scanner sc = new Scanner(System.in);
            System.out.print(" Voulez-Vous  Visualiser en Details Une Salle : ");
            System.out.println(" 1 🌼  OUI  🌼");
            System.out.println(" 2 🌼  NON  🌼");
            System.out.print(" Faite Votre Choix : ");
            try {
                int choix = sc.nextInt();
                if (choix == 1) {
                    System.out.print("🌼🌼🌼 Choisis le numero de Salle : ");
                    int choixSalleV = sc.nextInt();
                    choixSalle = visualiserDetails(choixSalleV);
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return choixSalle;

    }

    public int visualiserDetails(int id) {

        con = DBConnection.createDBConnection();
        String query = "select * from salle where id =" + id;
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                System.out.println("🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼\n");
                System.out.format("ID : %d \nNom De La Salle : %s \nCapacité : %d\nDescriptio : %s\n", result.getInt(1), result.getString(2), result.getInt(3), result.getString(5));
                System.out.println("🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼🌼\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }


}

package com.javaproject.me2aevents;

import java.sql.*;

import java.sql.PreparedStatement;

public class Employe extends Personne implements Personable<Employe> {
    Connection con;

    public void inscrire(Employe C) {
        Connection con = DBConnection.createDBConnection();
        String query = "insert into employe values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, C.getId());
            pstmt.setString(2, C.getNom());
            pstmt.setString(3, C.getPrenom());
            pstmt.setString(4, C.getEmail());
            pstmt.setString(5, C.getAddress());
            pstmt.setDouble(6, C.getTelephone());
            pstmt.setString(7, C.getMdp());
            int success = pstmt.executeUpdate();
            if (success != 0) {
                System.out.println("Felicitations Votre Compte a été crée 🎉🎉 ");
            } else
                System.out
                        .println("Désolé !!😔😔Une erreur s'est produit lors de la création de votre compte !! ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean connecter(int id, String mdp) {
        con = DBConnection.createDBConnection();
        boolean resultat = false;
        String query = "SELECT COUNT(*) AS nbUtilisateurs FROM employe WHERE id=? AND mdp=?";

        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, id);
            pstm.setString(2, mdp);
            ResultSet resultatRequete = pstm.executeQuery();

            // Si le résultat de la requête est égal à 1, l'utilisateur est dans la base de
            // données
            if (resultatRequete.next()) {
                int nbUtilisateurs = resultatRequete.getInt("nbUtilisateurs");
                if (nbUtilisateurs >= 1) {
                    resultat = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return resultat;
    }

    public void voirAllReservation() {
        con = DBConnection.createDBConnection();
        String query = "select * from reservation";
        System.out.println("✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦");
        System.out.println("✦                    Réservations                      ✦");
        System.out.println("✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦");

        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            int n = 0;
            while (result.next()) {
                n++;
                        
                        
                System.out.format("Reservation %d \nNumero Réservation : %d\nNumero ID Client : %d\nNumero ID Salle : %d\nDurée de  Réservationen En Jour : %d\nDate de Réservation : %s\n", n, result.getInt(1), result.getInt(2), result.getInt(3), result.getInt(4), result.getDate(5));
                System.out.println("✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    
    public void creerSalle(Salle R) {

        con = DBConnection.createDBConnection();
        String query = "insert into salle values(?,?,?,?,?)";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, R.getId());
            pstmt.setString(2, R.getNom());
            pstmt.setInt(3, R.getCapacite());
            pstmt.setBoolean(4, R.getDispo());
            pstmt.setString(5, R.getDesciption());
            int success = pstmt.executeUpdate();
            if (success != 0) {
                System.out.println("La Salle été crée 🎉🎉 ");
            } else
                System.out.println("Désolé !! 😔😔 Une erreur s'est produit lors de la création de la Salle !! ");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Désolé !! 😔😔 Une erreur s'est produit lors de la création de la Réservation !! ");
        }
    }


    


}

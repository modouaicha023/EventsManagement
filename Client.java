package com.javaproject.me2aevents;

import java.sql.*;

public class Client extends Personne implements Personable<Client> {
    Connection con;

    public Client() {
    }

    @Override
    public void inscrire(Client C) {
        con = DBConnection.createDBConnection();
        String query = "insert into client values(?,?,?,?,?,?,?)";
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
                System.out.println("Felicitations Votre Compte a été crée \\(°o°)/ ");
            } else
                System.out.println("Désolé !! /(-_-)\\Une erreur s'est produit lors de la création de votre compte !! ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean connecter(int id, String mdp) {
        con = DBConnection.createDBConnection();
        boolean resultat = false;
        String query = "SELECT COUNT(*) AS nbUtilisateurs FROM client WHERE id=? AND mdp=?";

        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, id);
            pstm.setString(2, mdp);
            ResultSet resultatRequete = pstm.executeQuery();

            // Si le résultat de la requête est égal à 1, l'utilisateur est dans la base de données
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

    public void rechercherSalle(int capacite) {
        con = DBConnection.createDBConnection();
        String query = "select * from salle where capacite >=" + capacite;
        System.out.println("Noms des Salles\n");
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                System.out.format("%s\n", result.getString(2));
                System.out.println("-------------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void visualiserDetails(int id) {

        con = DBConnection.createDBConnection();
        String query = "select * from salle where id =" + id;
        System.out.println("Nom\tCapacité\tDisponibilité\tDescription");
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                System.out.format("%d\t%s\t%.2f\t%d\n", result.getString(2), result.getInt(3), result.getBoolean(4), result.getString(5));
                System.out.println("------------------------------------------------------------------------------------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void planifierEvenment(Evenement Ev) {
        con = DBConnection.createDBConnection();
        String query = "insert into evenement values(?,?,?,?,?,?)";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, Ev.getIdEvenement());
            pstmt.setString(2, Ev.getNom());
            pstmt.setInt(3, Ev.getNombreInvite());
            pstmt.setDate(4, (Date) Ev.getDate());
            pstmt.setInt(5, Ev.getIdSalle());
            pstmt.setInt(6, Ev.getIdClient());
            int success = pstmt.executeUpdate();
            if (success != 0) {
                System.out.println("Felicitations Votre Evenement a été crée \\(°o°)/ ");
            } else
                System.out.println("Désolé !! /(-_-)\\Une erreur s'est produit lors de la création de votre Evenement !! ");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void faireReservation(Reservation R) {
        con = DBConnection.createDBConnection();
        String query = "insert into reservation values(?,?,?,?,?)";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, R.getIdReservation());
            pstmt.setInt(2, R.getIdClient());
            pstmt.setInt(3, R.getIdSalle());
            pstmt.setInt(4, R.getDureReservationenEnJour());
            pstmt.setDate(5, (Date) R.getDateReservation());
            int success = pstmt.executeUpdate();
            if (success != 0) {
                System.out.println("La Réservationa été crée \\(°o°)/ ");
            } else
                System.out.println("Désolé !! /(-_-)\\Une erreur s'est produit lors de la création de la Réservation !! ");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Désolé !! /(-_-)\\Une erreur s'est produit lors de la création de la Réservation !! ");
        }

    }

    public void voirReservations(int id) {

        con = DBConnection.createDBConnection();
        String query = "select * from reservation where idClient =" + id;
        System.out.println("\n                    Réservations                       ");
        System.out.println("---------------------------------------------------------");

        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            int n = 0;
            while (result.next()) {
                n++;
                System.out.format("Reservation %d \nNumero Réservation : %d\nNumero ID Client : %d\nNumero ID Salle : %d\nDurée de  Réservationen En Jour : %d\nDate de Réservation : %s\n", n, result.getInt(1), result.getInt(2), result.getInt(3), result.getInt(4), result.getDate(5));
                System.out.println("---------------------------------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteReservation(int id) {
        con = DBConnection.createDBConnection();
        String query = "delete from reservation where id =" + id;

        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            System.out.println("La Réservation est Supprimée");
        } catch (Exception e) {
            e.printStackTrace();

        }
    }


}
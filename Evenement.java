package com.javaproject.me2aevents;

import java.sql.Date;

public class Evenement {
    private int idEvenement;
    private String nom;
    private int nombreInvite;
    private Date date;
    private int IdSalle;
    private int IdClient;

    public Evenement() {
    }

    public int getIdClient() {
        return IdClient;
    }
    

    public Evenement(int idEvenement, String nom, int nombreInvite, Date date, int idSalle, int idClient) {
        this.idEvenement = idEvenement;
        this.nom = nom;
        this.nombreInvite = nombreInvite;
        this.date = date;
        IdSalle = idSalle;
        IdClient = idClient;
    }

    @Override
    public String toString() {
        return "Evenement{" +
                "idEvenement=" + idEvenement +
                ", nom='" + nom + '\'' +
                ", nombreInvite=" + nombreInvite +
                ", date=" + date +
                ", IdSalle=" + IdSalle +
                ", IdClient=" + IdClient +
                '}';
    }

    public void setIdClient(int idClient) {
        IdClient = idClient;
    }

    public Evenement(int idEvenement, String nom, int nombreInvite, Date date, int idSalle) {
        this.idEvenement = idEvenement;
        this.nom = nom;
        this.nombreInvite = nombreInvite;
        this.date = date;
        IdSalle = idSalle;
    }

    public int getIdEvenement() {
        return idEvenement;
    }

    public void setIdEvenement(int idEvenement) {
        this.idEvenement = idEvenement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreInvite() {
        return nombreInvite;
    }


    public void setNombreInvite(int nombreInvite) {
        this.nombreInvite = nombreInvite;
    }

    public java.util.Date getDate() {
        return (java.util.Date) date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdSalle() {
        return IdSalle;
    }

    public void setIdSalle(int idSalle) {
        IdSalle = idSalle;
    }

}

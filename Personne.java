package com.javaproject.me2aevents;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Personne {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String address;
    private double telephone;
    private String mdp;

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Personne(int id, String nom, String prenom, String email, String address, double telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.address = address;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTelephone() {
        return telephone;
    }

    public void setTelephone(double telephone) {
        this.telephone = telephone;
    }

    public Personne() {
    }



    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", telephone=" + telephone +
                '}';
    }

}

package com.javaproject.me2aevents;

import java.util.Scanner;

public class Salle {
    private int id;
    private String nom;
    private int capacite;
    private Boolean dispo;
    private String desciption;


    public Salle(int id, String nom, int capacite, Boolean dispo, String desciption) {
        this.id = id;
        this.nom = nom;
        this.capacite = capacite;
        this.dispo = dispo;
        this.desciption = desciption;
    }


    public Salle() {
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

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Boolean getDispo() {
        return dispo;
    }

    public void setDispo(Boolean dispo) {
        this.dispo = dispo;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }


}

package Projet;

import java.util.ArrayList;

public class Salle {

    private int idSalle;
    private String nom;
    private int capacite;
    private Boolean dispo;
    private String desciption;

    public Salle(int idSalle, String nom, int capacite, Boolean dispo) {
        this.idSalle = idSalle;
        this.nom = nom;
        this.capacite = capacite;
        this.dispo = dispo;
    }

    public Salle() {
    };

    public int getIdSalle() {
        return this.idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return this.capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Boolean getDispo() {
        return this.dispo;
    }

    public void setDispo(Boolean dispo) {
        this.dispo = dispo;
    }

}

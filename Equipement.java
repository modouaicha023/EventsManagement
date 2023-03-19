package com.javaproject.me2aevents;

public class Equipement {
    private String nom;
    private int quantite;
    private long cout;
    private boolean disponible;

    public Equipement(String nom, int quantite, long cout, boolean disponible) {
        this.nom = nom;
        this.quantite = quantite;
        this.cout = cout;
        this.disponible = disponible;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public long getCout() {
        return cout;
    }

    public void setCout(long cout) {
        this.cout = cout;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

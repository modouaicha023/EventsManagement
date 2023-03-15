package Projet;

import java.time.LocalDate;

public class Evenement {
    private int idEvenement;
    private String nom;
    private int nombreInvite;
    private LocalDate date;
    private int IdSalle;
    private List<Equipement> equipements;

    public Evenement(int idEvenement, String nom, int nombreInvite, LocalDate date) {
        this.idEvenement = idEvenement;
        this.nom = nom;
        this.nombreInvite = nombreInvite;
        this.date = date;
    }

    public Evenement() {
    };

    public int getIdEvenement() {
        return this.idEvenement;
    }

    public void setIdEvenement(int idEvenement) {
        this.idEvenement = idEvenement;
    }

    public String getnom() {
        return this.nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public int getnombreInvite() {
        return this.nombreInvite;
    }

    public void setnombreInvite(int nombreInvite) {
        this.nombreInvite = nombreInvite;
    }

    public LocalDate getdate() {
        return this.date;
    }

    public void setdate(LocalDate date) {
        this.date = date;
    }

}

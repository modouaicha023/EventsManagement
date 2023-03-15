package Projet;

public class Equipement {
    private String nom;
    private int quantite;
    private long cout;
    private boolean disponible;

    public Equipement(int idEquipement, String nom, int quantite, Long cout) {
        this.idEquipement = idEquipement;
        this.nom = nom;
        this.quantite = quantite;
        this.cout = cout;
    }

    public Equipement() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String Nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantité(int Quantité) {
        this.quantite = quantite;
    }

    public long getCout() {
        return cout;
    }

    public void setCout(long cout) {
        this.cout = cout;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
}

package Projet;

import java.util.ArrayList;

public class Employe {
    private int idEmploye;
    private String nom;
    private String email;
    private String address;
    private String telephone;

    public Employe(int idClient, String nom, String email, String address) {
        this.idEmploye = idClient;
        this.nom = nom;
        this.email = email;
        this.address = address;
    }

    public Employe() {
    };

    public int getIdEmploye() {
        return this.idEmploye;
    }

    public void setIdEmploye(int idClient) {
        this.idEmploye = idClient;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}

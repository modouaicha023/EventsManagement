package Projet;

import java.util.ArrayList;

public class M2AEvents {
    private ArrayList<Client> clients;
    private ArrayList<Employe> employes;
    private ArrayList<Salle> salles;
    private ArrayList<Reservation> reservations;

    public M2AEvents() {
    }

    public ArrayList<Client> getClients() {
        return this.clients;
    }

    public ArrayList<Employe> getEmployes() {
        return this.employes;
    }

    public ArrayList<Salle> getSalles() {
        return this.salles;
    }

    public ArrayList<Reservation> getReservations() {
        return this.reservations;
    }

}

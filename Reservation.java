package com.javaproject.me2aevents;

import java.sql.Date;

public class Reservation {
    private int idReservation;
    private int idClient;
    private int idSalle;
    private int dureReservationenEnJour;
    private Date dateReservation;

    public Reservation(int idReservation, int idClient, int idSalle, int dureReservationenEnJour, Date dateReservation) {
        this.idReservation = idReservation;
        this.idClient = idClient;
        this.idSalle = idSalle;
        this.dureReservationenEnJour = dureReservationenEnJour;
        this.dateReservation = dateReservation;
    }

    public Reservation() {

    }


    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public int getDureReservationenEnJour() {
        return dureReservationenEnJour;
    }

    public void setDureReservationenEnJour(int dureReservationenEnJour) {
        this.dureReservationenEnJour = dureReservationenEnJour;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "idReservation=" + idReservation +
                ", idClient=" + idClient +
                ", idSalle=" + idSalle +
                ", dureReservationenEnJour=" + dureReservationenEnJour +
                ", dateReservation=" + dateReservation +
                '}';
    }
}

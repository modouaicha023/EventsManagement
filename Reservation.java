package Projet;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Reservation {
    private int idReservation;
    private int idClient;
    private int idSalle;
    private LocalTime dureReservation;
    private LocalDate dateReservation;
    
    

    public Reservation(int idReservation, int idClient, int idSalle, LocalTime dureReservation, LocalDate dateReservation) {
        this.idReservation=idReservation;
        this.idClient=idClient;
        this.idSalle = idSalle;
        this.dateReservation = dateReservation;
        this.dureReservation=dureReservation;
    }
    public Reservation(){};

    public int getIdReservation() {return idReservation;}
    public int getIdClient() {return idClient;}
    public int getIdSalle() {return idSalle;}
    public LocalDate getDateReservation() {return dateReservation;}
    public LocalTime getDureReservation() {return dureReservation;}


    public void setidReservation(int idReservation){this.idReservation=idReservation;}
    public void setIdSalle(int idSalle) {this.idSalle=idSalle;}
    public void setidClient(int idClient) {this.idClient=idClient;}
    public void setdateReservation(LocalDate dateReservation){this.dateReservation=dateReservation;}
    public void setDureReservation(LocalTime dureReservation){this.dureReservation=dureReservation;}



    

}

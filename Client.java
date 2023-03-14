package Projet;
import java.util.ArrayList;
public class Client {
    private int idClient ;
    private String nom;
    private String email;
    private String address;

    public Client(int idClient, String nom, String email, String address){
        this.idClient=idClient;
        this.nom=nom;
        this.email=email;
        this.address=address;
    }
    public Client(){};

    public int getIdClient(){return this.idClient;}
    public void setIdClient(int idClient){this.idClient = idClient;}

    public String getNom(){return this.nom;}
    public void setNom(String nom){this.nom = nom;}

    public String getEmail(){return this.email;}
    public void setEmail(String email){this.email = email;}

    public String getAddress(){return this.address;}
    public void setAddress(String address){this.address = address;}

    public void creerReservation(){

    }



    

}

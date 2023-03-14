package Projet;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {


    public static int acceuilPrincipale(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--------Bienvenue Dans M2A_Events :) --------");
        System.out.println("Avec Nous Votre Evenement Sera un Succes \\(°o°)/\n");
        System.out.println(" 1 --> Visualiser les Salles  ('_')");
        System.out.println(" 2 --> Visualiser les Décorations ");
        System.out.println(" 3 --> Quitter (x_x)");
        System.out.println("Veuillez choisir parmi ces options : ");
        int choix = sc.nextInt();
        return choix;
    }
    public static int visualiserSalle(int choix){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--------Voici les Salles Disponivble dans Notre Companie :) --------");
        System.out.println("\n");
        System.out.println(" 1 --> Visualiser les Salles  ('_')");
        System.out.println(" 2 --> Visualiser les Décorations ");
        System.out.println(" 3 --> Quitter (x_x)");
        System.out.println("Veuillez choisir parmi ces options : ");
        int choix1 = sc.nextInt();
        return choix;
    }
}
    
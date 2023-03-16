package Projet;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    }

    public static int acceuilPrincipale() {
        Scanner sc = new Scanner(System.in);
        System.out.println("╭────────────────────────────────────────────────────╮");
        System.out.println("|                                                    |");
        System.out.println("|           ✦ Bienvenue Chez M2A_Events ✦           |");
        System.out.println("| ✦ Le meilleur dans l'organisation d'évènement✦    |");
        System.out.println("|                                                    |");
        System.out.println("╰────────────────────────────────────────────────────╯");
        System.out.println("         Veuillez faire un choix                    ");
        System.out.println(" 1 ❀  recherche de salles  ");
        System.out.println(" 2 ❀ détails de la salle [numéro] ");
        System.out.println(" 3 ❀ Quitter (x_x)");
        System.out.println("Veuillez choisir parmi ces options : ");
        int choix = sc.nextInt();
        return choix;
    }

    public static int visualiserSalle(int choix) {
        Scanner sc = new Scanner(System.in);
        System.out.println(".·:*¨༺ ༻¨*:·. Voici les Salles Disponible dans Notre Compagnie .·:*¨༺ ༻¨*:·.");
        System.out.println("\n");
        System.out.println(" 1 --> Visualiser les Salles  🌷");
        System.out.println(" 2 --> Visualiser les Décorations ");
        System.out.println(" 3 --> Quitter (x_x)");
        System.out.println("Veuillez choisir parmi ces options : ");
        int choix1 = sc.nextInt();
        return choix1;
    }
}

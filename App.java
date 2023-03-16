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
        System.out.println(" 1 ❀        rechercher les salles                   ❀");
        System.out.println(" 2 ❀            Se Connecter                        ❀");
        System.out.println(" 3 ❀             S'inscrire                         ❀");
        System.out.println(" 4 ❀               Quitter                          ❀");
        System.out.println("         Veuillez choisir parmi ces options :         ");
        System.out.println("         ────────────────────────────────────         ");
        System.out.println("                    \\   ^__^                         ");
        System.out.println("                     \\  (oo)\\ _______               ");
        System.out.println("                      \\ (__)\\        )\\/\\         ");
        System.out.println("                             ||----w |                ");
        System.out.println("                             ||     ||                ");
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

    public static void Sinscrire() {
        Scanner sc = new Scanner(System.in);
        System.out.println("✦veuiller entrer votre Nom   ✦");
        varchar nom = sc.next();
        System.out.println("✦veuiller entrer votre Prenom✦");
        varchar prenom = sc.next();
        system.out.println("✦veuiller entrer votre Email    ✦");
        varchar email = sc.next();
        system.out.println("✦veuiller entrer votre Adresse  ✦");
        varchar adresse = sc.next();
    }
}

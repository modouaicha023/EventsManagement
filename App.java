package com.javaproject.me2aevents;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int choix;
        String choixMenu;
        int choixUser = 0;
        try {
            System.out.println("   ???  VOUS ETES ??? ");
            System.out.println("1. Client");
            System.out.println("2. Employe");
            choixUser = sc.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        if (choixUser == 1) {
            do {
                choix = acceuilPrincipale();
                switch (choix) {
                    case 1:
                        Visiteur V = new Visiteur();
                        int c = rechercher(V);
                        if (c != 0) {
                            int idd = connexion();
                            if (idd != 0) {
                                int choixClient = menuApresConnexion();
                                pageConnexion(idd, choixClient);
                                System.out.println("\n\n \t\t\t\t Vous etes maintenant Connecté \\(X_x)l");
                            }
                        }
                        break;
                    case 2:
                        int id = connexion();
                        if (id != 0) {
                            int choixClient;
                            choixClient = menuApresConnexion();
                            pageConnexion(id, choixClient);
                            System.out.println("\n\n \t\t\t\t Vous etes maintenant Connecté \\(X_x)l");
                        }
                        break;
                    case 3:
                        Client client = new Client();
                        creerClient(client);
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Choix Indisponible");
                        break;
                }
                if (choix == 4) {
                    choixMenu = "k";
                } else {
                    System.out.println("\nVoulez-vous Retourner Au Menu Principale ? ");
                    System.out.print("Taper *y* pour OUI ou N'importe Quelle Touche pour NON !! : ");
                    choixMenu = sc.next();
                }
            } while (choixMenu.equals("y"));
            System.out.println("\n\n \t\t\t\t A Bientot et Merci d'etre Passer Chez M2A_Events :) ");
        }

        if (choixUser == 2) {
            do {
                choix = acceuilPrincipaleEmploye();
                switch (choix) {
                    case 1:
                        int id = connexionEmploye();
                        if (id != 0) {
                            int choixClient;
                            choixClient = menuApresConnexionEmploye();
                            pageConnexionEmploye(choixClient);
                            System.out.println("\n\n \t\t\t\t Vous etes maintenant Connecté \\(²_²)L");
                        }
                        break;
                    case 2:
                        Employe Em = new Employe();
                        creerEmploye(Em);
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Choix Indisponible");
                        break;
                }
                if (choix == 3) {
                    choixMenu = "k";
                } else {
                    System.out.println("\nVoulez-vous Retourner Au Menu Principale ? ");
                    System.out.print("Taper *y* pour OUI ou N'importe Quelle Touche pour NON !! : ");
                    choixMenu = sc.next();
                }
            } while (choixMenu.equals("y"));
            System.out.println("\n\n \t\t\t\t A Bientot et Merci d'etre Passer Chez M2A_Events :) ");

        } else {
            System.out.println("Choix Indisponible");
        }
    }

    public static int acceuilPrincipale() throws InputMismatchException {
        int i = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("             ┼┼┼┼┼┼┼▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄┼┼┼┼┼┼           ");
            System.out.println("             ┼┼┼┼┼┼┼█▒▒░░░░░░░░░▒▒█┼┼┼┼┼┼           ");
            System.out.println("             ┼┼┼┼┼┼┼┼█░░█░░░░░█░░█┼┼┼┼┼┼┼           ");
            System.out.println("             ┼┼┼┼─▄▄──█░░░▀█▀░░░█──▄▄─┼┼┼           ");
            System.out.println("             ┼┼┼┼█░░█─▀▄░░░░░░░▄▀─█░░█┼┼┼           ");
            System.out.println("             ┼██░██░████░██░░░██░░░█████┼           ");
            System.out.println("             ┼██▄██░██▄▄░██░░░██░░░██░██┼           ");
            System.out.println("             ┼██▀██░██▀▀░██░░░██░░░██░██┼           ");
            System.out.println("             ┼██░██░████░████░████░█████┼           ");
            System.out.println("╭────────────────────────────────────────────────────╮");
            System.out.println("|                                                    |");
            System.out.println("|           ✦ Bienvenue Chez M2A_Events ✦           |");
            System.out.println("| ✦ Le meilleur dans l'organisation d'évènement✦    |");
            System.out.println("|                                                    |");
            System.out.println("╰────────────────────────────────────────────────────╯");
            System.out.println(" 1 ❀        Rechercher les salles                   ❀");
            System.out.println(" 2 ❀            Se Connecter                        ❀");
            System.out.println(" 3 ❀             S'inscrire                         ❀");
            System.out.println(" 4 ❀        Quitter l'Application                   ❀");
            System.out.println("         Veuillez choisir parmi ces options :         ");
            System.out.println("         ────────────────────────────────────         ");
            System.out.println("                    \\   ^__^                         ");
            System.out.println("                     \\  (oo)\\ _______               ");
            System.out.println("                      \\ (__)\\        )\\/\\         ");
            System.out.println("                             ||----w |                ");
            System.out.println("                             ||     ||                ");
            i = sc.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        return i;
    }

    public static int acceuilPrincipaleEmploye() throws InputMismatchException {
        int i = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("             ┼┼┼┼┼┼┼▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄┼┼┼┼┼┼           ");
            System.out.println("             ┼┼┼┼┼┼┼█▒▒░░░░░░░░░▒▒█┼┼┼┼┼┼           ");
            System.out.println("             ┼┼┼┼┼┼┼┼█░░█░░░░░█░░█┼┼┼┼┼┼┼           ");
            System.out.println("             ┼┼┼┼─▄▄──█░░░▀█▀░░░█──▄▄─┼┼┼           ");
            System.out.println("             ┼┼┼┼█░░█─▀▄░░░░░░░▄▀─█░░█┼┼┼           ");
            System.out.println("             ┼██░██░████░██░░░██░░░█████┼           ");
            System.out.println("             ┼██▄██░██▄▄░██░░░██░░░██░██┼           ");
            System.out.println("             ┼██▀██░██▀▀░██░░░██░░░██░██┼           ");
            System.out.println("             ┼██░██░████░████░████░█████┼           ");
            System.out.println("╭────────────────────────────────────────────────────╮");
            System.out.println("|                                                    |");
            System.out.println("|           ✦ Bienvenue Chez M2A_Events ✦           |");
            System.out.println("| ✦ Le meilleur dans l'organisation d'évènement✦    |");
            System.out.println("|                                                    |");
            System.out.println("╰────────────────────────────────────────────────────╯");
            System.out.println(" 1 ✦   Se Connecter                                 ✦");
            System.out.println(" 2 ✦   S'Inscrire                                 ✦");
            System.out.println(" 3 ✦   Quitter L'Application                      ✦");
            System.out.println("Veuillez Choisir parmi ces options : ");
            i = sc.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return i;
    }

    public static int menuApresConnexion() throws InputMismatchException {
        int m = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("               ┼┼┼┼┼┼┼▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄┼┼┼┼┼┼            ");
            System.out.println("               ┼┼┼┼┼┼┼█▒▒░░░░░░░░░▒▒█┼┼┼┼┼┼            ");
            System.out.println("               ┼┼┼┼┼┼┼┼█░░█░░░░░█░░█┼┼┼┼┼┼┼            ");
            System.out.println("               ┼┼┼┼─▄▄──█░░░▀█▀░░░█──▄▄─┼┼┼             ");
            System.out.println("               ┼┼┼┼█░░█─▀▄░░░░░░░▄▀─█░░█┼┼┼            ");
            System.out.println("╭────────────────────────────────────────────────────╮");
            System.out.println("|                                                    |");
            System.out.println("|    .·:*¨༺ ༻¨*:·.❀M2A_Events❀.·:*¨༺ ༻¨*:·.      |");
            System.out.println("|                ❀Tableau De Bord❀                  |");
            System.out.println("|                                                    |");
            System.out.println("╰────────────────────────────────────────────────────╯");
            System.out.println(" 1 ❀        Rechercher les Salles                   ❀");
            System.out.println(" 2 ❀          Planifier un Evenement                 ❀");
            System.out.println(" 3 ❀         Voir Mes Réservation                   ❀");
            System.out.println(" 4 ❀             Déconnexion (x_x)                   ❀");
            System.out.println("Veuillez choisir parmi ces options :                  ");
            m = sc.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return m;
    }

    public static int menuApresConnexionEmploye() throws InputMismatchException {
        int a = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("╭────────────────────────────────────────────────────╮");

            System.out.println("|                ✦Tableau De Bord✦                  |");
            System.out.println("|                                                    |");
            System.out.println("╰────────────────────────────────────────────────────╯");
            System.out.println("Avec Nous Votre Evenement Sera un Succes \n           ");
            System.out.println(" 1 ✦   Gérer Les Réservations                       ✦");
            System.out.println(" 2 ✦   Voir Toutes Les Réservations                 ✦");
            System.out.println(" 3 ✦   Ajouter Des Salles                           ✦");
            System.out.println(" 4 ✦   Déconnexion                                 ✦");
            System.out.println("    Veuillez choisir parmi ces options : ");
            a = sc.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return a;
    }

    public static Client creerClient(Client C) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("❀❀❀ Entrer Votre identifiant ❀❀❀");
            int idClient = sc.nextInt();
            System.out.println("❀❀❀ Entrer Votre Nom ❀❀❀ ");
            String nom = sc.next();
            System.out.println("❀❀❀ Entrer Votre Prénom ❀❀❀");
            String prenom = sc.next();
            System.out.println("❀❀❀ Entrer Votre Email ❀❀❀");
            String email = sc.next();
            System.out.println("❀❀❀ Entrer Votre Addresse ❀❀❀");
            String addresse = sc.next();
            System.out.println("❀❀❀ Entrer Votre Numéro De Téléphone ❀❀❀");
            double telephone = sc.nextDouble();
            System.out.println("❀❀❀ Entrer Votre Mot De Passe ❀❀❀");
            String mdp = sc.next();
            C.setId(idClient);
            C.setNom(nom);
            C.setPrenom(prenom);
            C.setEmail(email);
            C.setAddress(addresse);
            C.setTelephone(telephone);
            C.setMdp(mdp);

            C.inscrire(C);
        } catch (InputMismatchException e) {
         

        
        return C;
    }

    public static Employe creerEmploye(Employe C) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("✦✦✦ Entrer Votre identifiant ✦✦✦");
            int idClient = sc.nextInt();
            System.out.println("✦✦✦ Entrer Votre Nom ✦✦✦");
            String nom = sc.next();
            System.out.println("✦✦✦ Entrer Votre Prénom ✦✦✦");
            String prenom = sc.next();
            System.out.println("✦✦✦ Entrer Votre Email ✦✦✦");
            String email = sc.next();
            System.out.println("✦✦✦ Entrer Votre Addresse ✦✦✦");
            String addresse = sc.next();
            System.out.println("✦✦✦ Entrer Votre Numéro De Téléphone ✦✦✦");
            double telephone = sc.nextDouble();
            System.out.println("✦✦✦ Entrer Votre Mot De Passe ✦✦✦");
            String mdp = sc.next();
            C.setId(idClient);
            C.setNom(nom);
            C.setPrenom(prenom);
            C.setEmail(email);
            C.setAddress(addresse);
            C.setTelephone(telephone);
            C.setMdp(mdp);

            C.inscrire(C);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return C;
    }

    public static int rechercher(Visiteur V) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int choix = 0;
        try {
            System.out.println("❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀ ❀") 
            System.out.println("❀                                      ❀");
            System.out.println("❀ Bienvienue dans le menu de recherche ❀");
            System.out.println("❀                                      ❀");
            System.out.println("❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀ ❀")
            System.out.println("Veuillez Enter la Capacité de la salle Que vous voulez !! ");
            int capacite = sc.nextInt();
            int c = V.rechercherSalle(capacite);
            if (c != 0) {
                System.out.print("Voulez-Vous  Louer Une Salle Pour Un Evenement  : ");
                System.out.println("\n 1 ❀  OUI  ❀");
                System.out.println("   2 ❀  NON  ❀");
                choix = sc.nextInt();
            }
            if (choix == 1) {
                choix = c;
            } else {
                choix = 0;
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        return choix;
    }

    public static int connexion() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        try {
            System.out.println("❀❀❀ Page De Connexion  ❀❀❀");
            System.out.print("\n❀❀❀   Identifiant :      ❀❀❀");
            int identifiant = sc.nextInt();
            System.out.print("  ❀❀❀   Mot de Passe :     ❀❀❀");
            String motDePasse = sc.next();
            System.out.print("\n");
            Client C1 = new Client();
            boolean r = C1.connecter(identifiant, motDePasse);
            if (r) {
                System.out.println("❀❀❀ Connexion Reussi!! ❀❀❀");
                id = identifiant;
            } else {
                System.out.println("⚠️⚠️ Ce Compte n'existe pas !!!! ⚠

                

                    
                    Client client = new Client();
                    client.inscrire(creerClient(client));
                    id = client.getId();
                }

            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        return id;
    }

    public static int connexionEmploye() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        try {
            System.out.println("✦✦✦ Page De Connexion ✦✦✦");
            System.out.print("\n✦✦   Identifiant :      ✦✦");
            int identifiant = sc.nextInt();
            System.out.print(" ✦✦Mot de Passe :         ✦✦");
            String motDePasse = sc.next();
            System.out.print("\n");
            Employe C1 = new Employe();
            boolean r = C1.connecter(identifiant, motDePasse);
            if (r) {
                System.out.println("👍🏽 Connexion Reussi !!👍🏽 ");
                id = identifiant;
            } else {
                System.out.println("⚠️⚠️ Ce Compte n'existe pas !!!! ⚠️⚠️");
                System.out.println("❀ Voulez-vous vous inscrire ? ❀");
                System.out.println(" 1 ❀  OUI  ❀");
                System.out.println(" 2 ❀  NON  ❀");
                int choix = sc.nextInt();
                if (choix == 1) {
                    Employe client = new Employe();
                    client.inscrire(creerEmploye(client));
                    id = client.getId();
                }

            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

     

    
            
    public static Evenement creerEvenement(Evenement Ev, int idClient, int idSalle) throws ParseException, InputMismatchException {
        Scanner sc = new Scanner(System.in);


            
            System.out.println("❀❀❀ Entrer Le Nombre D'invité ❀❀❀");
            int nombreInvite = sc.nextInt();
            System.out.println("❀❀❀ Entrer La Date de L'Evenement en yyyy-MM-dd ❀❀❀");
            String dateString = sc.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date utilDate;
            utilDate = dateFormat.parse(dateString);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

            Ev.setIdEvenement(idEvenement);
            Ev.setNom(nom);
            Ev.setNombreInvite(nombreInvite);
            Ev.setDate(sqlDate);
            Ev.setIdClient(idClient);
            Ev.setIdSalle(idSalle);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return Ev;
    }

    public static void creerReservation(int idClient, Evenement E) throws InputMismatchException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("❀❀❀ Voulez-Vous Faire Une Réservation? \n❀❀❀");
            System.out.println(" 1 ❀  OUI                 ❀");
            System.out.println(" 2 ❀  NON                 ❀
            
            ?.");
            int choix = sc.nextInt();
            if (choix == 1) {

    Reservation R = new Res ervation();

    System.out.println("❀❀❀ Entrer la Durée de 
    int dureReservationenEnJour =
    int idSalle = E.getIdSalle();

    R.setDureReservationenEnR.setIdClient(idClientR.setIdSalle(idSalle);

    Client C = new Client(    }
    
    
        tch (InputMismatchEx
        e.printStackTrace();
        }


    
    public static void pageConnexion(int id, int choixClient) {
        Scanner sc = new Scanner(System.in);
        String choixMenu;
        do {

            switch (choixClient) {
                case 1:
                    Visiteur V = new Visiteur();
                    Evenement Ev = new Evenement();
                    int c1 = rechercher(V);
                    if (c1 != 0) {
                        try {
                            creerEvenement(Ev, id, c1);
                        } catch (ParseException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("❀❀ Bienvenue sur le Menu de Planification d'Evenement ❀❀");
                        Client C = new Client();
                        C.planifierEvenment(Ev);
                        creerReservation(id, Ev);
                    } else
                        System.out.println("Error de planification !!⚠️ ");

                    break;
                case 2:
                    Visiteur V1 = new Visiteur();
                    Evenement Evv = new Evenement();
                    int c = rechercher(V1);
                    System.out.println("❀❀ Bienvenue sur le Menu de Planification d'Evenement ❀❀");
                    if (c != 0) {
                        try {
                            Evenement E= creerEvenement(Evv, id, c);
                            Client C = new Client();
                            C.planifierEvenment(E);
                            creerReservation(id, E);
                        } catch (ParseException e) {
                            throw new RuntimeException(e);
                        }

                    } else
                        System.out.println("Error de planification !!⚠️ ");

                    break;
                case 3:
                    Client Cl = new Client();
                    Cl.voirReservations(id);
                    System.out.println("❀❀ Voulez-vous Supprimez Une Réservation ? ❀❀");
                    System.out.println(" 1 ❀  OUI       ❀");
                    System.out.println(" 2 ❀  NON       ❀");
                    int c2 = sc.nextInt();
                    if (c2 == 1) {
                        Cl.deleteReservation(c2);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Choix Indisponible😔😔");
                    break;
            }
            if (choixClient == 4) {
                choixMenu = "k";
            } else {
                System.out.println("\n ❀❀❀ Voulez-vous Retourner Au menu Cher Client ? ");
                System.out.print("👉🏽 Taper *y* pour OUI ou N'importe Quelle Touche pour NON !! : ");
                choixMenu = sc.next();
            }
        } while (choixMenu.equals("y"));


    
    Scanner sc = new Scanner(S
    Employe E = new ESt
    i
        
            ch (cho
                 1:
                E.gere
                bre
                 2:
                E.voir
                bre
                 3:
                Salle S = new Salle
                creati
                bre
                 4:
                brea
                ult:
                System
         
        }
            choixEmploye == 
            choi
            se {
            System.out.println("\nVoulez-vous Retourner Au menu Cher Client ?👀");
            System.out.print("👉🏽
         
       }
        } while (choixMenu.equals("y"));

    }

    public static void creationDeSalle(Salle S) {
        Scanner sc = new Scanner(System.in);
        Employe E = new Employe();
        System.out.print("👉🏽👉🏽👉🏽Entrer Le Nom de la Salle : ");
        String nom = sc.next();
        System.out.print("👉🏽👉🏽👉🏽Donner la Capacité de La Salle : ");
        int capacite = sc.nextInt();
        System.out.print("👉🏽👉🏽👉🏽Entrer La Disponbilité : tapez true ou false ");
        boolean dispo = sc.nextBoolean();
        System.out.print("👉🏽👉🏽👉🏽Entrer La Description de la Salle : ");
        String description = sc.next();
        S.setNom(nom);
        S.setCapacite(capacite);
        S.setDesciption(description);
        S.setDispo(dispo);
        E.creerSalle(S);

 


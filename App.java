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
        ;
        String menu;

        do {
            int choixUser = Accueil();
            switch (choixUser) {
                case 1:
                    String choixMenu;
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
                                        System.out.println("\n\n \t\t\t\t Vous etes maintenant DéConnecté \\(X_x)l");
                                    }
                                }
                                break;
                            case 2:
                                int id = connexion();
                                if (id != 0) {
                                    int choixClient;
                                    choixClient = menuApresConnexion();
                                    pageConnexion(id, choixClient);
                                    System.out.println("\n\n \t\t\t\t Vous etes maintenant Déconnecté \\(X_x)l");
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
                    break;
                case 2:
                    String choixMenue;
                    do {
                        int choix1 = acceuilPrincipaleEmploye();
                        switch (choix1) {
                            case 1:
                                int id = connexionEmploye();
                                if (id != 0) {
                                    int choixClient = menuApresConnexionEmploye();
                                    pageConnexionEmploye(id,choixClient);
                                    System.out.println("\n\n \t\t\t\t Vous etes maintenant Déconnecté \\(ù_!)L");
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
                        if (choix1 == 3) {
                            choixMenue = "k";
                        } else {
                            System.out.println("\nVoulez-vous Retourner Au Menu Principale ('-') ? ");
                            System.out.print("Taper *y* pour OUI ou N'importe Quelle Touche pour NON !! : ");
                            choixMenue = sc.next();
                        }
                    } while (choixMenue.equals("y"));
                    System.out.println("\n\n \t\t\t\t A Bientot et Merci d'etre Passer Chez M2A_Events :) ");
                    break;
                case 3:
                    break;
                default: {
                    System.out.println("Bye Bye \\(''_'')");
                }
                break;
            }
            if (choixUser == 3) {
                menu = "k";
            } else {
                System.out.println("\nVoulez-vous Retourner Au Menu ? ");
                System.out.print("Taper *y* pour OUI ou n'importe quelle touche pour NON !! : ");
                menu = sc.next();
            }
        } while (menu.equals("y"));
    }

    public static int Accueil() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);

        int choixUser = 0;
        try {
            System.out.println("\n Veuiller Saisir Une Option : ");
            System.out.println("   1. Client");
            System.out.println("   2. Employe");
            System.out.println("   3. Quitter");
            choixUser = sc.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return choixUser;
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
            System.out.println(" 1 ✦   Voir Toutes Les Réservations                 ✦");
            System.out.println(" 2 ✦   Ajouter Des Salles                           ✦");
            System.out.println(" 3 ✦   Déconnexion                                 ✦");
            System.out.println("    Veuillez choisir parmi ces options : ");
            a = sc.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return a;
    }

    public static void creerClient(Client C) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Entrer Votre identifiant");
            int idClient = sc.nextInt();
            System.out.println("Entrer Votre Nom");
            String nom = sc.next();
            System.out.println("Entrer Votre Prénom");
            String prenom = sc.next();
            System.out.println("Entrer Votre Email");
            String email = sc.next();
            System.out.println("Entrer Votre Addresse");
            String addresse = sc.next();
            System.out.println("Entrer Votre Numéro De Téléphone");
            double telephone = sc.nextDouble();
            System.out.println("Entrer Votre Mot De Passe");
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
    } //

    public static void creerEmploye(Employe E) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Entrer Votre identifiant");
            int idClient = sc.nextInt();
            System.out.println("Entrer Votre Nom");
            String nom = sc.next();
            System.out.println("Entrer Votre Prénom");
            String prenom = sc.next();
            System.out.println("Entrer Votre Email");
            String email = sc.next();
            System.out.println("Entrer Votre Addresse");
            String addresse = sc.next();
            System.out.println("Entrer Votre Numéro De Téléphone");
            double telephone = sc.nextDouble();
            System.out.println("Entrer Votre Mot De Passe");
            String mdp = sc.next();
            E.setId(idClient);
            E.setNom(nom);
            E.setPrenom(prenom);
            E.setEmail(email);
            E.setAddress(addresse);
            E.setTelephone(telephone);
            E.setMdp(mdp);

            E.inscrire(E);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    } //

    public static int rechercher(Visiteur V) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int choix = 0;
        try {
            System.out.println("Bienvienue dans le menu de recherche ");
            System.out.println("Veuillez Enter la Capacité de la salle Que vous voulez !! ");
            int capacite = sc.nextInt();
            int c = V.rechercherSalle(capacite);
            if (c != 0) {
                System.out.print("Voulez-Vous  Louer Une Salle Pour Un Evenement  : ");
                System.out.println("\n 1.  OUI");
                System.out.println(" 2.  NON");
                choix = sc.nextInt();
            }
            if (choix == 1) {
                choix = c;
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return choix;
    } //

    public static int connexion() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        try {
            System.out.println("Page De Connexion");
            System.out.print("\nIdentifiant :  ");
            int identifiant = sc.nextInt();
            System.out.print("Mot de Passe : ");
            String motDePasse = sc.next();
            System.out.print("\n");
            Client C1 = new Client();
            boolean r = C1.connecter(identifiant, motDePasse);
            if (r) {
                System.out.println("Connexion Reussi !! ");
                id = identifiant;
            } else {
                System.out.println("Ce Compte n'existe pas !!!!");
                System.out.println("Voulez-vous vous inscrire ? ");
                System.out.println(" 1.  OUI");
                System.out.println(" 2.  NON ");
                int choix = sc.nextInt();
                if (choix == 1) {
                    Client client = new Client();
                    creerClient(client);
                }
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        return id;
    } //

    public static int connexionEmploye() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        try {
            System.out.println("Page De Connexion");
            System.out.print("\nIdentifiant :  ");
            int identifiant = sc.nextInt();
            System.out.print("Mot de Passe : ");
            String motDePasse = sc.next();
            System.out.print("\n");
            Employe E = new Employe();
            boolean r = E.connecter(identifiant, motDePasse);
            if (r) {
                System.out.println("Connexion Reussi !! ");
                id = identifiant;
            } else {
                System.out.println("Ce Compte n'existe pas !!!!");
                System.out.println("Voulez-vous vous inscrire ? ");
                System.out.println(" 1.  OUI");
                System.out.println(" 2.  NON ");
                int choix = sc.nextInt();
                if (choix == 1) {
                    Employe employe = new Employe();
                    creerEmploye(employe);
                }

            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        return id;
    } //


    public static Evenement creerEvenement(int idClient, int idSalle) throws ParseException, InputMismatchException {
        Scanner sc = new Scanner(System.in);
        Evenement Ev = new Evenement();
        try {
            System.out.println("Entrer Le Nom de L'Evenement :");
            String nom = sc.next();
            System.out.println("Entrer Le Nombre D'invité ");
            int nombreInvite = sc.nextInt();
            System.out.println("Entrer La Date de L'Evenement en yyyy-MM-dd");
            String dateString = sc.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date utilDate;
            utilDate = dateFormat.parse(dateString);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

            Ev.setNom(nom);
            Ev.setNombreInvite(nombreInvite);
            Ev.setDate(sqlDate);
            Ev.setIdClient(idClient);
            Ev.setIdSalle(idSalle);

            Client C = new Client();
            C.planifierEvenment(Ev);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return Ev;
    } //

    public static void creerReservation(int idClient, Evenement E) throws InputMismatchException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Voulez-Vous Faire Une Réservation \n");
            System.out.println(" 1.  OUI");
            System.out.println(" 2.  NON ");
            int choix = sc.nextInt();
            if (choix == 1) {
                Reservation R = new Reservation();
                System.out.println("Entrer la Durée de Réservation En Jour");
                int dureReservationenEnJour = sc.nextInt();
                int idSalle = E.getIdSalle();
                Date date = (Date) E.getDate();

                R.setDureReservationenEnJour(dureReservationenEnJour);
                R.setIdClient(idClient);
                R.setIdSalle(idSalle);
                R.setDateReservation(date);

                Client C = new Client();
                C.faireReservation(R);
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

    } //


    public static void pageConnexion(int id, int choixClient) throws InputMismatchException {
        try {
            Scanner sc = new Scanner(System.in);
            String choixMenu;
            do {
                switch (choixClient) {
                    case 1:
                        Visiteur V = new Visiteur();
                        int choixsalle = rechercher(V);
                        if (choixsalle != 0) {
                            try {
                                Evenement E;
                                System.out.println("Bienvenue sur le Menu de Planification d'Evenement");
                                E = creerEvenement(id, choixsalle);
                                creerReservation(id, E);
                            } catch (ParseException e) {
                                throw new RuntimeException(e);
                            }
                        } else
                            System.out.println("Error de planification !! ");
                        break;
                    case 2:
                        System.out.println("Bienvenue sur le Menu de Planification d'Evenement");
                        System.out.println("Veuiller D'abord Choisir Une Salle \n");
                        Visiteur V1 = new Visiteur();
                        int choixsall = rechercher(V1);
                        if (choixsall != 0) {
                            try {
                                Evenement E;
                                E = creerEvenement(id, choixsall);
                                creerReservation(id, E);
                            } catch (ParseException e) {
                                throw new RuntimeException(e);
                            }
                        } else
                            System.out.println("Error de planification !! ");
                        break;
                    case 3:
                        try {
                            Client Cl = new Client();
                            Cl.voirReservations(id);
                            System.out.println("Voulez-vous Supprimez Une Réservation ?");
                            System.out.println(" 1.  OUI");
                            System.out.println(" 2.  NON ");
                            int c2 = sc.nextInt();
                            if (c2 == 1) {
                                System.out.print("Tape L'ID de la Réservation : ");
                                int salledel = sc.nextInt();
                                Cl.deleteReservation(salledel);
                            }
                        }
                        catch (InputMismatchException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Choix Indisponible");
                        break;
                }
                if (choixClient == 4) {
                    choixMenu = "k";
                } else {
                    System.out.println("\nVoulez-vous Retourner Au menu Cher Client ? ");
                    System.out.print("Taper *y* pour OUI ou N'importe Quelle Touche pour NON !! : ");
                    choixMenu = sc.next();
                }
            } while (choixMenu.equals("y"));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

    } //

    public static void pageConnexionEmploye(int id,int choixEmploye) throws InputMismatchException {
        try {
            Scanner sc = new Scanner(System.in);
            Employe E = new Employe();
            String choixMenu;
            do {
                switch (choixEmploye) {

                    case 1:
                        E.voirAllReservation();
                        break;
                    case 2:
                        Salle S = new Salle();
                        creationDeSalle(S);
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Choix Indisponible");
                        break;
                }
                if (choixEmploye == 3) {
                    choixMenu = "k";
                }
                else {
                    System.out.println("\nVoulez-vous Retourner Au menu Cher Client ? ");
                    System.out.print("Taper *y* pour OUI ou N'importe Quelle Touche pour NON : ");
                    choixMenu = sc.next();
                }
            } while (choixMenu.equals("y"));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public static void creationDeSalle(Salle S) throws InputMismatchException {
        try {
            Scanner sc = new Scanner(System.in);
            Employe E = new Employe();
            System.out.print("Entrer Le Nom de la Salle : ");
            String nom = sc.nextLine();
            System.out.print("Donner la Capacité de La Salle : ");
            int capacite = sc.nextInt();
            System.out.print("Entrer La Disponbilité : tapez true ou false ");
            boolean dispo = sc.nextBoolean();
            System.out.print("Entrer La Description de la Salle : ");
            String description = sc.nextLine();
            S.setNom(nom);
            S.setCapacite(capacite);
            S.setDesciption(description);
            S.setDispo(dispo);
            E.creerSalle(S);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }


    }
}


import ca.uqac._8inf334.travel_agency.classes.Agency;
import ca.uqac._8inf334.travel_agency.classes.Destination;
import ca.uqac._8inf334.travel_agency.classes.Hotel;
import ca.uqac._8inf334.travel_agency.classes.Location;

import java.util.ArrayList;
import java.util.HashSet;


public class App {

    public static void main(String[] arg) {

//        Agency myAgency = testAgency();
        Agency myAgency = new Agency("Voyage à rabais");
        System.out.println(myAgency.name);
        AgencyController myAgencyController = new AgencyController(myAgency);

        //first();
    }
    private static Agency testAgency()
    {
        Agency myAgency = new Agency("Une agence test pour l'application");

        return myAgency;
    }

    private static void first(){
//        System.out.println("Main app");
//
//        Scanner sc = new Scanner(System.in);
//        AgencyController aController = new AgencyController();
//        ArrayList<Agency> listAgency = new ArrayList<>();
//
//        App.populateData(listAgency);
//
//        boolean exit = false;
//        System.out.println("Bienvenue dans le système");
//        while(!exit)
//        {
//            System.out.println("<Menu principal>");
//            System.out.println("Choisir une option:");
//            System.out.println("    1-Ajouter une agence de voyage");
//            System.out.println("    2-Afficher les agences de voyage");
//            System.out.println("    x-Quitter");
//            String choice = sc.nextLine();
//
//            switch(choice)
//            {
//                case "1": {
//                    Agency newAgency = aController.createAgency();
//                    listAgency.add(newAgency);
//                }break;
//                case "2": {
//                    aController.listAgency(listAgency);
//                }break;
//                case "x": {
//                    System.out.println("Déconnexion du système!");
//                    exit = true;
//                }break;
//                default:{
//                    System.out.println("Choix invalide. Retour au menu ...");
//                }
//            }
//        }
    }

    private static void populateData(ArrayList<Agency> listAgency)
    {
        Agency agency1 = new Agency("Voyages Nouvelle Escale (TEST)");

        listAgency.add(agency1);

        //todo serait à complété
    }
}

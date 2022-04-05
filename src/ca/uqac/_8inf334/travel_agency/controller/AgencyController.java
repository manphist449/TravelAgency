package ca.uqac._8inf334.travel_agency.controller;

import ca.uqac._8inf334.travel_agency.Agency;
import ca.uqac._8inf334.travel_agency.Destination;

import java.util.ArrayList;

public class AgencyController extends CommandLineController {

    private DestinationController dController;

    public AgencyController()
    {
        this.dController = new DestinationController();
    }

    /** Show in command line a form for adding an Agency
     * @return Agency
     */
    public Agency createAgency()
    {
        String name = "";

        System.out.println("<Création d'une agence>");

        name = this.enterAgencyName();

        Agency newAgency = new Agency(name);

        System.out.println("L'agence '" + newAgency.getName() + "' a été créée");

        return newAgency;
    }
    private String enterAgencyName()
    {
        String name = "";
        do{
            System.out.print("Entrer un nom: ");
        }
        while((name = scanner.nextLine().trim()).isEmpty());

        return name;
    }

    public void optionAgency(Agency agency)
    {
        String choice;
        boolean exit = false;
        while(!exit){
            System.out.println("<Agence: "+agency.getName()+">");
            System.out.println("Choisir une option");
            System.out.println("    1:Changer le nom");
            System.out.println("    2:Ajouter une Destination");
            System.out.println("    3:Consulter les Destinations");
            System.out.println("    x:Retour");

            while((choice = scanner.nextLine().trim()).isEmpty());

            switch(choice)
            {
                case "1":{
                    String oldName = agency.getName();
                    agency.setName(this.enterAgencyName());
                    System.out.println("Le nom a été modifié: " + oldName + " -> " + agency.getName());

                }break;
                case "2":{

                    Destination newDestination = dController.createDestination();
                    agency.addDestination(newDestination);
                    System.out.println("Un destination a été ajouté!");

                }break;
                case "3":{

                    dController.listDestination(agency.getListDestination());
                }break;
                case "x":{
                    System.out.println("Retour!");
                    exit = true;
                }break;
                default:{
                    System.out.println("Option invalide!");
                }
            }
        }
    }

    /** Show the list of Agency where you can select one to inspect
     * @param listAgency a list of all Agency you want to select from
     */
    public void listAgency(ArrayList<Agency> listAgency)
    {
        int listSize = listAgency.size();
        if(listSize > 0)
        {
            String choice = "";
            int intChoice = -1;
            boolean exit = false;
            boolean wrongChoice;
            while(!exit) {
                wrongChoice = false;
                System.out.println("Liste des agences à consulter:");
                for (int x = 0; x < listAgency.size(); x++) {
                    System.out.print("  " + x + ":");
                    System.out.println(listAgency.get(x).getName());
                }
                System.out.println("  x:Retour");

                if (scanner.hasNextInt()) {
                    intChoice = scanner.nextInt();
                    if (intChoice >= 0 && intChoice < listSize) {
                        this.optionAgency(listAgency.get(intChoice));
                    }else
                    {
                        wrongChoice = true;
                    }
                }else
                {
                    choice = scanner.nextLine();
                    if(choice.equals("x"))
                    {
                        System.out.println("Retour!");
                        exit = true;
                    }else
                    {
                        wrongChoice = true;
                    }
                }

                if(wrongChoice)
                {
                    System.out.println("Option invalide!");
                }
            }

        }else
        {
            System.out.println("Il n'y a présentement aucune agence.");
        }
    }
}

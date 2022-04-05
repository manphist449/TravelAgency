package ca.uqac._8inf334.travel_agency.controller;

import ca.uqac._8inf334.travel_agency.*;

import java.util.ArrayList;

public class DestinationController extends CommandLineController {

    ActivityController actController;
    LocationController locController;

    public DestinationController()
    {
        actController = new ActivityController();
        locController = new LocationController();
    }

    /** Show in command line a form for adding a Destination
     * @return Destination
     */
    public Destination createDestination()
    {
        System.out.println("<Création d'une destination>");

        String name = this.enterDestinationName();

        Destination newDestination = new Destination(name);

        boolean bActivity = true;
        String choice = "";
        int totalActivityCreated = 0;
        while(bActivity)
        {
            System.out.println("Ajouter une activité à la destination?");
            System.out.println("    1:Oui");
            System.out.println("    2:Non");
            while((choice = scanner.nextLine().trim()).isEmpty());

            if(choice.equals("1"))
            {
                this.createActivity(newDestination);
                totalActivityCreated++;
            }else if(choice.equals("2"))
            {
                bActivity = false;

                if(totalActivityCreated > 0)
                {
                    System.out.println("Un total de "+ totalActivityCreated +" activités feront partie de la destination");
                }
            }
        }

        boolean bLocation = true;
        String choiceL = "";
        int totalLocationCreated = 0;
        while(bLocation)
        {
            System.out.println("Ajouter un lieu à la destination?");
            System.out.println("    1:Oui");
            System.out.println("    2:Non");
            while((choiceL = scanner.nextLine().trim()).isEmpty());

            if(choiceL.equals("1"))
            {
                this.createLocation(newDestination);
                totalLocationCreated++;
            }else if(choiceL.equals("2"))
            {
                bLocation = false;

                if(totalLocationCreated > 0)
                {
                    System.out.println("Un total de "+ totalLocationCreated +" lieux seront associés à la destination");
                }
            }
        }

        return newDestination;
    }

    private String enterDestinationName() {

        String name = "";
        do{
            System.out.print("Entrer un nom: ");
        }
        while((name = scanner.nextLine().trim()).isEmpty());

        return name;

    }
    private void optionDestination(Destination destination)
    {
        String choice;
        boolean exit = false;
        while(!exit){
            System.out.println("<Destination: "+ destination.getName()+">");
            System.out.println("Choisir une option");
            System.out.println("    1:Changer le nom");
            System.out.println("    2:Ajouter une Activité");
            System.out.println("    3:Ajouter un Lieu");
            System.out.println("    4:Consulter les Activités");
            System.out.println("    5:Consulter les Lieux");
            System.out.println("    x:Retour");

            while((choice = scanner.nextLine().trim()).isEmpty());

            switch(choice)
            {
                case "1":{
                    String oldName = destination.getName();
                    destination.setName(this.enterDestinationName());
                    System.out.println("Le nom a été modifié: " + oldName + " -> " + destination.getName());

                }break;
                case "2":{
                    this.createActivity(destination);
                }break;
                case "3":{
                    this.createLocation(destination);
                }break;
                case "4":{
                    actController.listActivity(destination.getListActivity());
                }break;
                case "5":{
                    locController.listLocation(destination.getListLocation());
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

    /** Show the list of Destination where you can select one to inspect
     * @param listDestination a list of all Destination you want to select from
     */
    public void listDestination(ArrayList<Destination> listDestination)
    {
        int listSize = listDestination.size();
        if(listSize > 0)
        {
            String choice = "";
            int intChoice = -1;
            boolean exit = false;
            boolean wrongChoice;
            while(!exit) {
                System.out.println("Liste des destinations à consulter:");
                wrongChoice = false;
                for (int x = 0; x < listDestination.size(); x++) {
                    System.out.print("  " + x + ":");
                    System.out.println(listDestination.get(x).getName());
                }
                System.out.println("  x:Retour");

                if (scanner.hasNextInt()) {
                    intChoice = scanner.nextInt();
                    if (intChoice >= 0 && intChoice < listSize) {
                        this.optionDestination(listDestination.get(intChoice));
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
            System.out.println("Il n'y a présentement aucune destination.");
        }
    }

    private void createLocation(Destination currentDestination)
    {
        Location newLocation = locController.createLocation(currentDestination);
        currentDestination.addLocation(newLocation);
        System.out.println("Un lieu a été ajouté!");
    }
    private void createActivity(Destination currentDestination)
    {
        Activity newActivity = actController.createActivity();
        currentDestination.addActivity(newActivity);
        System.out.println("Une activité a été ajoutée!");
    }
}


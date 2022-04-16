package ca.uqac._8inf334.travel_agency.controller;

import ca.uqac._8inf334.travel_agency.classes.Destination;
import ca.uqac._8inf334.travel_agency.classes.Location;

import java.util.ArrayList;

public class LocationController extends CommandLineController {

    HotelController hController;
    public LocationController()
    {
        hController = new HotelController();
    }

    /** Show in command line a form for adding a Location
     * @return Location
     */
    public Location createLocation(Destination destinationParent)
    {
        System.out.println("<Création d'un lieu>");

        String name = this.enterLocationName();

        return new Location(name, destinationParent);
    }

    /** Show the list of Location where you can select one to inspect
     * @param listLocation a list of all Activity you want to select from
     */
    public void listLocation(ArrayList<Location> listLocation)
    {
        int listSize = listLocation.size();
        if(listSize > 0)
        {
            String choice = "";
            int intChoice = -1;
            boolean exit = false;
            boolean wrongChoice;
            while(!exit) {
                System.out.println("Liste des lieux à consulter:");
                wrongChoice = false;
                for (int x = 0; x < listLocation.size(); x++) {
                    System.out.print("  " + x + ":");
                    System.out.println(listLocation.get(x).getName());
                }
                System.out.println("  x:Retour");

                if (scanner.hasNextInt()) {
                    intChoice = scanner.nextInt();
                    if (intChoice >= 0 && intChoice < listSize) {
                        this.optionLocation(listLocation.get(intChoice));
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
            System.out.println("Il n'y a présentement aucun lieu.");
        }
    }

    private void optionLocation(Location location)
    {
        String choice;
        boolean exit = false;
        while(!exit){
            System.out.println("<Lieu: "+ location.getName()+">");
            System.out.println("Choisir une option");
            System.out.println("    1:Changer le nom");
            System.out.println("    2:Ajouter un Hôtel");
            System.out.println("    3:Consulter les Hôtels");
            System.out.println("    x:Retour");

            while((choice = scanner.nextLine().trim()).isEmpty());

            switch(choice)
            {
                case "1":{
                    String oldName = location.getName();
                    location.setName(this.enterLocationName());
                    System.out.println("Le nom a été modifié: " + oldName + " -> " + location.getName());
                }break;
                case "2":{
//                    hController.createHotel(location);
                }break;
                case "3":{
//                    hController.listHotel(location.getListHotel());
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

    private String enterLocationName() {

        String name = "";
        do{
            System.out.print("Entrer un nom: ");
        }
        while((name = scanner.nextLine().trim()).isEmpty());

        return name;

    }
}

package ca.uqac._8inf334.travel_agency.controller;

import ca.uqac._8inf334.travel_agency.Hotel;
import ca.uqac._8inf334.travel_agency.Location;

import java.util.ArrayList;

public class HotelController extends CommandLineController {

    ReviewController rController;
    public HotelController()
    {
        rController = new ReviewController();
    }

    /** Show in command line a form for adding an Hotel
     * @return Hotel
     */
    public Hotel createHotel(Location locationParent)
    {
        System.out.println("<Création d'un hôtel>");

        String name = this.enterHotelName();

        Hotel newHotel = new Hotel(name,locationParent);

        boolean bAmenities = true;
        String choice = "";
        int totalAmenityCreated = 0;
        while(bAmenities)
        {
            System.out.println("Ajouter un aménagement à l'hôtel?");
            System.out.println("    1:Oui");
            System.out.println("    2:Non");
            while((choice = scanner.nextLine().trim()).isEmpty());

            if(choice.equals("1"))
            {
                newHotel.addAmenity(this.enterAmenitiesName());
                totalAmenityCreated++;
            }else if(choice.equals("2"))
            {
                bAmenities = false;

                if(totalAmenityCreated > 0)
                {
                    System.out.println("Un total de "+ totalAmenityCreated +" aménagements seront présent dans cet hôtel.");
                }
            }
        }

        return newHotel;
    }

    /** Show the list of Hotel where you can select one to inspect
     * @param listHotel a list of all Hotel you want to select from
     */
    public void listHotel(ArrayList<Hotel> listHotel)
    {
        int listSize = listHotel.size();
        if(listSize > 0)
        {
            String choice = "";
            int intChoice = -1;
            boolean exit = false;
            boolean wrongChoice;
            while(!exit) {
                System.out.println("Liste des hôtels à consulter:");
                wrongChoice = false;
                for (int x = 0; x < listHotel.size(); x++) {
                    System.out.print("  " + x + ":");
                    System.out.println(listHotel.get(x).getName());
                }
                System.out.println("  x:Retour");

                if (scanner.hasNextInt()) {
                    intChoice = scanner.nextInt();
                    if (intChoice >= 0 && intChoice < listSize) {
                        this.optionHotel(listHotel.get(intChoice));
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
            System.out.println("Il n'y a présentement aucun hôtel.");
        }
    }


    private void optionHotel(Hotel hotel)
    {
        String choice;
        boolean exit = false;
        while(!exit){
            System.out.println("<Hôtel: "+ hotel.getName()+">");
            System.out.println("Choisir une option");
            System.out.println("    1:Changer le nom");
            System.out.println("    2:Ajouter un avis");
            System.out.println("    3:Ajouter un aménagement");
            System.out.println("    4:Voir les avis");
            System.out.println("    5:Voir les aménagements");
            System.out.println("    x:Retour");

            while((choice = scanner.nextLine().trim()).isEmpty());

            switch(choice)
            {
                case "1":{
                    String oldName = hotel.getName();
                    hotel.setName(this.enterHotelName());
                    System.out.println("Le nom a été modifié: " + oldName + " -> " + hotel.getName());
                }break;
                case "2":{
                    hotel.addReview(this.rController.createReview());
                    System.out.println("Un aménagement a été ajouté!");
                }break;
                case "3":{
                    hotel.addAmenity(this.enterAmenitiesName());
                    System.out.println("Un aménagement a été ajouté!");
                }break;
                case "4":{
                    rController.listReview(hotel.getListReview());
                }break;
                case "5":{
                    hotel.printListAmenities(false);
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
    private String enterHotelName() {

        String name = "";
        do{
            System.out.print("Entrer un nom: ");
        }
        while((name = scanner.nextLine().trim()).isEmpty());

        return name;

    }

    private String enterAmenitiesName() {

        String name = "";
        do{
            System.out.print("Entrer un nom d'aménagement: ");
        }
        while((name = scanner.nextLine().trim()).isEmpty());

        return name;

    }
}

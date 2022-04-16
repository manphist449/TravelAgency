package ca.uqac._8inf334.travel_agency.controller;


import ca.uqac._8inf334.travel_agency.classes.Agency;
import ca.uqac._8inf334.travel_agency.classes.Destination;
import ca.uqac._8inf334.travel_agency.classes.Hotel;
import ca.uqac._8inf334.travel_agency.classes.PackageDeal;

public class AgencyController {

    private HotelController hotelController;
    private DestinationController destinationController;
    private PackageDealController packageDealController;
    private Agency agency;
    public AgencyController()
    {
        this.hotelController = new HotelController();
        this.destinationController = new DestinationController();
        this.packageDealController = new PackageDealController();
    }

    public void addHotel(Hotel hotel)
    {
        this.agency.addHotel(hotel);
        this.hotelController.setHotel(hotel);
        this.hotelController.setAgency(this.agency);
    }
    public void addPackageDeal(PackageDeal deal)
    {

    }
    public void addDestination(Destination destination)
    {

    }

    public void setAgency(Agency agency)
    {
        this.agency = agency;
    }

}



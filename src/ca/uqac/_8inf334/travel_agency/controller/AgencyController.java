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
    public AgencyController(Agency myAgency)
    {
        this.agency = myAgency;
    }

    public void addHotel(Hotel hotel)
    {

    }
    public void addPackageDeal(PackageDeal deal)
    {

    }
    public void addDestination(Destination destination)
    {

    }

}



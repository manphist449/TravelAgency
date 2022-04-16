package ca.uqac._8inf334.travel_agency.controller;

import ca.uqac._8inf334.travel_agency.classes.Agency;
import ca.uqac._8inf334.travel_agency.classes.Destination;
import ca.uqac._8inf334.travel_agency.classes.Hotel;

public class HotelController {

    private AgencyController agencyController;
    private Hotel hotel;
    public HotelController()
    {
        agencyController = new AgencyController();
    }


    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }

    public void setAgency(Agency agency)
    {
        this.hotel.setAgency(agency);

        if(!agency.hasHotel(this.hotel))
        {
            this.agencyController.setAgency(agency);
            this.agencyController.addHotel(this.hotel);
        }
    }

    public void setDestination(Destination destination)
    {
        if(this)
        this.hotel.setDestination(destination);
    }
}

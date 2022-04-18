package project.controller;

import project.classes.Activity;
import project.classes.Agency;
import project.classes.Destination;
import project.classes.Hotel;

class DestinationController {

    private Destination myDestination;
    private HotelController hotelController = new HotelController();
    private AgencyController agencyController = new AgencyController();
    public DestinationController()
    {

    }

    public void setDestination(Destination destination)
    {
        this.myDestination = destination;
    }

    public void addHotel(Hotel hotel)
    {
        myDestination.listHotel.add(hotel);

        if(myDestination.myAgency != null)
        {
            agencyController.setAgency(myDestination.myAgency);
            agencyController.addHotel(hotel);
        }

    }

    public void setAgency(Agency agency)
    {
        this.myDestination.myAgency = agency;
    }

    public void addActivity(Activity activity)
    {
        this.myDestination.listActivity.add(activity);
    }
    public void removeActivity(Activity activity)
    {
        this.myDestination.listActivity.remove(activity);
    }



}

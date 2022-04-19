package project.controller;

import project.classes.Agency;
import project.classes.Destination;
import project.classes.Hotel;
import project.classes.PackageDeal;

class AgencyController {

    private Agency myAgency;
    private HotelController hotelController = new HotelController();

    public AgencyController()
    {
    }
    public void setAgency(Agency agency)
    {
        this.myAgency = agency;
    }

    public void addPackageDeal(PackageDeal deal) throws Exception
    {
        if(this.myAgency.listHotel.contains(deal.getHotel()))
        {
            this.myAgency.listPackageDeal.add(deal);

            this.hotelController.setHotel(deal.getHotel());
            this.hotelController.addPackageDeal(deal);

        }else
        {
            throw new Exception("The PackageDeal doesn't have an Hotel from the Agency");
        }
    }

    public void addHotel(Hotel hotel)
    {
        myAgency.listHotel.add(hotel);
    }
    public void addDestination(Destination destination) throws Exception
    {
        if(!myAgency.listDestination.contains(destination))
        {
            myAgency.listDestination.add(destination);

            for (Hotel hotel : destination.getHotelList()) {
                this.addHotel(hotel);
            }
        }else
        {
            throw new Exception("Destination already exist in the Agency");
        }
    }

    public String getViewAllPackageDeal()
    {
        StringBuilder sr = new StringBuilder("<Agency Package Deal>").append(System.lineSeparator());

        for (PackageDeal pd: myAgency.listPackageDeal) {
            sr.append(pd.toString()).append(System.lineSeparator());
        }

        return sr.toString();
    }

    public String getViewAllHotel()
    {
        StringBuilder sr = new StringBuilder("<Agency Hotel>").append(System.lineSeparator());

        for (Hotel hotel: myAgency.listHotel) {
            sr.append(hotel.toString()).append(System.lineSeparator());
        }

        return sr.toString();
    }
}

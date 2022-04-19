package project.controller;

import project.classes.*;

import java.util.ArrayList;

public class MainController {

    public ArrayList<Agency> allAgency;
    public ArrayList<Destination> allDestination;
    public ArrayList<PackageDeal> allPackageDeal;
    public ArrayList<Hotel> allHotel;
    public ArrayList<Activity> allActivity;
    public ArrayList<Review> allReview;
    public ArrayList<Fly> allFly;

    private DestinationController destinationController = new DestinationController();
    private HotelController hotelController = new HotelController();
    private AgencyController agencyController = new AgencyController();
    private PackageDealController packageDealController = new PackageDealController();


    public MainController()
    {
        allAgency = new ArrayList<Agency>();
        allDestination = new ArrayList<Destination>();
        allPackageDeal = new ArrayList<PackageDeal>();
        allHotel = new ArrayList<Hotel>();
        allActivity = new ArrayList<Activity>();
        allReview = new ArrayList<Review>();
        allFly = new ArrayList<Fly>();
    }

    public void addHotelToDestination(Hotel hotel, Destination destination)
    {
        destinationController.setDestination(destination);
        destinationController.addHotel(hotel);

        hotelController.setHotel(hotel);
        hotelController.setDestination(destination);
    }

    public void addDestinationToAgency(Destination destination, Agency agency)
    {
        destinationController.setDestination(destination);
        destinationController.setAgency(agency);

        agencyController.setAgency(agency);
        try {
            agencyController.addDestination(destination);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addPackageDealToAgency(PackageDeal packageDeal, Agency agency)
    {
        agencyController.setAgency(agency);
        packageDealController.setPackageDeal(packageDeal);

        try {
            agencyController.addPackageDeal(packageDeal);
            packageDealController.setAgency(agency);

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void addReviewToHotel(Review review, Hotel hotel) {
        Hotel oldHotel = review.getHotel();

        if (!hotel.equals(oldHotel))
        {
            hotelController.setHotel(hotel);
            hotelController.addReview(review);

            /*Oui il peut être null s'il n'a jamais été setté*/
            if(oldHotel != null)
            {
                this.removeReviewFromHotel(review,oldHotel);
            }

            review.setHotel(hotel);
        }
    }

    public void removeReviewFromHotel(Review review, Hotel hotel)
    {
        hotelController.setHotel(hotel);
        hotelController.removeReview(review);
        review.setHotel(null);
    }

    public void addActivityToDestination(Activity activity, Destination destination) {
        Destination oldDestination = activity.getDestination();

        if (!destination.equals(oldDestination))
        {
            destinationController.setDestination(destination);
            destinationController.addActivity(activity);

            /*Oui il peut être null s'il n'a jamais été setté*/
            if(oldDestination != null)
            {
                this.removeActivityFromDestination(activity,oldDestination);
            }

            activity.setDestination(destination);
        }
    }

    public void removeActivityFromDestination(Activity activity, Destination destination)
    {
        destinationController.setDestination(destination);
        destinationController.removeActivity(activity);
        activity.setDestination(null);
    }

    public void showAllReviewFromHotel(Hotel hotel)
    {
        hotelController.setHotel(hotel);
        System.out.println(hotelController.getViewAllReview());
    }

    public void showAllPackageDealFromAgency(Agency agency)
    {
        agencyController.setAgency(agency);
        System.out.println(agencyController.getViewAllPackageDeal());
    }
    public void showAllHotelFromAgency(Agency agency)
    {
        agencyController.setAgency(agency);
        System.out.println(agencyController.getViewAllHotel());
    }
}

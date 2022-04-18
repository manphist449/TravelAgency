package project;

import project.classes.*;
import project.controller.MainController;

import java.util.ArrayList;

public class App {

    public static void main(String[] arg) {

        MainController mc = new MainController();
        populate(mc);

        /*exemples à partir des listes du main controleller*/
        mc.addReviewToHotel(mc.allReview.get(0),mc.allHotel.get(0));
        mc.addReviewToHotel(mc.allReview.get(1),mc.allHotel.get(1));
        mc.addReviewToHotel(mc.allReview.get(2),mc.allHotel.get(1));
    }

    private static void populate(MainController mainController)
    {
        Agency agency1 = new Agency("Agence du gros luxe");
        mainController.allAgency.add(agency1);

        Destination destination1 = new Destination("Caraibe");
        Destination destination2 = new Destination("Sud");
        mainController.allDestination.add(destination1);
        mainController.allDestination.add(destination2);

        mainController.addDestinationToAgency(destination1,agency1);
        mainController.addDestinationToAgency(destination2,agency1);

        Activity activity1 = new Activity("Plage d'or", "Magnifique plage au couleur doré et au sable doux unique au monde.");
        Activity activity2 = new Activity("Triangle des Bermudes ", "Une expérience unique en son genre qu'on ne fait qu'une seule fois dans ca vie.");
        mainController.allActivity.add(activity1);
        mainController.allActivity.add(activity2);

        mainController.addActivityToDestination(activity1,destination2);
        mainController.addActivityToDestination(activity2,destination1);

        Hotel hotel1 = new Hotel("OTL");
        Hotel hotel2 = new Hotel("Montagnais");
        Hotel hotel3 = new Hotel("Du Coin");
        mainController.allHotel.add(hotel1);
        mainController.allHotel.add(hotel2);
        mainController.allHotel.add(hotel3);

        hotel1.addAmenities("Piscine");
        hotel1.addAmenities("Bar");
        hotel1.addAmenities("Stationnement gratuit");
        hotel2.addAmenities("Piscine");
        hotel2.addAmenities("Bar");
        hotel3.addAmenities("Service au chambre");

        mainController.addHotelToDestination(hotel1,destination1);
        mainController.addHotelToDestination(hotel2,destination2);
        mainController.addHotelToDestination(hotel3,destination2);

        Fly at1 = new Fly("Air Transat" , FlyClass.ECONOMY);
        Fly at2 = new Fly("Air Transat" , FlyClass.BUSINESS);
        Fly at3 = new Fly("Air Transat" , FlyClass.FIRST);
        Fly wj1 = new Fly("Westjet" , FlyClass.ECONOMY);
        Fly wj2 = new Fly("Westjet" , FlyClass.FIRST);
        mainController.allFly.add(at1);
        mainController.allFly.add(at2);
        mainController.allFly.add(at3);
        mainController.allFly.add(wj1);
        mainController.allFly.add(wj2);

        PackageDeal pd1 = new PackageDeal(300.00f,"2023/11/03", at1,hotel1);
        PackageDeal pd2 = new PackageDeal(465.00f,"2023/11/04", at2,hotel1);
        PackageDeal pd3 = new PackageDeal(350.00f,"2023/03/03", at1,hotel2);
        PackageDeal pd4= new PackageDeal(700.59f,"2023/12/07", at3,hotel3);
        PackageDeal pd5 = new PackageDeal(317.99f,"2023/07/23", wj2,hotel3);
        PackageDeal pd6 = new PackageDeal(165.00f,"2023/08/20", wj1,hotel3);
        mainController.allPackageDeal.add(pd1);
        mainController.allPackageDeal.add(pd2);
        mainController.allPackageDeal.add(pd3);
        mainController.allPackageDeal.add(pd4);
        mainController.allPackageDeal.add(pd5);
        mainController.allPackageDeal.add(pd6);

        mainController.addPackageDealToAgency(pd1,agency1);
        mainController.addPackageDealToAgency(pd2,agency1);
        mainController.addPackageDealToAgency(pd3,agency1);
        mainController.addPackageDealToAgency(pd4,agency1);
        mainController.addPackageDealToAgency(pd5,agency1);
        mainController.addPackageDealToAgency(pd6,agency1);

        Review review1 = new Review("Paul001", "J'ai aimé les lieux. Je recommende fortement." , Stars.FIVE, Review.getTodayDate());
        Review review2 = new Review("LeChanteurSolitaire", "Le karaoké était super. Malheureusement, l'alcool goûtait l'eau." , Stars.FOUR, "2011/02/28");
        Review review3 = new Review("M@ryze.Larouche28", "Des fois on m'appelle aussi Karen, c'est pourquoi je déconseille fortement cette place car les gens étaient beaucoup trop respectueux avec nous." , Stars.ONE, Review.getTodayDate());
        mainController.allReview.add(review1);
        mainController.allReview.add(review2);
        mainController.allReview.add(review3);

    }
}

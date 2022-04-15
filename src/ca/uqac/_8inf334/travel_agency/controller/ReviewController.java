package ca.uqac._8inf334.travel_agency.controller;

import ca.uqac._8inf334.travel_agency.classes.Review;
import ca.uqac._8inf334.travel_agency.classes.Stars;

import java.util.ArrayList;

public class ReviewController extends CommandLineController {

    public ReviewController()
    {

    }

    /** Show in command line a form for adding a Review
     * @return Review
     */
    public Review createReview( )
    {
        System.out.println("<Création d'un avis>");

        String username = this.enterStringValue("Entrer votre identifiant: ");
        String comment = this.enterStringValue("Entrer votre commentaire: ");
        Stars rating = this.enterReviewRating();
        String date = this.enterValidDate();
        Review newReview = new Review(username, comment, rating, date);

        return newReview;
    }

    private String enterValidDate()
    {
        String date = "";
        boolean exit = false;
        while(!exit)
        {
            System.out.println("Entrer la date en format 'yyyy/MM/dd' ou laisser vide pour la date d'aujourd'hui: ");

            date = scanner.nextLine().trim();
            if(date.equals(""))
            {
                date = Review.getTodayDate();
                exit = true;
            }else
            {
                if(Review.isValidDate(date))
                {
                    exit = true;
                }else
                {
                    System.out.println("Date invalide!");
                }
            }
        }

        return date;
    }

    private String enterStringValue(String labelQuestion) {

        String value = "";
        boolean first = true;
        do{
            if(!first)
            {
                System.out.print("Valeur invalide , string vide!");
            }

            System.out.print(labelQuestion);

            first = false;
        }
        while((value = scanner.nextLine().trim()).isEmpty());

        return value;
    }

    private Stars enterReviewRating() {

        Stars rating = null;
        int choice = 0;


        boolean stop = false;
        while(!stop);
        {
            System.out.print("Entrer une note de 1 à 5: ");
            choice = scanner.nextInt();

            stop = true;
            switch (choice) {
                case 1 -> {
                    rating = Stars.ONE;
                }
                case 2 -> {
                    rating = Stars.TWO;
                }
                case 3 -> {
                    rating = Stars.THREE;
                }
                case 4 -> {
                    rating = Stars.FOUR;
                }
                case 5 -> {
                    rating = Stars.FIVE;
                }
                default -> {
                    System.out.println("Valeur invalide!");
                    stop = false;
                }
            }
        }
        return rating;
    }

    public void listReview(ArrayList<Review> listReview)
    {
        System.out.println("Liste des avis à consulter (En construction)");
        return ;
//        int listSize = listReview.size();
//        if(listSize > 0)
//        {
//            String choice = "";
//            int intChoice = -1;
//            boolean exit = false;
//            boolean wrongChoice;
//            while(!exit) {
//                System.out.println("Liste des évaluations à consulter:");
//                wrongChoice = false;
//                for (int x = 0; x < listReview.size(); x++) {
//                    System.out.print("  " + x + ":");
//                    //todo a faire
////                    System.out.println(listReview.get(x).print());
//                }
//                System.out.println("  x:Retour");
//
//                if (scanner.hasNextInt()) {
//                    intChoice = scanner.nextInt();
//                    if (intChoice >= 0 && intChoice < listSize) {
//                        //todo à faire
//                        this.optionReview(listReview.get(intChoice));
//                    }else
//                    {
//                        wrongChoice = true;
//                    }
//                }else
//                {
//                    choice = scanner.nextLine();
//                    if(choice.equals("x"))
//                    {
//                        System.out.println("Retour!");
//                        exit = true;
//                    }else
//                    {
//                        wrongChoice = true;
//                    }
//                }
//
//                if(wrongChoice)
//                {
//                    System.out.println("Option invalide!");
//                }
//            }
//
//        }else
//        {
//            System.out.println("Il n'y a présentement aucune évaluation.");
//        }
    }

    private void optionReview(Review review)
    {
        //todo je suis pas certain qu'on va en avoir besoin
    }
}

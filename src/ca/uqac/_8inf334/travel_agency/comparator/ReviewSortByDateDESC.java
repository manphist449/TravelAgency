package ca.uqac._8inf334.travel_agency.comparator;

import ca.uqac._8inf334.travel_agency.classes.Review;

import java.util.Comparator;

public class ReviewSortByDateDESC implements Comparator<Review> {

    public int compare(Review reviewA, Review reviewB) {

        return reviewA.getDate().compareTo(reviewB.getDate());
    }
}
package ca.uqac._8inf334.travel_agency;

import ca.uqac._8inf334.travel_agency.comparator.ReviewSortByDateDESC;

import java.util.ArrayList;
import java.util.Collections;

public class Hotel {

    private String name;
    private ArrayList<Review> listReview;
    private ArrayList<String> listAmenities;
    private Location location;

    public Hotel(String name, Location location){
        this.name = name;
        this.location = location;
        this.listReview = new ArrayList<>();
        this.listAmenities = new ArrayList<>();
    }

    public Hotel(String name, Location location, ArrayList<String> amenities, ArrayList<Review> reviews){
        this.name = name;
        this.location = location;
        this.listReview = reviews;
        this.listAmenities = amenities;

        this.sortReviewByDateDESC();
        this.sortAmenitiesByNameASC();
    }

    /**
     * @return list of all amenity in the hotel
     */
    public ArrayList<String> getListAmenities() {
        return this.listAmenities;
    }

    /**
     * @param amenities a string wich design a amenities to add in the list of amenities of the hotel
     */
    public void addAmenity(String amenities) {
        this.listAmenities.add(amenities);
        this.sortAmenitiesByNameASC();
    }

    /**
     * @return list of all review in the hotel
     */
    public ArrayList<Review> getListReview() {
        return this.listReview;
    }

    /**
     * @param review review to add to the list of review of the hotel
     */
    public void addReview(Review review) {
        this.listReview.add(review);
        this.sortReviewByDateDESC();
    }
    /**
     * @return name of the hotel
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name  name of the hotel
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * sort the list of amenities string to be ASC
     */
    private void sortAmenitiesByNameASC()
    {
        Collections.sort(this.listAmenities);
    }
    /**
     * sort the list of review to be DESC by date
     */
    private void sortReviewByDateDESC()
    {
        Collections.sort(this.listReview, new ReviewSortByDateDESC());
    }

    /**
     * Show a list of all amenities
     * @param singleLine if value is true will print all element with seperate comma if false will println all element.
     */
    public void printListAmenities(boolean singleLine) {

        if(singleLine)
        {
            int listSize =  listAmenities.size();
            for(int x = 0; x < listSize; x++)
            {
                System.out.print(listAmenities.get(x));

                if(x != (listSize-1))
                {
                    System.out.print(",");
                }
            }
        }else
        {
            for (String amen : listAmenities) {
                System.out.println(amen);
            }
        }

    }
}

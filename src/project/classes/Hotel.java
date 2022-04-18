package project.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Hotel {

    private String name;
    public HashSet<Review> listReview;
    private ArrayList<String> listAmenities;
    public  Destination destination;
    public HashSet<PackageDeal> listPackageDeal;

    public Hotel(String name){
        this.name = name;
        this.listReview = new HashSet<Review>();
        this.listAmenities = new ArrayList<String>();
        this.listPackageDeal = new HashSet<PackageDeal>();
    }

    public void addAmenities(String anAmenities)
    {
        this.listAmenities.add(anAmenities);
    }

    public ArrayList<String> getAmenities()
    {
        return this.listAmenities;
    }

    public String getName() {
        return name;
    }
}

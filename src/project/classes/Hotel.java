package project.classes;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Hotel {

    private String name;
    public HashSet<Review> listReview;
    private ArrayList<String> listAmenities;
    public  Destination destination;
    public HashSet<PackageDeal> listPackageDeal;

    private static final DecimalFormat df = new DecimalFormat("0.00");

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

    public float getAverageRating() {
        float total = 0.0f;
        int size = listReview.size();
        for (Review rev : listReview) {
            total += rev.getRatingValue();
        }

        if (size == 0){
            return total;
        }

        return total/size;
    }

    @Override
    public String toString() {

        StringBuilder strbuilder = new StringBuilder("Hotel => ");
        strbuilder.append(this.getName()).append(System.lineSeparator());
        strbuilder.append(" Avg.Rating: ").append(df.format(this.getAverageRating())).append(" From ").append(this.listReview.size()).append(" review").append(System.lineSeparator());
        strbuilder.append(" Amenities: ").append(this.listAmenities).append(System.lineSeparator());
        strbuilder.append(" Destination: ").append(this.destination.name).append(System.lineSeparator());
        strbuilder.append(" Current Deal: ").append(this.listPackageDeal.size()).append(" total");
        return strbuilder.toString();
    }
}

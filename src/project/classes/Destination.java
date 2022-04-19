package project.classes;

import java.util.ArrayList;
import java.util.HashSet;

public class Destination {

    public String name;
    public  HashSet<Activity> listActivity;
    public  HashSet<Hotel> listHotel;
    public Agency myAgency;

    public Destination(String name){
        this.name = name;
        this.listActivity = new HashSet<Activity>();
        this.listHotel = new HashSet<Hotel>();
    }

    public ArrayList<Hotel> getHotelList()
    {
        return new ArrayList<Hotel>(listHotel);
    }
}

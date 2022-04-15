package ca.uqac._8inf334.travel_agency.classes;
import java.util.ArrayList;

public class Location {

    private String name;
    private ArrayList<Hotel> listHotel;
    private Destination destination;

    /**
     * basic constructor with only a name
     * @param name  name for the location
     */
    public Location(String name, Destination destination){
        this.name = name;
        this.destination = destination;
    }

    /**
     * @return name of the location
     */
    public String getName() {
        return name;
    }

    /**
     * @param name name of the location
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return a list of all hotel in this location
     */
    public ArrayList<Hotel> getListHotel() {
        return listHotel;
    }

    /**
     * @return the destination where the location belongs
     */
    public Destination getDestination() {
        return destination;
    }
}

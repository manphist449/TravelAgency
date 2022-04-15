package ca.uqac._8inf334.travel_agency.classes;

import java.util.ArrayList;
import java.util.HashSet;

public class Agency {

    private String name;
    private ArrayList<Destination> listDestination;
    private HashSet<PackageDeal> listPackage;
    private HashSet<Hotel> listHotel;

    /**
     * @param name the name of the Agency
     */
    public Agency(String name) {
        this.name = name;
        this.listDestination = new ArrayList<Destination>();
    }

    /**
     * @param name the name of the Agency
     * @param destinations
     */
    public Agency(String name, ArrayList<Destination> destinations) {
        this.name = name;
        this.listDestination = destinations;
    }

    /**
     * @return a list of all destination of the agency
     */
    public ArrayList<Destination> getListDestination() {
        return listDestination;
    }

    /**
     * @param destination a destination add to the agency's destination list
     */
    public void addDestination(Destination destination) {
        this.listDestination.add(destination);
    }

    /**
     * @return the name of the agency
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name of the agency
     */
    public void setName(String name) {
        this.name = name;
    }
}

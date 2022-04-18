package project.classes;

import java.util.ArrayList;
import java.util.HashSet;

public class Agency {

    public String name;
    public HashSet<Destination> listDestination;
    public HashSet<PackageDeal> listPackageDeal;
    public HashSet<Hotel> listHotel;

    /**
     * @param name String for naming the Agency
     */
    public Agency(String name) {
        this.name = name;
        this.listDestination = new HashSet<Destination>();
        this.listPackageDeal = new HashSet<PackageDeal>();
        this.listHotel = new HashSet<Hotel>();
    }

}
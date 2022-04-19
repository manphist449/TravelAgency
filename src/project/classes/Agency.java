package project.classes;

import java.util.HashSet;

/**
 *
 */
public class Agency {

    /**
     * le nom donné à l'Agence
     */
    public String name;
    /**
     * list de toutes les Destination unique présent dans l'Agence
     */
    public HashSet<Destination> listDestination;
    /**
     * list de tous les forfaits unique présent dans l'Agence
     */
    public HashSet<PackageDeal> listPackageDeal;
    /**
     * list de toutes les Hotels unique présent dans l'Agence
     */
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
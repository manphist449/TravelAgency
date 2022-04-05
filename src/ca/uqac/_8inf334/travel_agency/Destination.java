package ca.uqac._8inf334.travel_agency;

import java.util.ArrayList;

public class Destination {

    private String name;
    private ArrayList<Location> listLocation;
    private ArrayList<Activity> listActivity;
    public Destination(String name){
        this.name = name;
        this.listLocation = new ArrayList<>();
        this.listActivity = new ArrayList<>();
    }

    public Destination(String name, ArrayList<Location> listLocation, ArrayList<Activity> listActivity){
        this.name = name;
        this.listLocation = listLocation;
        this.listActivity = listActivity;
    }

    /**
     * @return name of the destination
     */
    public String getName() {
        return name;
    }

    /**
     * @param name destination name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return a list of all Location of the Destination
     */
    public ArrayList<Location> getListLocation() {
        return listLocation;
    }

    /**
     * @return a list of all Activity of the Destination
     */
    public ArrayList<Activity> getListActivity() {
        return listActivity;
    }

    /**
     * @param location A Location we can find at the Destination
     */
    public void addLocation(Location location) {

        this.listLocation.add(location);
    }

    /**
     * @param activity An Activity we can do in the Destination
     */
    public void addActivity(Activity activity) {

        this.listActivity.add(activity);
    }

}

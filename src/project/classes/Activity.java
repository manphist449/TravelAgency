package project.classes;

/**
 *
 */
public class Activity {

    private String name;
    private String description = "";
    private Destination myDestination;

    /**
     * @param name le nom décrivant l'activité
     */
    public Activity(String name){
        this.name = name;
    }

    /**
     * @param name le nom décrivant l'activité
     * @param description une description plus détaillé de l'activité
     */
    public Activity(String name , String description){
        this.name = name;
        this.description = description;
    }

    /**
     * @return name of the activity
     */
    public String getName() {
        return name;
    }

    /**
     * @param name name of the activity
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return description of the activity
     */
    public String getDescription() {
        return description;
    }
    /**
     * @param description description of the activity
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param destination la Destination dans laquel cette activité ce situe
     */
    public void setDestination(Destination destination)
    {
        this.myDestination = destination;
    }

    /**
     * @return la Destination ayant cette activité
     */
    public Destination getDestination()
    {
        return this.myDestination;
    }
}

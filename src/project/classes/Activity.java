package project.classes;

public class Activity {

    private String name;
    private String description = "";
    private Destination myDestination;

    public Activity(String name){
        this.name = name;
    }
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

    public void setDestination(Destination destination)
    {
        this.myDestination = destination;
    }

    public Destination getDestination()
    {
        return this.myDestination;
    }
}

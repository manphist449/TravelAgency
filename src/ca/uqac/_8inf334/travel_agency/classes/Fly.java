package ca.uqac._8inf334.travel_agency.classes;

public class Fly {

    private FlyClass fClass;
    private String compagnyName;

    public Fly(String compagnyName , FlyClass flyClass){

        this.compagnyName = compagnyName;
        this.fClass = flyClass;
    }

    /**
     * @return the flyClass enum value.
     */
    public FlyClass getFlyClass() {
        return fClass;
    }

    /**
     * @return the name of the comapagny of the Fly.
     */
    public String getCompagnyName() {
        return compagnyName;
    }
}

package project.classes;

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

    @Override
    public String toString() {

        StringBuilder strbuilder = new StringBuilder();
        strbuilder.append(this.getCompagnyName()).append("(").append(this.getFlyClass()).append(")");
        return strbuilder.toString();
    }
}

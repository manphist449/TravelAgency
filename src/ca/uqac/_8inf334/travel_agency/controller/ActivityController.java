package ca.uqac._8inf334.travel_agency.controller;

import ca.uqac._8inf334.travel_agency.Activity;

import java.util.ArrayList;

public class ActivityController extends CommandLineController {

    public ActivityController()
    {

    }

    /** Show in command line a form for adding an Activity
     * @return Activity
     */
    public Activity createActivity()
    {
        String name = "";

        System.out.println("<Création d'une activité>");

        do{
            System.out.print("Entrer un nom: ");
        }
        while((name = scanner.nextLine().trim()).isEmpty());

        System.out.print("Entrer une desciption: ");
        String desciption = scanner.nextLine().trim();

        return new Activity(name, desciption);
    }

    /** Show the list of Activity where you can select one to inspect
     * @param listActivity a list of all Activity you want to select from
     */
    public void listActivity(ArrayList<Activity> listActivity)
    {
        int listSize = listActivity.size();
        if(listSize > 0)
        {
            String choice = "";
            int intChoice = -1;
            boolean exit = false;
            boolean wrongChoice;
            while(!exit) {
                System.out.println("Liste des activités à consulter:");
                wrongChoice = false;
                for (int x = 0; x < listActivity.size(); x++) {
                    System.out.print("  " + x + ":");
                    System.out.println(listActivity.get(x).getName());
                }
                System.out.println("  x:Retour");

                if (scanner.hasNextInt()) {
                    intChoice = scanner.nextInt();
                    if (intChoice >= 0 && intChoice < listSize) {
                        this.optionActivity(listActivity.get(intChoice));
                    }else
                    {
                        wrongChoice = true;
                    }
                }else
                {
                    choice = scanner.nextLine();
                    if(choice.equals("x"))
                    {
                        System.out.println("Retour!");
                        exit = true;
                    }else
                    {
                        wrongChoice = true;
                    }
                }

                if(wrongChoice)
                {
                    System.out.println("Option invalide!");
                }
            }

        }else
        {
            System.out.println("Il n'y a présentement aucune activité.");
        }
    }

    /** Give the option you can perform in an Activity
     * @param activity the activity you want to use
     */
    private void optionActivity(Activity activity)
    {
        String choice;
        boolean exit = false;
        while(!exit){
            System.out.println("<Activité: "+ activity.getName()+">");
            System.out.println("Choisir une option");
            System.out.println("    1:Changer le nom");
            System.out.println("    2:Changer la description");
            System.out.println("    x:Retour");

            while((choice = scanner.nextLine().trim()).isEmpty());

            switch(choice)
            {
                case "1":{
                    String oldName = activity.getName();
                    activity.setName(this.enterActivityName());
                    System.out.println("Le nom a été modifié: " + oldName + " -> " + activity.getName());
                }break;
                case "2":{
                    String oldDescription = activity.getDescription();
                    activity.setDescription(this.enterActivityDescription());
                    System.out.println("La description a été modifié: " + oldDescription + " -> " + activity.getDescription());
                }break;
                case "x":{
                    System.out.println("Retour!");
                    exit = true;
                }break;
                default:{
                    System.out.println("Option invalide!");
                }
            }
        }
    }

    /** Command for entering the Activity name
     * @return the name enter by the user for the Activity
     */
    private String enterActivityName() {

        String name = "";
        do{
            System.out.print("Entrer un nom: ");
        }
        while((name = scanner.nextLine().trim()).isEmpty());

        return name;

    }
    /** Command for entering the Activity description
     * @return the description enter by the user for the Activity
     */
    private String enterActivityDescription()
    {
        System.out.print("Entrer une desciption: ");
        return scanner.nextLine().trim();
    }

}

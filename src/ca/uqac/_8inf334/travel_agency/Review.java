package ca.uqac._8inf334.travel_agency;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Review {

    private String date;
    private String comment;
    private String username;
    private Stars rating;

    public Review(String username, String comment, Stars star, String date){

        this.username = username;
        this.comment = comment;
        this.rating = star;
        this.date = date;
    }

    /**
     * @return date of the review
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the comment describing the review
     */
    public String getComment() {
        return comment;
    }

    /**
     * @return the username of the person who did the review
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the number of stars the review get / his score ( 1 poorly ... 5 excellent)
     */
    public int getRatingValue() {
        return rating.getValue();
    }

    public static boolean isValidDate(String date)  {
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        format.setLenient(false);
        try {
            format.parse(date);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    /**
     * @return a string of today date in the form of "yyyy/MM/dd"
     */
    public static String getTodayDate()  {
        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return sdf.format(new Date());
    }
}

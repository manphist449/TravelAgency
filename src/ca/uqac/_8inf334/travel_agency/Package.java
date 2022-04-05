package ca.uqac._8inf334.travel_agency;

import java.util.Date;

public class Package {

    private float price;
    private Date date;
    private Fly fly;
    private Hotel hotel;

    public Package(float price,Date date, Fly fly, Hotel hotel){

        this.price = price;
        this.date = date;
        this.fly = fly;
        this.hotel = hotel;
    }

    public float getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public Fly getFly() {
        return fly;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void printInfo()
    {
//        System.out.println("Forfait à " + price + "$ pour le ");
    }
}

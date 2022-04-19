package project.classes;

import java.util.Date;

public class PackageDeal {

    private float price;
    private String date;
    private Fly fly;
    private Hotel hotel;
    public Agency myAgency;

    public PackageDeal(float price, String date, Fly fly, Hotel hotel){

        this.price = price;
        this.date = date;
        this.fly = fly;
        this.hotel = hotel;
    }

    public float getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public Fly getFly() {
        return fly;
    }

    public Hotel getHotel() {
        return hotel;
    }

    @Override
    public String toString() {

        StringBuilder strbuilder = new StringBuilder("Deal ->");
        strbuilder.append(" Price:").append(this.getPrice()).append("$");
        strbuilder.append(" Date:").append(this.getDate());
        strbuilder.append(" Fly:").append(this.getFly());
        strbuilder.append(" Hotel:").append(this.getHotel().getName());
        return strbuilder.toString();
    }
}

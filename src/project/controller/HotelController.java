package project.controller;

import project.classes.*;

class HotelController {

    private Hotel myHotel;

    public HotelController()
    {

    }

    public void setHotel(Hotel hotel)
    {
        this.myHotel = hotel;
    }

    public void setDestination(Destination destination)
    {
        this.myHotel.destination = destination;
    }

    public void addReview(Review review)
    {
        this.myHotel.listReview.add(review);
    }

    public void removeReview(Review review)
    {
        this.myHotel.listReview.remove(review);
    }

    public void addPackageDeal(PackageDeal packageDeal)
    {
        this.myHotel.listPackageDeal.add(packageDeal);
    }

    public String getViewAllReview()
    {
        StringBuilder sb = new StringBuilder("<Hotel \""+ this.myHotel.getName() +"\" reviews>").append(System.lineSeparator());

        for (Review review: myHotel.listReview) {
            sb.append("Rating:").append(review.getRatingValue()).append(" By:").append(review.getUsername()).append(" On:").append(review.getDate());
            sb.append(System.lineSeparator());
            sb.append("\"").append(review.getComment()).append("\"").append(System.lineSeparator());
        }

        return sb.toString();
    }

}

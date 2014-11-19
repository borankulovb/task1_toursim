package com.epam.first_task.entity;

public class Hotel {
    private String hotelName;
    private int hotelStarRating;

    public Hotel() {
    }

    public Hotel(String hotelName, int hotelStarRating) {
        if (hotelStarRating<0) {
            hotelStarRating = Math.abs(hotelStarRating);
        }

        this.hotelStarRating = hotelStarRating;
        this.hotelName = hotelName;
    }


    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelStarRating() {
        return hotelStarRating;
    }

    public void setHotelStarRating(int hotelStarRating) {
        this.hotelStarRating = hotelStarRating;
    }
}

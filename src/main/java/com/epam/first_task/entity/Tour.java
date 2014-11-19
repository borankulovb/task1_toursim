package com.epam.first_task.entity;

import com.epam.first_task.enums.Meal;

import java.util.List;

/**
 * The class that contains a tour
 * <p>
 * This class contains data on tour
 *
 * @author Bakytzhan Borankulov
 */

public class Tour {

    private int price;

    private int numberOfDays;

    private Meal meal;

    private String transportType;

    private String country;

    private List<String> destination;

    private Hotel hotel;

    /**
     * Default constructor
     */
    public Tour() {
    }

    /**
     * JavaBeans Builder Pattern implementation for Tour
     */

    public void setPrice(int val) {
        if (val<0) {
            val = Math.abs(val);
        }
        this.price = val;
    }

    public void setNumberOfDays(int val) {
        if (val<0) {
            val = Math.abs(val);
        }
        this.numberOfDays = val;
    }

    public void setMeal(Meal val) {
        this.meal = val;
    }

    public void setTransportType(String val) {
        this.transportType = val;
    }

    public void setCountry(String val) {
        this.country = val;
    }

    public void setHotel(Hotel val) {
        this.hotel = val;
    }

    public void setDestination(List<String> val) {
        this.destination = val;
    }


    /**
     * @return transportType
     */
    public String getTransportType() {
        return transportType;
    }


    /**
     * @return meal
     */
    public Meal getMeal() {
        return meal;
    }


    /**
     * @return numberOfDays
     */
    public int getNumberOfDays() {
        return numberOfDays;
    }


    /**
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @return destinations
     */
    public List<String> getDestinations() {
        return destination;
    }


    @Override
    public String toString() {
        return  "price=" + price +
                ", numberOfDays=" + numberOfDays +
                ", meal=" + meal +
                ", transportType='" + transportType + '\'' +
                ", country='" + country + '\'' +
                ", destination=" + destination +
                ", hotel=" + hotel +
                '}';
    }
}

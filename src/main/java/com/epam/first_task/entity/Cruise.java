package com.epam.first_task.entity;

import com.epam.first_task.enums.CabinTypes;

/**
 * The class that contains a cruise
 * <p/>
 * This class contains data on cruise
 *
 * @author Bakytzhan Borankulov
 */

public class Cruise extends Tour {

    private String shipModel;

    private CabinTypes cabin;

    /**
     * Default constructor
     */
    public Cruise() {

    }

    /**
     * JavaBeans Builder Pattern implementation for Tour
     */
    public void setShipModel(String val) {
        this.shipModel = val;
    }

    public void setCabin(CabinTypes val) {
        this.cabin = val;
    }

    /**
     * @return shipModel
     */
    public String getShip_model() {
        return shipModel;
    }



    /**
     * @return cabin
     */
    public CabinTypes getCabin() {
        return cabin;
    }



    @Override
    public String toString() {
        return "Cruise: " + super.toString() +
               "ship_model='" + shipModel + '\'' +
                ", cabin=" + cabin +
                '}';
    }

}

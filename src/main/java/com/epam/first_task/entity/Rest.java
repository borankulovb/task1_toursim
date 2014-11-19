package com.epam.first_task.entity;

/**
 * This class contains data on the rest
 *
 * @author Bakytzhan Borankulov
 */

public class Rest extends Tour {

    private int distanceToSettlement;
    /**
     * Default constructor
     */
    public Rest() {

    }
    /**
     * JavaBeans Builder Pattern implementation for Tour
     */
    public void setDistanceToSettlement(int val) {
        if (val<0) {
            val = Math.abs(val);
        }
        this.distanceToSettlement = val;
    }
    /**
     * @return distanceToSettlement
     */
    public int getDistanceToSettlement() {
        return distanceToSettlement;
    }



    @Override
    public String toString() {
        return "Rest: " + super.toString() +
                "distanceToSettlement=" + distanceToSettlement +
                '}';
    }
}

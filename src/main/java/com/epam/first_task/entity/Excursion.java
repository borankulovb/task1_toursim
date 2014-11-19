package com.epam.first_task.entity;


import java.util.ArrayList;
import java.util.List;

/**
 * The class that contains an Excursion
 * <p/>
 * This class contains data on excursion
 *
 * @author Bakytzhan Borankulov
 */

public class Excursion extends Tour {

    private List<String> paidSightsOfExcursion = new ArrayList<String>();

    private List<String> unpaidSightsOfExcursion = new ArrayList<String>();
    /**
     * Default constructor
     */
    public Excursion() {

    }
    /**
     * JavaBeans Builder Pattern implementation for Tour
     */
    public void setPaidSightsOfExcursion(List<String> val) {
        this.paidSightsOfExcursion = val;
    }

    public void setUnpaidSightsOfExcursion(List<String> val) {
        this.unpaidSightsOfExcursion = val;
    }

    /**
     * @return unpaidSightsOfExcursion
     */
    public List<String> getUnpaidSightsOfExcursion() {
        return unpaidSightsOfExcursion;
    }

     /**
     * @return paidSightsOfExcursion
     */
    public List<String> getPaidSightsOfExcursion() {
        return paidSightsOfExcursion;
    }


    @Override
    public String toString() {
        return "Excursion:  " + super.toString() +
                ", unpaidSightsOfExcursion=" + unpaidSightsOfExcursion +
                ", paidSightsOfExcursion =" + paidSightsOfExcursion +
                '}';
    }
}

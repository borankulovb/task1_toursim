package com.epam.first_task.entity;


import java.util.ArrayList;
import java.util.List;

/**
 * This class contains data on shopping
 *
 * @author Bakytzhan Borankulov
 */


public class Shopping extends Tour {

    private List<String> shopBrandList = new ArrayList<String>();
    /**
     * Default constructor
     */
    public Shopping() {

    }

    /**
     * JavaBeans Builder Pattern implementation for Tour
     */
    public void setShopBrandList(List<String> val) {
        this.shopBrandList = val;
    }

    /**
     * @return shopBrandList
     */
    public List<String> getShopBrandList() {
        return shopBrandList;
    }




    @Override
    public String toString() {
        return "Shopping: " + super.toString() +
                "shopBrandList=" + shopBrandList +
                '}';
    }
}

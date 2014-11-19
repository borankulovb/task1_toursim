package com.epam.first_task.entity;


import java.util.ArrayList;
import java.util.List;

/**
 * This class contains data on treatment
 *
 * @author Bakytzhan Borankulov
 */

public class Treatment extends Tour {

    private String clinicName;

    private List<String> specializationOfClinic = new ArrayList<String>();
    /**
     * list of medical procedures
     */
    private List<String> medicalProcedure = new ArrayList<String>();
    /**
     * price List
     */
    private List<Integer> priceList = new ArrayList<Integer>();

    /**
     * Default constructor
     */
    public Treatment() {

    }

    /**
     * JavaBeans Builder Pattern implementation for Tour
     */
    public void setClinicName(String val) {
        this.clinicName = val;
    }

    public void setSpecializationOfClinic(List<String> val) {
        this.specializationOfClinic = val;
    }

    public void setMedicalProcedure(List<String> val) {
        this.medicalProcedure = val;
    }

    public void setPriceList(List<Integer> val) {
        this.priceList = val;
    }

    /**
     * @return clinicName
     */
    public String getClinicName() {
        return clinicName;
    }



    /**
     * @return specializationOfClinic
     */
    public List<String> getSpecializationOfClinic() {
        return specializationOfClinic;
    }



    /**
     * @return medicalProcedure
     */
    public List<String> getProcedures() {
        return medicalProcedure;
    }



    /**
     * @return priceList
     */
    public List<Integer> getPriceList() {
        return priceList;
    }

    @Override
    public String toString() {
        return "Treatment: " + super.toString() +
                "clinicName='" + clinicName + '\'' +
                ", specializationOfClinic=" + specializationOfClinic +
                ", procedures=" + medicalProcedure +
                ", priceList=" + priceList +
                '}';
    }
}

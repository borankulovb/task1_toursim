package com.epam.first_task.entity;

import com.epam.first_task.enums.CabinTypes;
import com.epam.first_task.enums.Meal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * The class that contains a company
 * <p>
 * This class contains Factory pattern implementation for creating Tours and adds those tours to company
 *
 * @author Bakytzhan Borankulov
 */
public class Company {

    private String companyName;

    private List<Tour> toursList = new ArrayList<Tour>();




    /**
     * Default constructor
     */
    public Company() {
    }

    /**
     * Constructor with parametrs
     *
     * @param name
     * @param toursList
     */

    public Company(String name, ArrayList<Tour> toursList) {
        this.companyName = name;
        this.toursList = toursList;
    }

    /**
     * Constructor with parametrs
     *
     * @param name
     */
    public Company(String name) {
        this.companyName = name;
    }

    /**
     * @return name
     */

    public String getName() {
        return companyName;
    }

    /**
     * @param toursList
     */
    public void setToursList(List<Tour> toursList) {
        this.toursList = toursList;
    }

    /**
     * @return toursList
     */
    public List<Tour> getToursList() {
        return this.toursList;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.companyName = name;
    }

    /**
     * This method randomly generates the tour
     */
    public static Tour createRandomTour() {
        Random rand = new Random();
        switch (rand.nextInt(4)) {
            case 0:
                Treatment seoulTreatment = new Treatment();
                seoulTreatment.setTransportType("bus");
                seoulTreatment.setMeal(Meal.values()[(new Random().nextInt(Meal.values().length))]);
                seoulTreatment.setNumberOfDays(rand.nextInt(50));
                seoulTreatment.setCountry("South Korea");
                seoulTreatment.setHotel(new Hotel("Rixos", 5));
                seoulTreatment.setPrice(rand.nextInt(700));
                seoulTreatment.setClinicName("Mayo Clinic");
                seoulTreatment.setSpecializationOfClinic(Arrays.asList("Сardiology", "Dermatology"));
                seoulTreatment.setDestination(Arrays.asList("Busan", "Seoul"));
                seoulTreatment.setMedicalProcedure(Arrays.asList("Consultation", "Cardiogram"));
                return seoulTreatment;
            case 1:
                Shopping basconiShopping = new Shopping();
                basconiShopping.setTransportType("car");
                basconiShopping.setMeal(Meal.values()[(new Random().nextInt(Meal.values().length))]);
                basconiShopping.setNumberOfDays(rand.nextInt(50));
                basconiShopping.setCountry("Italy");
                basconiShopping.setHotel(new Hotel("Royal Hotel", 5));
                basconiShopping.setPrice(rand.nextInt(700));
                basconiShopping.setDestination(Arrays.asList("Milan, Paris"));
                basconiShopping.setShopBrandList(Arrays.asList("Louis Vuitton", "Basconi"));
                return basconiShopping;
            case 2:
                Rest restInTurkey = new Rest();
                restInTurkey.setTransportType("car");
                restInTurkey.setMeal(Meal.values()[(new Random().nextInt(Meal.values().length))]);
                restInTurkey.setNumberOfDays(rand.nextInt(50));
                restInTurkey.setCountry("Turkey");
                restInTurkey.setHotel(new Hotel("Barut Lara 4", 4));
                restInTurkey.setPrice(rand.nextInt(700));
                restInTurkey.setDestination(Arrays.asList("Kemer", "Ankara"));
                restInTurkey.setDistanceToSettlement(rand.nextInt(500));
                return restInTurkey;
            case 3:
                Excursion egyptExcursion = new Excursion();
                egyptExcursion.setTransportType("car");
                egyptExcursion.setMeal(Meal.values()[(new Random().nextInt(Meal.values().length))]);
                egyptExcursion.setNumberOfDays(rand.nextInt(50));
                egyptExcursion.setCountry("Egypt");
                egyptExcursion.setHotel(new Hotel("Four Seasons", 3));
                egyptExcursion.setPrice(rand.nextInt(700));
                egyptExcursion.setDestination(Arrays.asList("Cairo", "Alexandria"));
                egyptExcursion.setPaidSightsOfExcursion(Arrays.asList("The Egyptian Museum", "Pyramids of Giza"));
                egyptExcursion.setUnpaidSightsOfExcursion(Arrays.asList("Citadel and Mosque of Ali Pasha", "Coptic Cairo"));
                return egyptExcursion;
            case 4:
                Cruise cubaCruise = new Cruise();
                cubaCruise.setTransportType("liner");
                cubaCruise.setMeal(Meal.values()[(new Random().nextInt(Meal.values().length))]);
                cubaCruise.setNumberOfDays(rand.nextInt(50));
                cubaCruise.setCountry("Cuba");
                cubaCruise.setHotel(new Hotel("Iberostar Varadero", 5));
                cubaCruise.setPrice(rand.nextInt(700));
                cubaCruise.setDestination(Arrays.asList("Dominica", "Cayo Romano"));
                cubaCruise.setShipModel("Aquitania-M01");
                cubaCruise.setCabin(CabinTypes.values()[(new Random().nextInt(CabinTypes.values().length))]);
                return cubaCruise;
            default:
                throw new IllegalArgumentException();
        }
    }

    /**
     * This method adds tours to company
     */
    public Company addToursToCompany(Company company, int countTours) {
        List<Tour> tours = new ArrayList<Tour>();
        for (int i = 0; i < countTours; i++) {
            tours.add(Company.createRandomTour());
        }
        company.setToursList(tours);
        return company;

    }


    public String toString() {
        return "\nTours = " + toursList;
    }


}

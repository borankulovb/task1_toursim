package com.epam.first_task.logic;



import com.epam.first_task.entity.Tour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This class contains actions to work with tours.
 *
 * This class describes the basic methods used to work with tours
 *
 * @author Bakytzhan Borankulov
 */
public class Operation {
    /**
     * This method sorts tours by duration
     * @param tours
     */
    public static void sortToursByDuration (List<Tour> tours) {
        Collections.sort(tours, Comparator.comparing(Tour::getNumberOfDays));


    }
    /**
     * This method searches optimal tour by transport type, meal, duration
     *
     * @param transportType
     * @param duration
     * @param meal
     * @param tours
     * return foundTours
     */
    public static List<Tour> searchOptimalTour(List<Tour> tours, String transportType, String meal, int duration) {
        List<Tour> foundTours = new ArrayList<Tour>();
        if(!tours.isEmpty()) {
            for (int i = 0; i < tours.size(); i++) {
                if (tours.get(i).getTransportType()==transportType &&
                    tours.get(i).equals(meal) &&
                    tours.get(i).getNumberOfDays() == duration) foundTours.add(tours.get(i));
            }
        }
        return  foundTours;
    }

    /**
     *  This method searches tour by transport type
     * @param tours
     * @param transportType
     * @return foundTours
     */

    public static  List<Tour> findTourByTransportType(List<Tour> tours, String transportType ) {
        List<Tour> foundTours = new ArrayList<Tour>();
        if (!tours.isEmpty()) {
            for (Tour tour : tours) {
                if((transportType.valueOf(transportType)).equals(tour.getTransportType())) {
                    foundTours.add(tour);
                }
            }
        }

        return foundTours;
    }

    /**
     * This method searches tour by duration
     * @param tours
     * @param duration
     * @return foundTours
     */


    public static List<Tour> findTourByDuration(List<Tour> tours, int duration ) {
        List<Tour> foundTours = new ArrayList<>();
        if(!tours.isEmpty())        {
            for (Tour tour : tours) {
            if(duration == tour.getNumberOfDays()) {
                foundTours.add(tour);
            }
        }
        }
            return foundTours;
            }

    /**
     *This method searches tour by type of meal
     * @param tours
     * @param meal
     * @return foundTours
     */
    public static  List<Tour> findTourByMeal(List<Tour> tours, String meal ) {
        List<Tour> foundTours = new ArrayList<Tour>();
        if (!tours.isEmpty()) {
            for (Tour tour : tours) {
                if(meal.equals(tour.getMeal()))  {
                    foundTours.add(tour);
                }
            }
        }

        return foundTours;
    }














}

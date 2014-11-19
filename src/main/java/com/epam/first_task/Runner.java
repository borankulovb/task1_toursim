package com.epam.first_task;

import com.epam.first_task.entity.Company;
import com.epam.first_task.enums.Meal;
import com.epam.first_task.logic.Operation;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * The Runner class for tours
 * <p>
 * This class contains the main method
 *
 * @author Bakytzhan Borankulov
 */
public class Runner {

    /**
     * The main method.
     *
     * @param args
     */
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(com.epam.first_task.Runner.class);
        log.info("Start");
        log.debug("Start");
        Scanner in = new Scanner(System.in);
        Company company = new Company();
        int key;
        int countTours;
        String transportType;
        String meal;
        int duration;
        while (true) {
            System.out.println(" \n 1:1 Create company" + "\n"
                    + "2: Sort tours by duration" + "\n"
                    + "3: Find optimal tour" + "\n"
                    + "4: Find tour by the the of transport" + "\n"
                    + "5: Find tour by duration" + "\n"
                    + "6: Find tour by meal");
            key = in.nextInt();
            switch (key) {
                case 1: {
                    log.info("Company has been created");
                    System.out.println("Enter the quantity of tours");
                    countTours = in.nextInt();
                    company.addToursToCompany(company, countTours);
                    log.info(String.valueOf(company));
                    break;
                }
                case 2: {
                    log.info("Tours have been sorted ");
                    Operation.sortToursByDuration(company.getToursList());
                    log.info(String.valueOf(company));
                    break;

                }
                case 3: {
                    System.out.println("Enter the type of transport");
                    transportType = in.next();
                    System.out.println("Enter the type of Meal");
                    for (Meal meal1 : Meal.values()) {
                        System.out.println(meal1.name() + " ");
                    }
                    meal = in.next();
                    System.out.println("Enter the duration of tour");
                    duration = in.nextInt();
                    log.info("Found tours by type of the transport,meal and tour: ");
                    log.info(String.valueOf(Operation.searchOptimalTour(company.getToursList(), transportType.toLowerCase(),
                            meal.toUpperCase(), duration)));
                }
                case 4: {
                    System.out.println("Enter the type of transport");
                    transportType = in.next();
                    log.info("Tours have been found by type of the transport: ");
                    log.info(String.valueOf(Operation.findTourByTransportType(company.getToursList(), transportType)));
                    break;
                }
                case 5: {
                    System.out.println("Enter the duration of tour");
                    duration = in.nextInt();
                    log.info("Tours have been found by duration");
                    log.info(String.valueOf(Operation.findTourByDuration(company.getToursList(), duration)));
                    break;
                }
                case 6:
                    System.out.println("Enter the type of Meal");
                    for (Meal meal1 : Meal.values()) {
                        System.out.println(meal1.name() + " ");
                    }
                    meal = in.next();
                    log.info("Tours have been found by type of meal");
                    log.info(String.valueOf(Operation.findTourByMeal(company.getToursList(), meal)));
                    break;
            }
        }


    }


}


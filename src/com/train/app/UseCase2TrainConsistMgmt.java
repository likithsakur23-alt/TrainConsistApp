package com.train.app;

import java.util.ArrayList;
import java.util.List;

public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("==========================================\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ----- CREATE (Add bogies) -----
        passengerBogies.add("Bogie-A1");
        passengerBogies.add("Bogie-A2");
        passengerBogies.add("Bogie-A3");

        System.out.println("After Adding Bogies:");
        System.out.println(passengerBogies);

        // ----- READ (Check availability) -----
        String searchBogie = "Bogie-A2";
        if (passengerBogies.contains(searchBogie)) {
            System.out.println(searchBogie + " is available in the train.");
        } else {
            System.out.println(searchBogie + " is NOT available.");
        }

        // ----- DELETE (Remove bogie) -----
        passengerBogies.remove("Bogie-A1");

        System.out.println("\nAfter Removing Bogie-A1:");
        System.out.println(passengerBogies);

        // ----- FINAL CONSIST -----
        System.out.println("\nFinal Train Consist:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }
    }
}
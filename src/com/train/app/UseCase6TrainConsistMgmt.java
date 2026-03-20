package com.train.app;

import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("==========================================\n");

        // HashMap stores data in key → value format
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- INSERT bogie capacities ----
        capacityMap.put("Bogie-A1", 50);
        capacityMap.put("Bogie-A2", 60);
        capacityMap.put("Bogie-A3", 55);
        capacityMap.put("Bogie-A4", 70);

        // ---- DISPLAY mapping ----
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }

        // ---- ACCESS specific bogie ----
        String search = "Bogie-A2";
        System.out.println("\nCapacity of " + search + ": " + capacityMap.get(search));

        // ---- TOTAL bogies ----
        System.out.println("\nTotal Bogies: " + capacityMap.size());
    }
}
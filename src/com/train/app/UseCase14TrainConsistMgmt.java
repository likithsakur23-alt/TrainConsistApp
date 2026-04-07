package com.train.app;

import java.util.HashMap;
import java.util.Map;

// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

public class UseCase14TrainConsistMgmt {

    // Method to add bogie with validation
    public static void addBogie(Map<String, Integer> map, String bogie, int capacity)
            throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Invalid capacity for " + bogie);
        }

        map.put(bogie, capacity);
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("==========================================\n");

        Map<String, Integer> capacityMap = new HashMap<>();

        try {
            // Valid entries
            addBogie(capacityMap, "Bogie-A1", 50);
            addBogie(capacityMap, "Bogie-A2", 60);

            // Invalid entry (will throw exception)
            addBogie(capacityMap, "Bogie-A3", -10);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nFinal Bogie Capacity Map:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
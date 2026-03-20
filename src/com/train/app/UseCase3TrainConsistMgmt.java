package com.train.app;

import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("==========================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet stores only unique values
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (will be ignored)
        bogies.add("BG101");
        bogies.add("BG102");

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs in Train:");
        for (String bogie : bogies) {
            System.out.println(bogie);
        }

        // Display total count
        System.out.println("\nTotal Unique Bogies: " + bogies.size());
    }
}
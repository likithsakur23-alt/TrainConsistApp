package com.train.app;

import java.util.LinkedHashSet;
import java.util.Set;

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("==========================================\n");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ---- ADD bogies ----
        formation.add("Engine");
        formation.add("Bogie-A1");
        formation.add("Bogie-A2");
        formation.add("Bogie-A3");

        // Duplicate entries (will be ignored)
        formation.add("Bogie-A2");
        formation.add("Bogie-A1");

        System.out.println("Train Formation (No duplicates, Order maintained):");
        for (String bogie : formation) {
            System.out.println(bogie);
        }

        // Display total bogies
        System.out.println("\nTotal Bogies: " + formation.size());
    }
}
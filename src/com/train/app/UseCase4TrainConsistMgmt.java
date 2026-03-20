package com.train.app;

import java.util.LinkedList;
import java.util.List;

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("==========================================\n");

        // Create a LinkedList
        // LinkedList maintains insertion order and allows fast inserts/removals
        List<String> trainConsist = new LinkedList<>();

        // ---- ADD bogies in sequence ----
        trainConsist.add("Engine");
        trainConsist.add("Bogie-A1");
        trainConsist.add("Bogie-A2");
        trainConsist.add("Bogie-A3");

        System.out.println("After Adding Bogies:");
        System.out.println(trainConsist);

        // ---- INSERT at specific position ----
        trainConsist.add(2, "Bogie-VIP");

        System.out.println("\nAfter Inserting Bogie-VIP at position 2:");
        System.out.println(trainConsist);

        // ---- REMOVE from front ----
        trainConsist.remove(0);

        // ---- REMOVE from rear ----
        trainConsist.remove(trainConsist.size() - 1);

        System.out.println("\nAfter Removing Front and Rear Bogies:");
        System.out.println(trainConsist);

        // ---- FINAL STRUCTURE ----
        System.out.println("\nFinal Train Structure:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}
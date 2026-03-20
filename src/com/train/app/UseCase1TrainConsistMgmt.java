package com.train.app;

import java.util.ArrayList;
import java.util.List;

public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("====================================");
        System.out.println("   Train Consist Management App   ");
        System.out.println("====================================\n");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...");
        System.out.println("Current number of bogies: " + trainConsist.size());

        // Print current state of train
        System.out.println("Train Consist: " + trainConsist);
    }
}
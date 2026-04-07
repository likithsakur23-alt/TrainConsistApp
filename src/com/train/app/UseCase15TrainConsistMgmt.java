package com.train.app;

public class UseCase15TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("UC15 - Safe Cargo Assignment\n");

        try {
            int capacity = 50;
            int load = 70;

            if (load > capacity) {
                throw new Exception("Load exceeds capacity!");
            }

            System.out.println("Cargo assigned successfully");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
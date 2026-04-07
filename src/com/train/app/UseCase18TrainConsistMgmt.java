package com.train.app;

public class UseCase18TrainConsistMgmt {
    public static void main(String[] args) {

        System.out.println("UC18 - Linear Search\n");

        int[] bogies = {101, 102, 103, 104};
        int key = 103;
        boolean found = false;

        for (int b : bogies) {
            if (b == key) {
                found = true;
                break;
            }
        }

        System.out.println("Found: " + found);
    }
}
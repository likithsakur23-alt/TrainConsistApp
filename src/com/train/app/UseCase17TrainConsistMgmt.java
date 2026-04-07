package com.train.app;

import java.util.Arrays;

public class UseCase17TrainConsistMgmt {
    public static void main(String[] args) {

        System.out.println("UC17 - Sort Bogie Names\n");

        String[] bogies = {"B3", "B1", "B2"};

        Arrays.sort(bogies);

        for (String b : bogies) {
            System.out.println(b);
        }
    }
}
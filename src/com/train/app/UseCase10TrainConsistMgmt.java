package com.train.app;

import java.util.Arrays;
import java.util.List;

public class UseCase10TrainConsistMgmt {
    public static void main(String[] args) {

        System.out.println("UC10 - Count Total Seats\n");

        List<Integer> seats = Arrays.asList(50, 60, 55);

        int total = seats.stream().reduce(0, Integer::sum);

        System.out.println("Total Seats: " + total);
    }
}
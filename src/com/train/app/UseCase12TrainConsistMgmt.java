package com.train.app;

import java.util.Arrays;
import java.util.List;

public class UseCase12TrainConsistMgmt {
    public static void main(String[] args) {

        System.out.println("UC12 - Safety Check\n");

        List<Integer> capacities = Arrays.asList(50, 60, 120);

        boolean safe = capacities.stream().allMatch(c -> c <= 100);

        System.out.println("All bogies safe: " + safe);
    }
}
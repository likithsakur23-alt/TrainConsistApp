package com.train.app;

import java.util.*;
import java.util.stream.Collectors;

public class UseCase8TrainConsistMgmt {
    public static void main(String[] args) {

        System.out.println("UC8 - Filter Passenger Bogies\n");

        List<String> bogies = Arrays.asList("Passenger-A1", "Cargo-C1", "Passenger-A2");

        List<String> result = bogies.stream()
                .filter(b -> b.contains("Passenger"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
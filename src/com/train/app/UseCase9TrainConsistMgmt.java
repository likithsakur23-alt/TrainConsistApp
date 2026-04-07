package com.train.app;

import java.util.*;
import java.util.stream.Collectors;

public class UseCase9TrainConsistMgmt {
    public static void main(String[] args) {

        System.out.println("UC9 - Group Bogies by Type\n");

        List<String> bogies = Arrays.asList("Passenger-A1", "Cargo-C1", "Passenger-A2");

        Map<String, List<String>> grouped =
                bogies.stream().collect(Collectors.groupingBy(b -> b.split("-")[0]));

        System.out.println(grouped);
    }
}
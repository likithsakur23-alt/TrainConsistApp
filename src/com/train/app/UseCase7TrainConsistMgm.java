package com.train.app;

import java.util.*;

class BogieUC7 {
    String name;
    int capacity;

    BogieUC7(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class UseCase7TrainConsistMgm {
    public static void main(String[] args) {

        System.out.println("UC7 - Sort Bogies by Capacity\n");

        List<BogieUC7> list = new ArrayList<>();
        list.add(new BogieUC7("A1", 50));
        list.add(new BogieUC7("A2", 70));
        list.add(new BogieUC7("A3", 60));

        // Sort using Comparator
        list.sort(Comparator.comparingInt(b -> b.capacity));

        for (BogieUC7 b : list) {
            System.out.println(b);
        }
    }
}
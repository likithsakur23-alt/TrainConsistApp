package com.train.app;

import java.util.*;

class BogieUC16 {
    String name;
    int capacity;

    BogieUC16(String n, int c) {
        name = n;
        capacity = c;
    }

    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class UseCase16TrainConsistMgmt {
    public static void main(String[] args) {

        System.out.println("UC16 - Sort Passenger Bogies\n");

        List<BogieUC16> list = new ArrayList<>();
        list.add(new BogieUC16("A1", 60));
        list.add(new BogieUC16("A2", 40));
        list.add(new BogieUC16("A3", 80));

        list.sort((a, b) -> a.capacity - b.capacity);

        for (BogieUC16 b : list) {
            System.out.println(b);
        }
    }
}
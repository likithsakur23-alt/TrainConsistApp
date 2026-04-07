package com.train.app;

import java.util.Arrays;

public class UseCase19TrainConsistMgmt {
    public static void main(String[] args) {

        System.out.println("UC19 - Binary Search\n");

        int[] bogies = {101, 102, 103, 104};
        int key = 103;

        int index = Arrays.binarySearch(bogies, key);

        if (index >= 0)
            System.out.println("Found at index: " + index);
        else
            System.out.println("Not found");
    }
}
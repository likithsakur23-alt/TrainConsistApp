package com.train.app;

import java.util.ArrayList;
import java.util.List;

public class UseCase13TrainConsistMgmt {
    public static void main(String[] args) {

        System.out.println("UC13 - Performance Comparison\n");

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) list.add(i);

        long start = System.currentTimeMillis();
        int sum1 = 0;
        for (int i : list) sum1 += i;
        long end = System.currentTimeMillis();
        System.out.println("Loop Time: " + (end - start));

        start = System.currentTimeMillis();
        int sum2 = list.stream().mapToInt(Integer::intValue).sum();
        end = System.currentTimeMillis();
        System.out.println("Stream Time: " + (end - start));
    }
}
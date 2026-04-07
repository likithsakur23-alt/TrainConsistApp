package com.train.app;

public class UseCase20TrainConsistMgmt {
    public static void main(String[] args) {

        System.out.println("UC20 - Exception Handling During Search\n");

        int[] bogies = {101, 102, 103};

        try {
            int index = 5; // invalid index
            System.out.println(bogies[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index accessed!");
        }
    }
}
package com.train.app;

public class UseCase11TrainConsistMgmt {
    public static void main(String[] args) {

        System.out.println("UC11 - Validate IDs\n");

        String trainId = "TR123";
        String cargo = "CG456";

        boolean validTrain = trainId.matches("TR\\d+");
        boolean validCargo = cargo.matches("CG\\d+");

        System.out.println("Train ID valid: " + validTrain);
        System.out.println("Cargo Code valid: " + validCargo);
    }
}
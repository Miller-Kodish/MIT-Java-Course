package com.mit.trainingDayTwo;

public class NestedIfExample {

    public static void main(String[] args) {
        int testNumber = 60;

        if (testNumber % 2 == 0) {
            if (testNumber % 3 == 0) {
                System.out.println(testNumber + " is divisible by 6.");
            }

            if (testNumber % 5 == 0) {
                System.out.println(testNumber + " is divisible by 10.");
            }
        }

    }

}

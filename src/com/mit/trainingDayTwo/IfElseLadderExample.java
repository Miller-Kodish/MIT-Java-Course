package com.mit.trainingDayTwo;

public class IfElseLadderExample {
    public static void main(String[] args) {
        int testNumber = 17;
        if (testNumber % 2 == 0) {
            System.out.println(testNumber + " is divisible by 2.");
        } else if (testNumber % 3 == 0) {
            System.out.println(testNumber + " is divisible by 3.");
        } else {
            System.out.println(testNumber + " is neither divisible by 2 or 3.");
        }
    }
}

package com.mit.trainingDayTwo;

public class SwitchExample {
    public static void main(String[] args) {
        int testNumber = 5;

        switch (testNumber) {   // Switch CANNOT be boolean (i.e. no putting testNumber % 2 == 0)
            case 2: // Checks for 2
                System.out.println("Number is 2");
                break;

            case 5: // Checks for 5
                System.out.println("Number is 5");
                break;

            default:    // Otherwise
                System.out.println("Number is " + testNumber);
                break;
        }
    }
}

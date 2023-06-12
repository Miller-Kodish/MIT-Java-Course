package com.mit.trainingDayTwo;

public class ForLoopExample {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; i++) {   // Goes from 0 to 9
            System.out.println(i + " < 10.");
        }
        System.out.println();   // Prints empty line

        for (i = 0; i < 10; ++i) {   // Goes from 0 to 9
            System.out.println(i + " < 10.");
        }
        System.out.println();

        for (i = 10; i > 0; i--) {   // Goes from 9 to 1
            System.out.println(i + " < 10.");
        }
    }
}

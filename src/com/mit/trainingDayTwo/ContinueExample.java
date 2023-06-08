package com.mit.trainingDayTwo;

public class ContinueExample {
    public static void main(String[] args) {
        int i;
        int j;

        System.out.println("First Example:");
        outer:
        for (i = 0; i < 10; i++) {
            for (j = 0; j <= i; j++) {
                if (i >= 2) {
                    continue outer;   // Continue from the outer loop
                }
                System.out.println("  j = " + j);   // If above break is above the If Statement, would print 5 as well
            }
            System.out.println("* i = " + i + " *\n");
        }

        System.out.println("Second Example:");
        for (i = 0; i < 10; i++) {
            for (j = 0; j <= i; j++) {
                if (i >= 2) {
                    continue;   // Automatically continues from the outer loop
                }
                System.out.println("  j = " + j);   // If above break is above the If Statement, would print 5 as well
            }
            System.out.println("* i = " + i + " *\n");
        }
    }
}

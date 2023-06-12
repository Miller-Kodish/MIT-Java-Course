package com.mit.trainingDayTwo;

public class BreakExample {
    public static void main(String[] args) {
        int i;
        int j;

        System.out.println("\nFirst Example: ");
        for (i = 0; i < 10; i++) {
            if (i == 5) {
                break;   // Exit loop at 5
            }
            System.out.println("i = " + i + ".");   // If above break is above the If Statement, would print 5 as well
        }


        System.out.println("\nSecond Example: ");
        for (i = 0; i < 10; i++) {
            for (j = 0; j <= i; j++) {
                if (i == 5) {
                    break;   // Exit loop at 5
                }
                System.out.println("  j = " + j);   // If above break is above the If Statement, would print 5 as well
            }
            System.out.println("* i = " + i + " *\n");
        }

        System.out.println("Third Example: ");
        outer:
        for (i = 0; i < 10; i++) {
            for (j = 0; j <= i; j++) {
                if (i >= 5) {
                    break outer;   // Break the outer loop
                }
                System.out.println("  j = " + j);   // If above break is above the If Statement, would print 5 as well
            }
            System.out.println("* i = " + i + " *\n");
        }

    }
}

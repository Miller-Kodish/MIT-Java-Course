package com.mit.trainingDayTwo;

import java.util.Scanner;

public class ForLoopInteractiveAssignment {
    public static void main(String[] args) {
        int maximum;
        int i;
        int n;
        Scanner myObj = new Scanner(System.in); // Import Scanner for user input

        System.out.print("Enter Maximum Number of '*'s you want: "); // Get user input

        maximum = myObj.nextInt();

        // Prints the top half
        for (i = 0; i < (maximum - 1); i++) {
            for (n = 0; n < i; n++) {
                System.out.print("* ");
            }
            System.out.print("*\n");  // Prints final * with no space, and a new line
        }

        // Prints the Middle Line (At Maximum) For Easy Division Of Loops
        for (i = 0; i < maximum; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Prints the bottom half
        for (i = (maximum - 1); i > 0; i--) {
            for (n = i; n > 1; n--) {
                System.out.print("* ");
            }
            System.out.print("*\n"); // Prints final * with no space, and a new line
        }
    }
}

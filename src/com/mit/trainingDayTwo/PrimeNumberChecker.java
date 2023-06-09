package com.mit.trainingDayTwo;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        int number;
        boolean isComposite = false;    // Variable for printing, initialized to false for ease of use
        int i;
        String primeOrComposite;    // String for printing

        Scanner myObj = new Scanner(System.in); // Import Scanner for user input
        System.out.print("\nEnter the number to check if it is a prime or composite number: "); // Get user input

        number = myObj.nextInt();   // Set input to variable

        // Check edge cases of 0 and 1, as well as negative numbers
        if (number == 0) {
            System.out.println("Number entered in is 0, which is NEITHER PRIME NOR COMPOSITE.");
        } else if (number == 1) {
            System.out.println("Number entered in is 1, which is NEITHER PRIME NOR COMPOSITE.");
        } else if (number < 0) {
            System.out.println("ERROR: NUMBER IS NEGATIVE, INVALID INPUT (PLEASE TRY AGAIN).");
        } else {    // If not an edge case, evaluate normally
            for (i = 2; i < number; i++) {
                if ((number % i) == 0) {
                    isComposite = true; // Set composite value to true
                    break;    // Break from loop if composite to speed up process
                }
            }

            primeOrComposite = isComposite ? "COMPOSITE" : "PRIME"; // Set prime or composite value to print
            System.out.println("Number entered in is " + number + ", which is " + primeOrComposite + ".");
        }

    }
}

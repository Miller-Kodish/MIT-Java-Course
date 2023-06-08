package com.mit.trainingDayTwo;

import java.util.Scanner;

public class WhileLoopInteractiveExample {
    public static void main(String[] args) {
        // Print the first 6 digits of the Fibonacci Sequence using a while loop

        int numDigits;  // Number of digits desired by user
        int fibNum; // Number in the Fibonacci Sequence
        int prevSum = 0;    // Previous sum, taken from sum variable
        int sum = 1;
        int i = 2;  // Counter variable for while loop, initialized to 2 bc the pattern really starts at 2

        Scanner myObj = new Scanner(System.in); // Import Scanner for user input

        System.out.print("Enter desired number of digits in the Fibonacci Sequence: "); // Get user input

        numDigits = myObj.nextInt();

        if (numDigits > 1) {
            System.out.println("\nThe first " + numDigits + " numbers in the Fibonacci Sequence:");
        } else if (numDigits == 1) {
            System.out.println("\nThe first " + numDigits + " number in the Fibonacci Sequence:");
        } else {
            System.out.println("\nINVALID INPUT, PLEASE TRY AGAIN.");
        }

        // First two digits need to be manually printed:
        if (numDigits >= 1) {
            System.out.print("0");
            if (numDigits > 1) {
                System.out.print(", "); // Formatting case if not the only digit
            }
        }

        if (numDigits >= 2) {
            System.out.print("1");
        }


        // Create Fibonacci Series after the second digit:
        while (i < numDigits) {
            fibNum = sum + prevSum;
            System.out.print(", " + fibNum);
            prevSum = sum;
            sum = fibNum;
            i++;
        }
        System.out.println();
    }
}


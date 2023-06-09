package com.mit.trainingDayThree;

import java.util.Scanner;

public class FibonnaciSequenceRecursion {

    public static int fibonacci(int n) {
        if (n <= 1) {   // Base Case (n is less than or equal to 0):
            return n;
        } else {    // Recursive Case:
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void printFibonacciSequence(int maxNum) {
        int n;
        for (n = 0; n <= maxNum; n++) {  // Print each line, adding one more number to the fibonacci sequence
            System.out.print(fibonacci(n) + " ");
        }
    }

    public static void main(String[] args) {
        int fibNum = 0; // Number of Fibonacci numbers to print
        int i;

        Scanner myObj = new Scanner(System.in); // Import Scanner for user input
        System.out.print("Enter the maximum number of values in the fibonacci sequence you want to see: ");
        fibNum = myObj.nextInt();

        System.out.println("----- Pattern With " + fibNum + " Terms -----");

        for (i = 0; i < fibNum; i++) {  // Call print statements
            printFibonacciSequence(i);
            System.out.println();
        }
    }
}
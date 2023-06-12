package com.mit.trainingDayThree;

public class RecurranceExample {

    int result = 1;

    public static void main(String[] args) {
        int factorialNumber = 2;
        RecurranceExample recExample = new RecurranceExample();
        if (factorialNumber > 0) {  // Print formatting for positive numbers
            System.out.println(factorialNumber + "! is equal to: " + recExample.factorial(factorialNumber));
        } else {    // Print formatting for negative numbers
            System.out.println("(" + factorialNumber + ")" + "! is equal to: " + recExample.factorial(factorialNumber));
        }
    }

    public int factorial(int number) {
        if ((number == 1) || (number == 0)) {   // Base Case
            return (1);
        } else {    // Recursive Case
            result = result * number;
            if (number > 0) {   // If positive number, go closer to 0 by subtracting one
                factorial(number - 1);
            } else {    // If negative number, go closer to 0 by adding one
                factorial(number + 1);
            }
        }
        return result;
    }
}

package com.mit.trainingDayTwo;

import java.util.Scanner;

public class IfStatementInteractiveAssignment {
    public static void main(String[] args) {
        // If age is at least 18, you can play up to A-Rated Games
        // If age is at least 17, you can play up to M-Rated Games
        // If age is at least 13, you can play up to T-Rated Games
        // If age is at least 10, you can play up to E(10+)-Rated Games
        // Otherwise you can play games that are E-Rated and ec-Rated

        int age;
        Scanner myObj = new Scanner(System.in); // Import Scanner for user input

        System.out.print("Enter your age (as an integer): "); // Get user input

        age = myObj.nextInt();  // Make user input the age variable

        System.out.println("\nAge entered is " + age + " years old.\n");    // Prints out age for confirmation

        if (age >= 18) {
            System.out.println("The highest rating ESRB game you can play is A-Rated Games.\n");
            age = 18;   // Fix the age for the switch statement
        } else if (age == 17) {
            System.out.println("The highest ESRB rating game you can play is M-Rated Games.\n");
        } else if ((age >= 13) && (age < 17)) {
            System.out.println("The highest ESRB rating game you can play is T-Rated Games.\n");
            age = 13;   // Fix the age for the switch statement
        } else if (age == 10) {
            System.out.println("The highest ESRB rating game you can play is E(10+)-Rated Games.\n");
        } else {
            System.out.println("The highest rating ESRB game you can play is E-Rated Games, and ec-Rated Games.\n");
        }

        // Print out a list of the ratings of games you can play
        System.out.print("List of ESRB ratings you can play: ");

        // Create List From Age:
        switch (age) {
            case 18:
                System.out.print("A, ");

            case 17:
                System.out.print("M, ");

            case 13:
                System.out.print("T, ");

            case 10:
                System.out.print("E(10+), ");

            default:
                System.out.println("E, and ec.");
                break;
        }

    }


}

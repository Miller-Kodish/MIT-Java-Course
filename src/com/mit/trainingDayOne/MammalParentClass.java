package com.mit.trainingDayOne;

import java.util.Scanner;

public class MammalParentClass {

    String mammalOne = "Platypus";
    String mammalTwo = "Otter";

    protected String addTwoMammals(String firstMammal, String secondMammal) {
        System.out.println("\n(Accessed addTwoMammals function in Parent, MammalClass.java)");  // Show code is inherited from parent class
        return (firstMammal + " and " + secondMammal);  // Concatenate two strings with a conjoiner
    }

    protected void nameTwoMammals(String firstMammal, String secondMammal) {
        // Set name variables with defaults
        String nameMammalOne = "Perry";
        String nameMammalTwo = "Sid";

        Scanner mammalName = new Scanner(System.in); // Import Scanner for user input

        System.out.println("\n(Accessed nameTwoMammalsFunction in Parent, MammalClass.java)");  // Show code is inherited from parent class
        System.out.print("Choose a name for the " + firstMammal + ": "); // Get user input
        nameMammalOne = mammalName.next();  // Make user input the age variable

        System.out.print("Choose a name for the " + secondMammal + ": "); // Get user input
        nameMammalTwo = mammalName.next();  // Make user input the age variable

        // Display mammals with mammal names
        System.out.print("The Two Mammals Are: ");
        System.out.print(nameMammalOne + " the " + mammalOne + " and ");
        System.out.print(nameMammalTwo + " the " + mammalTwo + ".\n");

    }

    public void listInheritedMammals() {
        MammalParentClass mammals = new MammalParentClass();
        System.out.println("\n(Accessed listInheritedMammals function of Parent, MammalClass.Java)");
        System.out.println("Two mammals inhereted from Parent: " + mammals.mammalOne + " and " + mammals.mammalTwo);

    }
}

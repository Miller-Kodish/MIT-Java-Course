package com.mit.trainingDayOne;

public class AbstractionExample {
    // Abstract means hiding
    // Abstraction is showing only the things you need to show

    private final String welcomeMessage = "Hello, World!";    // First Example

    public static void main(String[] args) {
        System.out.println("\nFirst Example:");
        AbstractionExample absExample = new AbstractionExample();
        System.out.println("From AbstractionExampleOne Class: " + absExample.welcomeMessage);  // Prints "Hello, World!"

        EncapsulationExample encExample = new EncapsulationExample();   // Instantiation of EncapsulationExample class (friendly)
        System.out.println("From EncapsulationExample Class: " + encExample.welcomeMessage);  // Prints welcomeMessage variable from instantiation (Hello, World!), because it is public (friend classes work within package)

        System.out.println("\nSecond Example: ");
        System.out.println("Welcome Message WITHOUT Using setWelcomeMessage: " + absExample.welcomeMessage);    // Prints "Hello, World!"
        System.out.println("Welcome Message Using setWelcomeMessage: " + absExample.setWelcomeMessage());   // Prints the return statement ("Hi!!")
        System.out.println("Welcome Message AFTER Using setWelcomeMessage: " + absExample.welcomeMessage);  // Still prints "Hello, World!", nothing has changed


    }

    private String setWelcomeMessage() {    // Second Example, sets a new welcomeMessage when called
        String welcomeMessage = "Hi!!";
        return welcomeMessage;
    }
}

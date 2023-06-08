package com.mit.trainingDayOne;

public class EncapsulationExample {
    // Any variable here is a member variable of the class
    String welcomeMessage = "Hello, World!";
    public static void main(String[] args) {
        EncapsulationExample encExample = new EncapsulationExample();   // Instantiation of EncapsulationExample class
        System.out.println(encExample.welcomeMessage);  // Prints welcomeMessage variable from instantiation (Hello, World!)

        encExample.welcomeMessage = "Hello Again!"; // Changes encExample welcomeMessage variable in memory, does not change the actual welcomeMessage variable
        System.out.println(encExample.welcomeMessage);  // Prints new welcomeMessage variable (Hello Again!)
    }
}

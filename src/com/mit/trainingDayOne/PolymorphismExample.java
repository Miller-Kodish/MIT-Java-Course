package com.mit.trainingDayOne;

public class PolymorphismExample {
    // Polymorphism --> Many forms

    // First Example Functions
    private int additionOfTwoNumbers(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber);
    }

    private int additionOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber + secondNumber + thirdNumber);
    }

    // Second Example Functions
    protected int addition(int firstNumber, int secondNumber) { // Protected means only child classes can inherent
        return (firstNumber + secondNumber);
    }

    public int addition(int firstNumber, int secondNumber, int thirdNumber) {
        System.out.println("Ran through This Function (In PolymorphismExample.java)."); // Used for InheritanceExample.java
        return (firstNumber + secondNumber + thirdNumber);
    }

    public String concat(String firstName, String lastName, String secondLastName){ // Used for InheritanceExample.java
        return(firstName + " " + lastName + "-" + secondLastName);
    }

    public static void main(String[] args) {
        PolymorphismExample polyExample = new PolymorphismExample();

        System.out.println("\nFirst Example:");
        System.out.println("Using Two Different Functions:");
        System.out.println("Addition of Two Numbers (5, and 10): " + polyExample.additionOfTwoNumbers(5, 10));
        System.out.println("Addition of Three Numbers (5, 10, and 30): " + polyExample.additionOfThreeNumbers(5, 10, 30));

        System.out.println("\nSecond Example:");    // Compile time polymorphism
        System.out.println("Using Two Versions of the Same Function:");
        System.out.println("Addition of Two Numbers (5, and 10): " + polyExample.addition(5, 10));
        System.out.println("Addition of Three Numbers (5, 10, and 30): " + polyExample.addition(5, 10, 30));

    }
}

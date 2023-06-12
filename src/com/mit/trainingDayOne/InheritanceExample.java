package com.mit.trainingDayOne;

public class InheritanceExample extends PolymorphismExample { // use extends to inherent from another class
    // Inheritance --> Getting something from a parent
    // this and super can only be accessed in non-static locations

    int exampleNumber = 10;

    public static void main(String[] args) {
        System.out.println("\nFirst Example:");
        InheritanceExample inhExample = new InheritanceExample();
        System.out.println("Added numbers equal: " + inhExample.addition(6, 3));   // Run time polymorphism

        System.out.println("\nSecond Example:");
        System.out.println("Added numbers equal: " + inhExample.addition(6, 3, 17));
        System.out.println("Added numbers equal: " + inhExample.additionWithSuper(6, 3, 17));

        System.out.println("\nThird Example:");
        System.out.println("Full Name: " + inhExample.concat("Joseph", "Gordon", "Levitt"));
    }

    public int addition(int firstNumber, int secondNumber, int thirdNumber) {
        System.out.println("this.exampleNumber: " + this.exampleNumber);
        System.out.println("Ran through This Function (In InheritanceExample.java).");
        return (firstNumber + secondNumber + thirdNumber);
    }

    public int additionWithSuper(int firstNumber, int secondNumber, int thirdNumber) {
        super.addition(firstNumber, secondNumber, thirdNumber);
        return (firstNumber + secondNumber + thirdNumber);
    }
}

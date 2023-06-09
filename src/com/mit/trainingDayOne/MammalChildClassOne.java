package com.mit.trainingDayOne;

public class MammalChildClassOne extends MammalParentClass { // Use extends to inherent from parent class MammalClass

    public static void main(String[] args) {
        String listOfMammals = "[blank]";

        MammalChildClassOne firstChild = new MammalChildClassOne();

        System.out.println();
        System.out.println("\n(Accessed First Child, ChildClassOne.java)");

        System.out.println("Before using addTwoMammals function, list of mammals is: " + listOfMammals);
        listOfMammals = firstChild.addTwoMammals(firstChild.mammalOne, firstChild.mammalTwo);
        System.out.println("After using addTwoMammals function, list of mammals is: " + listOfMammals);
    }
}

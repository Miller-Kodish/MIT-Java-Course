package com.mit.trainingDayOne;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MammalCallingClass {
    public static void main(String[] args) {
        MammalParentClass list = new MammalParentClass();
        CallOtter otter = new CallOtter();
        CallPlatypus platypus = new CallPlatypus();
        CallSloth sloth = new CallSloth();

        System.out.println();
        list.printList();   // Prints whole List of animals
        System.out.println("\nNicknames:");
        platypus.main();    // Prints Perry
        otter.main();       // Prints Otto
        sloth.main();       // Prints Sid
    }
}

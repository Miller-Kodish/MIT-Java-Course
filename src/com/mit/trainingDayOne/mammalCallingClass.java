package com.mit.trainingDayOne;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class mammalCallingClass {
    public static void main(String[] args) {
        mammalParentClass list = new mammalParentClass();
        callOtter otter = new callOtter();
        callPlatypus platypus = new callPlatypus();
        callSloth sloth = new callSloth();

        System.out.println();
        list.printList();   // Prints whole List of animals
        System.out.println("\nNicknames:");
        platypus.main();    // Prints Perry
        otter.main();       // Prints Otto
        sloth.main();       // Prints Sid
    }
}

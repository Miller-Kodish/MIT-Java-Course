package com.mit.trainingDayFour;

import java.util.Scanner;

public abstract class LandAnimalAbstract implements AnimalInterface {
    // Variables needed by each child class
    String name;
    String species;
    boolean isLandAnimal;


    protected String chooseAnimalName(int animalNum) {  // Gets user input for animal name
        String name = "[NAME " + animalNum + "])";
        Scanner animalName = new Scanner(System.in); // Import Scanner for user input
        System.out.print("\nEnter the Name You Want For the Animal: ");
        name = animalName.next();
        return (name);
    }

    protected String chooseAnimalSpecies(int animalNum, String name) { // Gets user input for animal species
        String species = ("[ANIMAL " + animalNum + "]");
        Scanner animalName = new Scanner(System.in); // Import Scanner for user input
        System.out.print("\nEnter the Kind of Animal \"" + name + "\" is: ");
        species = animalName.next();
        return (species);
    }

    protected static boolean checkLandAnimal() {    // Gets user input for if a land animal or not
        boolean isYes;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n* Enter 'y' for yes or 'n' for no (default is 'n') *");
        System.out.print("Is this animal a land animal?: ");

        String input = scanner.nextLine().trim().toLowerCase();

        isYes = input.equals("y");  // Converts yes or no to true or false boolean
        scanner.close();
        return isYes;
    }

    @Override   // From interface, displays first animal
    public final void printAnimalOne(String animalName, String animalType) {
        System.out.println("\nAnimal 1: \"" + animalName + " the " + animalType + "\"");
    }

    @Override   // From interface, displays second animal
    public final void printAnimalTwo(String animalName, String animalType) {
        System.out.println("\nAnimal 2: \"" + animalName + " the " + animalType + "\"");
    }

    @Override   // From interface, displays if a land animal or not based on user input
    public final void printLandAnimal(boolean isLandAnimal) {
        if (isLandAnimal) {
            System.out.println("\n---------- THIS ANIMAL IS A LAND ANIMAL ----------");
        } else {
            System.out.println("\n---------- THIS ANIMAL IS NOT A LAND ANIMAL ----------");
        }
    }

    public static void main(String[] args) {
        System.out.println("(LandAnimalAbstract.java Main Function)");
    }
}

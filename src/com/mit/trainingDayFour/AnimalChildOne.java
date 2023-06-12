package com.mit.trainingDayFour;

import java.util.Scanner;

public class AnimalChildOne extends LandAnimalAbstract implements AnimalInterface {
    // Inherits from LandAnimalAbstract, uses AnimalInterface interface
    public static void main(String[] args) {
        AnimalChildOne animalOne = new AnimalChildOne();    // Create object for manipulation

        animalOne.name = animalOne.chooseAnimalName(1);  // Get name of animal
        animalOne.species = animalOne.chooseAnimalSpecies(1, animalOne.name); // Get type of animal

        animalOne.isLandAnimal = animalOne.checkLandAnimal();   // Check if a land animal

        // Display Results (name, animal type, and if it's a land animal or not)
        animalOne.printAnimalOne(animalOne.name, animalOne.species);
        animalOne.printLandAnimal(animalOne.isLandAnimal);
    }

}

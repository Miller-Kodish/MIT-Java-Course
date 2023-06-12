package com.mit.trainingDayFour;
import java.util.Scanner;

public class AnimalChildTwo extends LandAnimalAbstract implements AnimalInterface{
    // Inherits from LandAnimalAbstract, uses AnimalInterface interface

    public static void main(String[] args) {
        AnimalChildTwo animalTwo = new AnimalChildTwo();    // Create object for manipulation

        animalTwo.name = animalTwo.chooseAnimalName(2);  // Get animal name
        animalTwo.species = animalTwo.chooseAnimalSpecies(2,animalTwo.name);  // Get animal type

        animalTwo.isLandAnimal = animalTwo.checkLandAnimal();   // Check if a land animal

        // Display Results (name, animal type, and if it's a land animal or not)
        animalTwo.printAnimalTwo(animalTwo.name, animalTwo.species);
        animalTwo.printLandAnimal(animalTwo.isLandAnimal);
    }
}

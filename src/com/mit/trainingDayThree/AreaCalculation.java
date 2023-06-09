package com.mit.trainingDayThree;

import java.util.Scanner;

public class AreaCalculation {
    int length;
    int width;
    int radius;
    float area = 0;
    float pi = 3.14f;


    // I decided to use one Constructor because Java cannot have two constructors with the same number of parameters
    // (i.e. rectangle having 2 (length and width), and circle having 2 (radius and pi))
    public AreaCalculation(int length, int width, int radius) {  // Constructor for variables
        super();
        this.length = length;
        this.width = width;
        this.radius = radius;
        this.area = area;
    }

    // Methods to calculate area
    protected float calcAreaCircle(int radius, float pi) {   // Calculate area of circle
        area = this.radius * this.radius * this.pi;
        return area;
    }

    protected float calcAreaSquare(int length) {   // Calculate area of square
        area = this.length * this.length;
        return area;
    }

    protected float calcAreaRectangle(int length, int width) {   // Calculate area of rectangle
        area = this.width * this.length;
        return area;
    }


    public static void main(String[] args) {
        float areaRectangle;
        float areaSquare;
        float areaCircle;

        // Set size values, initialize to zero in case of errors
        int length = 0;
        int width = 0;
        int radius = 0;

        Scanner myObj = new Scanner(System.in); // Import Scanner for user input

        // Get user input
        System.out.println("\n* Enter in values for length, width, and radius. If not wanted, type in 0. *" +
                "\n* If negative, shape area will NOT display. *");

        System.out.print("\nEnter value for length (used for square and rectangle): "); // Get user input
        length = myObj.nextInt();   // Set input to variable

        System.out.print("Enter value for width (used for rectangle): "); // Get user input
        width = myObj.nextInt();   // Set input to variable

        System.out.print("Enter value for length (used for circle): "); // Get user input
        radius = myObj.nextInt();   // Set input to variable


        AreaCalculation calcArea = new AreaCalculation(length, width, radius); // Create instance with values


        // Calculate areas of Circle, Square (based on length), and rectangle
        areaSquare = calcArea.calcAreaSquare(calcArea.length);
        areaRectangle = calcArea.calcAreaRectangle(calcArea.length, calcArea.width);
        areaCircle = calcArea.calcAreaCircle(calcArea.radius, calcArea.pi);

        if ((areaSquare > 0) || (areaRectangle > 0) || (areaCircle > 0)) {
            System.out.println("\n----------------------- Areas -----------------------");
            // Display results

            if (areaSquare > 0) {
                System.out.println("Area of the square is: " + areaSquare + " units.");
            }
            if (areaRectangle > 0) {
                System.out.println("Area of the rectangle is: " + areaRectangle + " units.");
            }
            if (areaCircle > 0) {
                System.out.println("Area of the circle is: " + areaCircle + " units.");
            }

        } else{
            System.out.println("\nNO AREAS TO DISPLAY.");
        }
    }

}

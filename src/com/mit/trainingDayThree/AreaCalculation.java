package com.mit.trainingDayThree;

import java.util.Scanner;

public class AreaCalculation {
    int length;
    int width;
    int radius;
    float areaCircle = 0;
    float areaRectangle = 0;
    float areaSquare = 0;
    float pi = 3.14f;


    // Overloaded constructors
    public AreaCalculation(int length) { // Constructor for a square
        super();
        this.length = length;
    }

    public AreaCalculation(int length, int width) {  // Constructor for a square, and a rectangle
        super();
        this.length = length;
        this.width = width;
    }

    public AreaCalculation(int length, int width, int radius) {  // Constructor for a square, a rectangle, and a circle
        super();
        this.length = length;
        this.width = width;
        this.radius = radius;
    }

    public static void main(String[] args) {

        // Variables
        float areaRectangle = 0;
        float areaSquare = 0;
        float areaCircle = 0;

        String yesOrNo = "n";

        // Set checking variables
        boolean wantSquare = false;
        boolean wantRectangle = false;
        boolean wantCircle = false;

        // Set size values, initialize to zero in case of errors
        int length = 0;
        int width = 0;
        int radius = 0;

        AreaCalculation areasCalc = new AreaCalculation(length, width, radius); // Create object with values

        Scanner myObj = new Scanner(System.in); // Import Scanner for user input


        // Get user input
        System.out.println("\n* Which shape's areas do you want, enter \"y\" to show its area, and \"n\" (or anything else) to not. *");

        System.out.print("\nWant to calculate the area of a square?: "); // Determine if they want a square
        yesOrNo = myObj.next();
        if (yesOrNo.equals("y")) {
            wantSquare = true;
            yesOrNo = "n";
        }


        System.out.print("Want to calculate the area of a rectangle?: "); // Determine if they want a rectangle
        yesOrNo = myObj.next();
        if (yesOrNo.equals("y")) {
            wantRectangle = true;
            yesOrNo = "n";
        }

        System.out.print("Want to calculate the area of a circle?: "); // Determine if they want a circle
        yesOrNo = myObj.next();
        if (yesOrNo.equals("y")) {
            wantCircle = true;
            yesOrNo = "n";
        }

        System.out.println("\n\n* Enter in values for length, width, and radius (as needed).*" + "\n* If negative value entered, shape area will NOT display. *");

        if ((wantSquare) || (wantRectangle)) {  // If user wants either a square or rectangle, length is needed
            System.out.print("Enter value for length (used for square and/or rectangle): "); // Get user input
            length = myObj.nextInt();   // Set input to variable
        }
        if (wantRectangle) {    // If user wants a rectangle, width is needed
            System.out.print("Enter value for width (used for rectangle): "); // Get user input
            width = myObj.nextInt();   // Set input to variable
        }
        if (wantCircle) {   // If user wants a circle, radius is needed
            System.out.print("Enter value for length (used for circle): "); // Get user input
            radius = myObj.nextInt();   // Set input to variable
        }


        // Calculate areas of Circle, Square (based on length), and rectangle (as needed)
        if (wantSquare) {
            areaSquare = areasCalc.calcArea(areasCalc.length);
        }
        if (wantRectangle) {
            areaRectangle = areasCalc.calcArea(areasCalc.length, areasCalc.width);
        }
        if (wantCircle) {
            areaCircle = areasCalc.calcArea(areasCalc.radius, areasCalc.pi, 1);
        }

        if ((areaSquare > 0) || (areaRectangle > 0) || (areaCircle > 0)) {  // If user chose any options, display areas
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

        } else {
            System.out.println("\nNO AREAS TO DISPLAY.");   // Print message if user chose none of the options
        }
    }

    // Methods to calculate area
    protected float calcArea(int length) {   // Calculate area of square
        areaSquare = this.length * this.length;
        return areaSquare;
    }

    protected float calcArea(int length, int width) {   // Calculate area of rectangle
        areaRectangle = this.width * this.length;
        return areaRectangle;
    }

    protected float calcArea(int radius, float pi, int isCircle) {   // Calculate area of circle
        areaCircle = this.radius * this.radius * this.pi;
        return areaCircle;
    }

}

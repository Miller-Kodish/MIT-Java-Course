package com.mit.trainingDayThree;

public class AreaCalculation {
    int length;
    int width;
    int radius;
    float area = 0;
    float pi = 3.14f;


    // I decided to use one Constructor because Java cannot have two constructors with the same number of parameters
    // (i.e. rectangle having 2 (length and width), and circle having 2 (radius and pi))
    public AreaCalculation(int length, int width, int radius){  // Constructor for variables
        super();
        this.length = length;
        this.width = width;
        this.radius = radius;
        this.area = area;
    }

    // Methods to calculate area
    protected float calcAreaCircle(int radius, float pi){   // Calculate area of circle
        area = this.radius * this.radius * this.pi;
        return area;
    }

    protected float calcAreaSquare(int length){   // Calculate area of square
        area = this.length * this.length;
        return area;
    }

    protected float calcAreaRectangle(int length, int width){   // Calculate area of rectangle
        area = this.width * this.length;
        return area;
    }



    public static void main(String[] args) {
        float areaRectangle;
        float areaSquare;
        float areaCircle;

        AreaCalculation calcArea = new AreaCalculation(7,5, 5); // Create instance with values

        // Calculate areas of Circle, Square (based on length), and rectangle
        areaCircle = calcArea.calcAreaCircle(calcArea.radius, calcArea.pi);
        areaSquare = calcArea.calcAreaSquare(calcArea.length);
        areaRectangle = calcArea.calcAreaRectangle(calcArea.length, calcArea.width);

        // Display results
        System.out.println("Area of the circle is: " + areaCircle + " units.");
        System.out.println("Area of the square is: " + areaSquare + " units.");
        System.out.println("Area of the circle is: " + areaRectangle + " units.");

    }
}

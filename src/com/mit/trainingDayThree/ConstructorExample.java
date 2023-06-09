package com.mit.trainingDayThree;

// Used to find volume of an object in this case
public class ConstructorExample {
    int length;
    int width;
    int height;
    int radius;
    float pi = 3.14f;


    public ConstructorExample(int length, int width, int height){  // Used to find volume of a box
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public ConstructorExample(int length){   // Used to find volume of a cube
        super();
        this.length = length;
    }

    public ConstructorExample(int height, int radius, float pi){   // Used to find volume of a cylinder
        super();
        this.height = height;
        this.radius = radius;
        this.pi = pi;
    }

    public ConstructorExample(int radius, float pi){   // Used to find volume of a sphere
        super();
        this.radius = radius;
        this.pi = pi;
    }

    public static void main(String[] args) {
        ConstructorExample constExample = new ConstructorExample(3,5,6); // This is a default constructor
        System.out.println("Volume = " + (constExample.length * constExample.height * constExample.width));
    }
}

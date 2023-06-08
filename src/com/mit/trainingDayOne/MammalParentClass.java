package com.mit.trainingDayOne;

public class MammalParentClass {
    String mammalPlatypus = "Platypus";
    String mammalOtter = "Otter";
    String mammalSloth = "Sloth";

    protected static void printList() {
        MammalParentClass mammals = new MammalParentClass();
        System.out.println("Original list of mammals: " + mammals.mammalPlatypus + ", " + mammals.mammalOtter + ", " + mammals.mammalSloth + ".");
    }

    public static void main(String[] args) {
        MammalParentClass mammalList = new MammalParentClass();
        System.out.println(mammalList.mammalPlatypus + " " + mammalList.mammalOtter + " " + mammalList.mammalSloth + ".");
    }
}

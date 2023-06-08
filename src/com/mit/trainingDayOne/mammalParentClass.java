package com.mit.trainingDayOne;

public class mammalParentClass {
    String mammalPlatypus = "Platypus";
    String mammalOtter = "Otter";
    String mammalSloth = "Sloth";

    protected static void printList() {
        mammalParentClass mammals = new mammalParentClass();
        System.out.println("Original list of mammals: " + mammals.mammalPlatypus + ", " + mammals.mammalOtter + ", " + mammals.mammalSloth + ".");
    }

    public static void main(String[] args) {
        mammalParentClass mammalList = new mammalParentClass();
        System.out.println(mammalList.mammalPlatypus + " " + mammalList.mammalOtter + " " + mammalList.mammalSloth + ".");
    }
}

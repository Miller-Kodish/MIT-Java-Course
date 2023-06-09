package com.mit.trainingDayOne;

public class MammalChildClassTwo extends MammalParentClass { // Use extends to inherent from parent class MammalClass
    public static void main(String[] args) {
        MammalChildClassOne secondChild = new MammalChildClassOne();


        System.out.println("\n(Accessed First Child, ChildClassOne.java)");

        secondChild.nameTwoMammals(secondChild.mammalOne, secondChild.mammalTwo);

        secondChild.listInheritedMammals();


    }
}

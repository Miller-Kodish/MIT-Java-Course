package com.mit.trainingDayTwo;

public class DoWhileExample {
    public static void main(String[] args) {
        int i = 0;

        do {    // Starts at 0, goes until 1 fewer than the while condition
            System.out.println("The value of i is " + i + ".");
            i++;    // Increment by 1 to not run forever
        } while (i < 2);
    }
}

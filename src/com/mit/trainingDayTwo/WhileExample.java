package com.mit.trainingDayTwo;

public class WhileExample {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10) { // Starts at 0, goes to 9
            System.out.println("Count is " + count + ", which is less than 10.");
            count++;    // Without this statement, it will run forever
        }
    }
}

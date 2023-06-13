package com.mit.trainingDayFive;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Vector is slower than ArrayList
        // Vector functions a lot like ArrayList, but is synchronized (thread-safe)
        // Thread-safe means that it can be used by multiple threads at the same time
        // A thread is a single sequence of instructions that can be executed independently of other code

        Vector<String> vecDaysOfWeek = new Vector<String>();   // Initialize a Vector

        vecDaysOfWeek.add("Sunday");    // Index 0
        vecDaysOfWeek.add("Monday");    // Index 1
        vecDaysOfWeek.add("Wednesday"); // Index 2
        vecDaysOfWeek.add("Thursday");  // Index 3
        vecDaysOfWeek.add("Friday");    // Index 4
        vecDaysOfWeek.add("Saturday");  // Index 5

        System.out.println("\nBefore inserting Tuesday at index 2 (Vector)");
        for (int i = 0; i < vecDaysOfWeek.size() - 1; i++) {
            System.out.print(vecDaysOfWeek.get(i) + ", ");
        }
        System.out.println(vecDaysOfWeek.get(vecDaysOfWeek.size() - 1));

        vecDaysOfWeek.add(2, "Tuesday");    // Inserting an element at a specific index (shifts everything rightwards)

        System.out.println("\nAfter inserting Tuesday at index 2 (Vector)");
        for (int i = 0; i < vecDaysOfWeek.size() - 1; i++) {
            System.out.print(vecDaysOfWeek.get(i) + ", ");
        }
        System.out.println(vecDaysOfWeek.get(vecDaysOfWeek.size() - 1));

    }
}

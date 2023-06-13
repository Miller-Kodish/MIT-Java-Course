package com.mit.trainingDayFive;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList is faster than Vector
        // ArrayList is like a Vector, but is not synchronized (not thread-safe)
        // Thread-safe means that it can be used by multiple threads at the same time
        // A thread is a single sequence of instructions that can be executed independently of other code

        int i;
        ArrayList<String> arrDaysOfWeek = new ArrayList<String>();  // List is an interface, ArrayList is a class

        arrDaysOfWeek.add("Sunday");    // Index 0
        arrDaysOfWeek.add("Monday");    // Index 1
        arrDaysOfWeek.add("Wednesday"); // Index 2
        arrDaysOfWeek.add("Thursday");  // Index 3
        arrDaysOfWeek.add("Friday");    // Index 4
        arrDaysOfWeek.add("Saturday");  // Index 5
        arrDaysOfWeek.add("Saturday");  // Index 6 -> To Be Removed

        // To Remove the element at index 6
        arrDaysOfWeek.remove(6);    // Removes the element at the specified position in this list (shifts everything leftwards)

        System.out.println("\nBefore inserting Tuesday at index 2 (ArrayList)");
        for (i = 0; i < arrDaysOfWeek.size() - 1; i++) {
            System.out.print(arrDaysOfWeek.get(i) + ", ");
        }
        System.out.println(arrDaysOfWeek.get(i));

        arrDaysOfWeek.add(2, "Tuesday");    // Inserting an element at a specific index (shifts everything rightwards)

        System.out.println("\nAfter inserting Tuesday at index 2 (ArrayList)");
        for (i = 0; i < arrDaysOfWeek.size() - 1; i++) {
            System.out.print(arrDaysOfWeek.get(i) + ", ");
        }
        System.out.println(arrDaysOfWeek.get(i) + "\n");


        Iterator<String> it = arrDaysOfWeek.iterator(); // Returns an iterator over the elements in this list in proper sequence

        while(it.hasNext()){    // Returns true if the iteration has more elements
            System.out.println(it.next());  // Returns the next element in the iteration
        }

        // Null Pointer Check
        ArrayList<String> testNullPtr = null; // Returns an empty list (immutable)
        it = testNullPtr.iterator();

        while(it.hasNext()){    // Returns true if the iteration has more elements
            System.out.println(it.next());  // Returns the next element in the iteration
        }   // Throws an error because testNullPtr is null
    }
}

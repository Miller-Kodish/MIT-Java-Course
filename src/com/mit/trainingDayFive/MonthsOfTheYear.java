package com.mit.trainingDayFive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class MonthsOfTheYear {
    public static void main(String[] args) {
        MonthsOfTheYear months = new MonthsOfTheYear();

        // Call Each Data Structure Method
        System.out.println("\nMonths of the Year in Various Data Structures:");
        System.out.println("\n------------------------------------------------");
        months.monthsArray();
        System.out.println("\n------------------------------------------------");
        months.monthsArrayList();
        System.out.println("\n------------------------------------------------");
        months.monthsVector();
        System.out.println("\n------------------------------------------------");
        months.monthsHashMap();
        System.out.println("\n------------------------------------------------");
        months.monthsHashTable();
        System.out.println("\n------------------------------------------------");

    }

    // Create an Array, ArrayList, Vector, Hash Map, and Hash Tabe of the months of the year
    // Print out the months of the year in each data structure
    private void monthsArray() {
        // Array Data Structure of Months of the Year
        int i;
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        System.out.println("\nArray of Months:\n");
        for (i = 0; i < months.length; i++) {
            System.out.println("Month " + i + ": " + months[i]);
        }
    }

    private void monthsArrayList() {
        // Array List Data Structure of Months of the Year
        int i;
        ArrayList<String> months = new ArrayList<String>();
        months.add("January");
        months.add("February");
        months.add("Extra Month");  // Month to be deleted
        months.add("March");
        months.add("April");
        months.add("May");
        // Need to insert June into the 6th position
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        months.remove(2); // Remove the extra month
        months.add(5, "June"); // Insert June into the 6th position

        System.out.println("\nArrayList of Months:\n");
        for (i = 0; i < months.size(); i++) {
            System.out.println("Month " + i + ": " + months.get(i));
        }
    }

    private void monthsVector() {
        // Vector Data Structure of Months of the Year
        int i;
        Vector<String> months = new Vector<String>();
        months.add("January");
        months.add("February");
        months.add("Extra Month");  // Month to be deleted
        months.add("March");
        months.add("April");
        months.add("May");
        // Need to insert June into the 6th position
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        months.remove(2); // Remove the extra month
        months.add(5, "June"); // Insert June into the 6th position

        System.out.println("\nVector of Months:\n");
        for (i = 0; i < months.size(); i++) {
            System.out.println("Month " + i + ": " + months.get(i));
        }
    }

    private void monthsHashMap() {
        // Hash Map Data Structure of Months of the Year
        int i;
        HashMap<Integer, String> months = new HashMap<Integer, String>();
        months.put(1, "January");   // Index 1 (First Month)
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(null, "DELETE THIS MONTH"); // Month to be deleted (Hash Map allows null keys)
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December"); // Index 12 (Last Month)

        months.remove(null); // Remove the extra month
        months.put(6, "June"); // Insert June into the 6th position


        System.out.println("\nHash Map of Months:\n");
        for (i = 1; i <= months.size(); i++) {
            System.out.println("Month " + i + ": " + months.get(i));
        }
    }

    private void monthsHashTable() {
        // Hash Table Data Structure of Months of the Year
        int i;
        Hashtable<Integer, String> months = new Hashtable<Integer, String>();
        months.put(1, "January");   // Index 1 (First Month)
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "FIX THIS");  // Month to be overwritten
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December"); // Index 12 (Last Month)


        months.put(6, "June"); // Overwrite June into the 6th position

        System.out.println("\nHash Table of Months:\n");
        for (i = 1; i <= months.size(); i++) {
            System.out.println("Month " + i + ": " + months.get(i));
        }

    }
}



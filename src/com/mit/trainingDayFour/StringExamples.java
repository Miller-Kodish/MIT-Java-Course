package com.mit.trainingDayFour;

public class StringExamples {
    public static void main(String[] args) {
        // Multiple Ways of Declaring a String
        // Strings are ZERO INDEXED
        String str = "The Star Spangled Man with a Plan!";
        String strShortened = str.substring(4, 21); // Substring prints after the start character and before the end character
        String stringOne = "Captain";
        String stringTwo = "America";
        int shortenedLen = strShortened.length();   // Get length of a string

        System.out.println("\n" + stringOne + " " + stringTwo + " is the \"" + strShortened + "\".");
        System.out.print("\nLength of shortened string (from index 4 to 21) \"" + strShortened + "\": ");
        System.out.println(shortenedLen + " characters.");

        if (strShortened.contains("angle")){    // Check to see if it contains the contents within parenthesis
            System.out.println("\nThe string \"" + strShortened + "\" contains \"angle\".");
        }



    }
}

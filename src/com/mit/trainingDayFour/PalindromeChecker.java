package com.mit.trainingDayFour;

import java.util.Scanner;

public class PalindromeChecker {
    String originalString = "";
    String fixedString = "";
    String fixedStringReversed = "";
    boolean isPalindrome = false;

    public static void main(String[] args) {
        PalindromeChecker palindrome = new PalindromeChecker();
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a sentence to check for Palindromes (numbers count towards phrase): ");
        palindrome.originalString = userInput.nextLine();


        userInput.close();

        palindrome.fixedString = palindrome.fixString(palindrome.originalString);   // Filter string
        palindrome.fixedStringReversed = palindrome.reverseString(palindrome.fixedString);   // Reverse filtered string

        // Check if palindrome
        palindrome.isPalindrome = palindrome.checkPalindrome(palindrome.fixedString, palindrome.fixedStringReversed);

        if (palindrome.isPalindrome) {
            System.out.println("The phrase \"" + palindrome.originalString + "\" IS a Palindrome!");
        } else {
            System.out.println("The phrase \"" + palindrome.originalString + "\" IS NOT a Palindrome!");
        }


    }

    private String fixString(String original) {
        int stringLength = original.length();
        int i;
        char[] stringArray = new char[stringLength];
        int stringPos = 0;
        String shortString = "";


        for (i = 0; i < stringLength; i++) {
            if ((original.charAt(i) >= 'a') && (original.charAt(i) <= 'z')) {   // Check for lowercase range
                stringArray[stringPos++] = original.charAt(i);
            } else if ((original.charAt(i) >= 'A') && (original.charAt(i) <= 'Z')) {    // Check for uppercase range
                stringArray[stringPos++] = (char) (original.charAt(i) + 32);    // Fix character casing for comparison with reverse
            } else if ((original.charAt(i) >= '0') && (original.charAt(i) <= '9')) {    // Check for number range
                stringArray[stringPos++] = original.charAt(i);
            }
        }

        shortString = new String(stringArray, 0, stringPos);    // Build string from character array

        return (shortString);
    }

    private String reverseString(String originalString) {
        int stringLength = originalString.length();
        int i;
        char[] stringArray = new char[stringLength];
        String reverseString = "";

        for (i = 0; i < stringLength; i++) {
            stringArray[i] = originalString.charAt(stringLength - (i + 1));
        }

        reverseString = new String(stringArray);

        return (reverseString);

    }

    private boolean checkPalindrome(String forwards, String reverse) {
        return (forwards.equals(reverse));
    }
}

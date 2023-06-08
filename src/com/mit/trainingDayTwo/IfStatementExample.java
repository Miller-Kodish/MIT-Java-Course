package com.mit.trainingDayTwo;

public class IfStatementExample {

    public static void main(String[] args) {
        // Variable Declarations
        int count = 10;
        boolean isTodayThursday = true;
        boolean isTodayFriday = false;
        String ternaryOutput = " ";

        // Integer Based If Statements
        if (count < 20) {   // < means less than, > means greater than, == checks for equality (bc = means assignment)
            System.out.println("Small Number");
            count--;    // Postfix decrementation
        }

        if (count <= 9) {   // <= means less than or equal to
            System.out.println("Number is less than or equal to 10, it is " + count++ + ".");
            ++count;    // Prefix incrementation
        }

        if (count > 10 || count < 15) {   // || means or, && means and
            System.out.println("Number is less than 10 or less than 15, it is " + count + ".");
        }

        // Boolean Based If Statements
        if (isTodayThursday == true) {   // == checks for equality (bc = means assignment)
            System.out.println("Happy Thursday.");
        }

        if (!isTodayFriday) {    // ! means not
            System.out.println("Happy (not) Friday.");
        }

        // Ternary Operator

        ternaryOutput = count == 11 ? "1" : "0";    // Ternary If Condition
        System.out.println("Ternary Output = " + ternaryOutput);

    }
}

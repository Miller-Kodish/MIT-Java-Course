package com.mit.trainingDayFive;

public class ArrayExample {
    public static void main(String[] args) {
        int i;
        String[] daysOfWeek = new String[7];    // How to declare an array

        // How to initialize array elements
        daysOfWeek[0] = "Sunday";
        daysOfWeek[1] = "Monday";
        daysOfWeek[2] = "Tuesday";
        daysOfWeek[3] = "Wednesday";
        daysOfWeek[4] = "Thursday";
        daysOfWeek[5] = "Friday";
        daysOfWeek[6] = "Saturday";
//        daysOfWeek[7] = "This will throw an error";

        for (i = 0; i < daysOfWeek.length; i++) {
            System.out.println(daysOfWeek[i]);
        }

//        for(i = 0; i < 9; i ++){
//            System.out.println(daysOfWeek[i]);  // ArrayIndexOutOfBoundsException
//        }
    }
}

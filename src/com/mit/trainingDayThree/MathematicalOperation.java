package com.mit.trainingDayThree;

public class MathematicalOperation {
    private double divide(int diviser, int divident) {
        return diviser / divident;
    }

    private double divide(String diviser, String divident) {
        return (Integer.getInteger(diviser) / Integer.getInteger(divident));
    }

    public static void main(String[] args) throws ArithmeticException, NullPointerException{    // Must specify which exceptions it throws
        int diviserInteger = 21;
        int dividentInteger = 7;   // If 0, will throw an error

        String diviserString = "21";
        String dividentString = "Miller";

        try {
            MathematicalOperation mathOps = new MathematicalOperation();    // Instantiate a new object
            System.out.println("INTEGER: " + diviserInteger + " divided by " + dividentInteger + " equals: " + mathOps.divide(diviserInteger, dividentInteger));
            System.out.println("STRING: " + diviserString + " divided by " + dividentString + " equals: " + mathOps.divide(diviserString, dividentString));
        } catch (ArithmeticException errorArithmetic) {  // All exceptions are of class Exception
            System.out.println("Encountered Arithmetic Exception: " + errorArithmetic.getMessage()); // Prints "Encountered Arithmetic Exception: / by zero"
            throw(errorArithmetic);
        } catch (NullPointerException errorNullPointer) {  // All exceptions are of class Exception
            System.out.println("Encountered Null Pointer Exception: " + errorNullPointer.getMessage()); // Prints "Encountered Null Pointer Exception: null pointer error"
            errorNullPointer.printStackTrace(); // DO NOT USE THIS LINE IN ACTUAL CODING
            throw(errorNullPointer);
        } finally {
            diviserInteger = 0;
            dividentInteger = 0;
        }

    }
}

package com.mit.trainingDaySix;

import java.io.*;

public class PersonFile {
    String firstName = "Tony";
    String lastName = "Stark";

    String addressLineOne = "890 Fifth Avenue";
    String addressLineTwo;
    String city = "New York City";
    String state = "NY";
    String zipCode = "10021";

    public static void main(String[] args) {
        PersonFile person = new PersonFile();
        String personAddress;
        String fullAddress;


        if (person.addressLineTwo == null) {    // Build address string
            fullAddress = ("\t" + person.addressLineOne + ",\n\t" + person.city + ", " + person.state + ", " + person.zipCode);
        } else {
            fullAddress = ("\t" + person.addressLineOne + ",\n\t" + person.addressLineTwo + ",\n\t" + person.city + ", " + person.state + ", " + person.zipCode);
        }
        personAddress = (person.firstName + " " + person.lastName + "'s Address:\n" + fullAddress + "\n");


        try {   // Try to open file, if not create a file. Catch errors
            // Open or create file, and write the string to it
            File file = new File("C:\\Users\\mille\\IdeaProjects\\MIT-Java-Course\\src\\com\\mit\\trainingDaySix\\data-files\\" + person.firstName + "_" + person.lastName + "_Address.txt");   // Try to open address file
            if (!file.exists()) {   // If the file does not exist, try making the file
                try {
                    file.createNewFile();
                } catch (Exception fileExceptionTwo) {  // If unable to make the file...
                    file.getParentFile().mkdir();   // Create parent folder if it doesn't exist (only creates directory)
                }
            }

            OutputStream outStream = new FileOutputStream(file, true);
            outStream.write(personAddress.getBytes());
            outStream.close();

        } catch (FileNotFoundException fileException) { // Look for File Not Found Error
            throw new RuntimeException(fileException);
        } catch (IOException ioException) { // Look for IO Error
            throw new RuntimeException(ioException);
        }

    }
}

package com.mit.trainingDaySix;

import java.io.*;
import java.util.Properties;

public class PropertiesFileExample {

    public static void main(String[] args) {
        try {   // Try to open file, if not create a file. Catch errors
            File file = new File("C:\\Users\\mille\\IdeaProjects\\MIT-Java-Course\\src\\com\\mit\\trainingDaySix\\data-files\\DC.properties");
            if (!file.exists()) {
                try {
                    System.out.println(file.createNewFile());
                } catch (Exception fileExceptionTwo) {
                    file.getParentFile().mkdir();   // Create parent folder if it doesn't exist (only creates directory)
                }
            }

            OutputStream output = new FileOutputStream(file);
            Properties prop = new Properties();

            System.out.println("\n------------------ Output Stream ------------------");
            // Add properties to file (key, value), properties are overwritten with each compilation here
            prop.setProperty("Justice League", "Batman, Superman, Aqua Man, Flash, Wonder Woman, Green Lantern");
            prop.setProperty("Legion of Doom", "Joker, Lex Luthor, Black Manta, Reverse Flash, Cheetah, Sinestro");
            prop.store(output, "Properties for DC Comics");   // Second argument is a comment

            // Access properties from file
            System.out.println("Justice League Roster: " + prop.getProperty("Justice League"));
            System.out.println("Legion of Doom Roster: " + prop.getProperty("Legion of Doom"));

            output.close(); // Close output stream

            System.out.println("\n\n------------------ Input Stream ------------------");
            // Read properties from file
            InputStream inputStream = new FileInputStream("C:\\Users\\mille\\IdeaProjects\\MIT-Java-Course\\src\\com\\mit\\trainingDaySix\\data-files\\Marvel.properties");
            prop.load(inputStream);    // Load properties from file

            // Access properties from file
            System.out.println("Avengers:\t\t" + prop.getProperty("Avengers"));
            System.out.println("Hydra Members:\t" + prop.getProperty("Hydra Members"));

            inputStream.close();    // Close input stream


        } catch (Exception fileExceptionOne) {
            fileExceptionOne.printStackTrace();
        }


    }
}

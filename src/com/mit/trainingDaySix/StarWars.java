package com.mit.trainingDaySix;

import java.io.*;
import java.util.Properties;

public class StarWars {
    public static void main(String[] args) {
        // Define file path for ease of use
        String filePath = "C:\\Users\\mille\\IdeaProjects\\MIT-Java-Course\\src\\com\\mit\\trainingDaySix\\data-files\\Star_Wars.properties";

        try {   // Try to open file, if not create a file. Catch errors
            File file = new File(filePath);
            if (!file.exists()) {
                try {
                    System.out.println(file.createNewFile());
                } catch (Exception fileExceptionTwo) {
                    file.getParentFile().mkdir();   // Create parent folder if it doesn't exist (only creates directory)
                }
            }

            System.out.println("\n----------------- Writing to Properties File -----------------");
            OutputStream outputStream = new FileOutputStream(file);
            Properties prop = new Properties();

            // Add Properties to file
            prop.setProperty("Jedi", "Luke Skywalker, Obi-Wan Kenobi, Yoda, Mace Windu, Qui-Gon Jinn, Anakin Skywalker");
            prop.setProperty("Sith", "Darth Vader, Darth Sidious, Darth Maul, Count Dooku, Darth Tyranus, Darth Plagueis");
            prop.setProperty("Bounty Hunter", "Boba Fett, Jango Fett, Cad Bane, Aurra Sing, Bossk, Zam Wesell");
            prop.setProperty("Smuggler", "Han Solo, Chewbacca, Lando Calrissian, Hondo Ohnaka, Tobias Beckett, Qi'ra");
            prop.store(outputStream, "Properties for Various Star Wars Classes");

            System.out.println("\t\t\t   (Property File Writing Complete.)");
            outputStream.close();   // Close output stream to close file associated with output stream

            System.out.println("\n----------------- Reading From Properties File -----------------");

            InputStream inputStream = new FileInputStream(filePath);

            // Load Properties from file
            System.out.println("Jedi:\t\t\t   " + prop.getProperty("Jedi"));
            System.out.println("Sith:\t\t\t   " + prop.getProperty("Sith"));
            System.out.println("Bounty Hunter:\t   " + prop.getProperty("Bounty Hunter"));
            System.out.println("Smuggler:\t\t   " + prop.getProperty("Smuggler"));

            inputStream.close();    // Close input stream to close file associated with input stream

        } catch (Exception fileExceptionOne) {
            fileExceptionOne.printStackTrace();
        }
    }
}
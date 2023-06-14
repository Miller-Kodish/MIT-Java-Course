package com.mit.trainingDaySix;

import java.io.*;

public class IOExamples {
    public static void main(String[] args) {
        try {   // Try to open and file, if not create a file. Catch errors
            System.out.println("\n-----------------\t\tWriter\t\t-----------------");

            File file = new File("C:\\Users\\mille\\IdeaProjects\\MIT-Java-Course\\src\\com\\mit\\trainingDaySix\\data-files\\test.txt");
            OutputStream outStream = new FileOutputStream(file/*, true*/);    // If append (second argument) is set as true, it will keep appending to the file (otherwise it will overwrite)

            outStream.write("Hello, World!\n".getBytes());    // Write to file (only writes in bytes)
            outStream.close();  // Close file

            Writer writer = new FileWriter("C:\\Users\\mille\\IdeaProjects\\MIT-Java-Course\\src\\com\\mit\\trainingDaySix\\data-files\\test2.txt");
            writer.write("Hello, World!!\n");   // Write to file (can write in strings) (overwrites file)
            writer.close(); // Close file


            System.out.println("\n-----------------\tInput Stream\t-----------------");

            InputStream inStream = new FileInputStream(file); // Open file
            int readLine = inStream.read(); // Read first character
            while (readLine != -1) {  // Read file until end of file (character at -1 position is end of file)
                System.out.print((char) readLine);   // Print contents of the file
                readLine = inStream.read();    // Read next character
            }
            inStream.close();   // Close file

            System.out.println("\n-----------------\t\tReader\t\t-----------------");
            Reader reader = new FileReader("C:\\Users\\mille\\IdeaProjects\\MIT-Java-Course\\src\\com\\mit\\trainingDaySix\\data-files\\test2.txt");
            int data = reader.read();   // Read first character
            while (data != -1) {    // Read file until end of file (character at -1 position is end of file)
                System.out.print((char) data);  // Print contents of the file
                data = reader.read();   // Read next character
            }

        } catch (FileNotFoundException fileNotFoundException) {    // Catch file not found error
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {    // Catch io error
            ioException.printStackTrace();
        }

    }
}

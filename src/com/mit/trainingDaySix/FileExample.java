package com.mit.trainingDaySix;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        // Java can create new files, not new folders using make file
        // Java can create new folders, not new files using make directory (mkdir)
        // mkdirs() can create both files and folders


        try {   // Try to open file, if not create a file. Catch errors
            File file = new File("C:\\Users\\mille\\IdeaProjects\\MIT-Java-Course\\src\\com\\mit\\trainingDaySix\\data-files\\test.txt");
            if (!file.exists()) {
                try {
                    System.out.println(file.createNewFile());
                } catch (Exception fileExceptionTwo){
                    file.getParentFile().mkdir();   // Create parent folder if it doesn't exist (only creates directory)
                }
            }
        } catch (Exception fileExceptionOne) {
            fileExceptionOne.printStackTrace();
        }
    }
}

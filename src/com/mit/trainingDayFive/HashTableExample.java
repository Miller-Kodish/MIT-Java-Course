package com.mit.trainingDayFive;
import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        // Hash Table is a type of Dictionary Class
        // Difference Between Hash Table and Hash Map -> Hash Map can hold null values for keys
        // Hash Tables can not
        
        Hashtable<String,String> studentNames = new Hashtable();   // Initialize a HashTable

        // Keys MUST be unique
        studentNames.put("1","Archie");   // Key is "1", Value is "Archie"
        studentNames.put("2","Jug Head");   // Key is "2", Value is "Jug Head"
        studentNames.put("3","Betty");   // Key is "3", Value is "Betty"
        studentNames.put("4","Veronica");   // Key is "4", Value is "Veronica"
        studentNames.put("5", "Sabrina"); // Key is "5", Value is "Sabrina" (Hash Table can not hold null values for keys)
    }
}

package com.mit.trainingDayFive;

import java.util.ArrayList;

public class StudentOperations {
    public static void main(String[] args) {
        Student student = new Student();
        ArrayList<Student> arrayStudents = new ArrayList<Student>();

        student.setAge(18);
        student.setClassName("Freshman");
        student.setFirstName("Peter");
        student.setLastName("Parker");
        student.setRollNumber(5);
        student.setSchoolName("Empire State University");
        arrayStudents.add(student); // Adds student to array


        student = new Student();    // Create new student, prevents overwriting previous student
        student.setAge(19);
        student.setClassName("Sophomore");
        student.setFirstName("Mary");
        student.setLastName("Jane");
        student.setRollNumber(6);
        student.setSchoolName("M.I.T");
        arrayStudents.add(student); // Adds student to array

        System.out.println("\n------------------------------------------");
        for (Student stud : arrayStudents) {
            System.out.println("First Name: " + stud.getFirstName());
            System.out.println("Last Name: " + stud.getLastName());
            System.out.println("Age: " + stud.getAge());
            System.out.println("Roll Number: " + stud.getRollNumber());
            System.out.println("Class: " + stud.getClassName());
            System.out.println("School: " + stud.getSchoolName());
            System.out.println("------------------------------------------");
        }

    }
}

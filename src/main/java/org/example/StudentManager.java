package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private Scanner scanner = new Scanner(System.in);
    private List<String> students = new ArrayList<>();

    String newline = System.lineSeparator();

    public void mainMenu() {
        System.out.println(newline + "Welcome to the student manager!");
        System.out.println("1. Add student");
        System.out.println("2. Remove student");
        System.out.println("3. View all students");
        System.out.println("4. Exit");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            addStudent();
        } else if (choice.equals("2")) {
            removeStudent();
        } else if (choice.equals("3")) {
            viewStudents();
        } else if (choice.equals("4")) {
            System.out.println(newline + "Goodbye!");
            scanner.close();
            System.exit(0);
        } else {
            System.out.println(newline + "Invalid choice. Please try again.");
            mainMenu();
        }
    }

    public void addStudent() {
        // Prompt the user to enter a new student name (using scanner and I/O methods learned previously,
        // refer to mainMenu() for an example)
        System.out.println(newline + "Please enter the student's name:");
        String name = scanner.nextLine();
        // Add the student to the list
        students.add(name);
        System.out.println(name + " has been added to the list of students.");
        mainMenu();
    }

    public void removeStudent() {
        // Prompt the user for a student name
        System.out.println(newline + "Please enter the name of the student you wish to remove: ");
        String name = scanner.nextLine();
        // Use the contains method to check if the student entered is in the list
        // If so, remove it, if not, print "Student not found."
        if (students.contains(name)) {
            // remove and give feedback
            students.remove(name);
            System.out.println(newline + name + " removed from list of students.");
        } else {
            // print not found message
            System.out.println("Student not found.");
        }
        mainMenu();
    }

    public void viewStudents() {
        // Loop through the list of students and print each one
        // (Use a for-each loop!)
        System.out.println(newline + "STUDENTS: ");
        for (String student : students) {
            System.out.println(student);
        }
        mainMenu();
    }
}

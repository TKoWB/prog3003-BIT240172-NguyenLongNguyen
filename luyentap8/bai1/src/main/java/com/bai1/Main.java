/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- STUDENT MANAGEMENT SYSTEM ---");
            System.out.println("1. Add New Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Delete Student by ID");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                choice = -1;
            }

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> displayStudents();
                case 3 -> searchByName();
                case 4 -> deleteById();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        studentList.add(new Student(id, name, gpa));
        System.out.println("Student added successfully!");
    }

    private static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("\n--- STUDENT LIST ---");
            studentList.forEach(System.out::println);
        }
    }

    private static void searchByName() {
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (Student s : studentList) {
            if (s.getName().toLowerCase().contains(searchName.toLowerCase())) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) System.out.println("No student found with name: " + searchName);
    }

    private static void deleteById() {
        System.out.print("Enter ID to delete: ");
        String idToDelete = scanner.nextLine();
        boolean removed = studentList.removeIf(s -> s.getId().equalsIgnoreCase(idToDelete));
        
        if (removed) {
            System.out.println("Student with ID " + idToDelete + " has been removed.");
        } else {
            System.out.println("Student ID not found.");
        }
    }
}
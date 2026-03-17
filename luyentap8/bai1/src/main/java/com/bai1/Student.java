/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bai1;

public class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %-20s | GPA: %.2f", id, name, gpa);
    }
}

package com.example.conceptTryOut.ComparatorComparable;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Getters and setters
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return rollNumber == student.rollNumber &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, name);
    }

    public static void main(String[] args) {
        // Create some Student objects
        Student student1 = new Student(101, "John");
        Student student2 = new Student(102, "Alice");
        Student student3 = new Student(101, "John"); // Duplicate with student1

        // Check equality
        System.out.println("student1.equals(student2): " + student1.equals(student2)); // false
        System.out.println("student1.equals(student3): " + student1.equals(student3)); // true

        // Check hash code
        System.out.println("Hash code of student1: " + student1.hashCode());
        System.out.println("Hash code of student2: " + student2.hashCode());
        System.out.println("Hash code of student3: " + student3.hashCode());

        // Create a HashSet and add Student objects
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3); // This should not be added due to duplicate

        // Print the contents of the HashSet
        System.out.println("\nContents of studentSet:");
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }


}

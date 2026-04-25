package service;

import java.util.Scanner;

public class StudentService {
    // Field (Polymorphism)
    private Interface.StudentOperations repository;

    // Constructor
    public StudentService() {
        this.repository = new repository.StudentRepository();
    }

    // Methods
    public void addStudent(int id, String name, int age, String course, double marks) {
        model.Student student = new model.Student(id, name, age, course, marks);
        repository.addStudent(student);
        System.out.println("Student added successfully.");
    }

    public void showAllStudents() {
        repository.viewStudents();
    }

    public void searchStudent(int id) {
        if(repository.searchStudent(id) != null){
            repository.searchStudent(id).display();
        }else {
            System.out.println("No Student found with ID:" + id);
        }
    }

    public void deleteStudent(int id) {
        if(repository.deleteStudent(id) == true){
            System.out.println("Successfully Student Deleted.");
        }else {
            System.out.println("Failed: Student not found with ID: " + id);
        }
    }

    public void updateStudent(int id, String name, int age, String course, double marks) {
        if(repository.updateStudent(id, name, age, course, marks) == true){
            System.out.println("Successfully Student updated.");
        }else {
            System.out.println("Failed to update Student. ID: " + id + " not found.");
        }
    }
}
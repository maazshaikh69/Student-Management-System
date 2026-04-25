package model;

public class Student extends model.Person{
    // Attributes
    private String course;
    private double marks;

    // Constructor
    public Student(int id, String name, int age, String course, double marks) {
        super(id, name, age);
        this.course = course;
        this.marks = marks;
    }

    // Getters
    public String getCourse() {return this.course;}
    public double getMarks() {return this.marks;}

    // Setters
    public void setCourse(String course) {this.course = course;}
    public void setMarks(double marks) {this.marks = marks;}

    // Override Method
    @Override
    public void display(){
        System.out.println("----Student Detail----");
        System.out.println("Student ID: " + id);
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Student Course: " + course);
        System.out.println("Student marks: " + marks);
    }
}

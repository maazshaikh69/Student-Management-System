package repository;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements Interface.StudentOperations {

    // Field
    private List<model.Student> students;

    // Constructor
    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    // Methods
    @Override
    public void addStudent(model.Student student) {
        if(student != null){
            students.add(student);
        }
    }

    @Override
    public void viewStudents() {
        if (students.isEmpty()){
            System.out.println("No students found.");
        }else {
            for (model.Student student: students){
                student.display();
            }
        }
    }

    @Override
    public model.Student searchStudent(int id) {
        if (students.isEmpty()){
            return null;
        }else {
            for (model.Student student : students){
                if(id == student.getId()){
                    return student;
                }
            }
        }
        return null;
    }

    @Override
    public boolean deleteStudent(int id) {
        model.Student studentToRemove = searchStudent(id);
        if(studentToRemove != null){
            return students.remove(studentToRemove);
        }
        return false;
    }

    @Override
    public boolean updateStudent(int id, String name, int age, String course, double marks) {
        model.Student student = searchStudent(id);
        if(student != null){
            student.setAge(age);
            student.setName(name);
            student.setMarks(marks);
            student.setCourse(course);
            return true;
        }
        return false;
    }
}

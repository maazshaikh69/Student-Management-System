package main;

import Validator.Validator;
import model.Student;
import repository.StudentRepository;
import service.StudentService;

import java.util.Scanner;

public class Main {

    private static StudentService service= new StudentService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            showMenu();
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    handleAdd(sc);
                    break;
                case 2:
                    service.showAllStudents();
                    break;
                case 3:
                    handleSearch(sc);
                    break;
                case 4:
                    handleDelete(sc);
                    break;
                case 5:
                    handleUpdate(sc);
                    break;
                case 0:
                    System.out.print("Exit.....");
                    break;
                default:
                    System.out.println("invalid input");
            }
        }while(choice != 0);
    }
    public static void showMenu() {
        System.out.println("----Main Menu----");
        System.out.print("1)Add\n2)View\n3)Search\n4)Delete\n5)Update\n0)Exit\nEnter choice: ");
    }

    public static void handleAdd(Scanner sc) {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the student name: ");
        String name = sc.nextLine();
        int age;
        do {
            System.out.print("Enter the Student age: ");
            age = sc.nextInt();
        }while (!(Validator.isValidAge(age)));

        sc.nextLine();
        System.out.print("Enter the Student course: ");
        String course = sc.nextLine();
        double marks;
        do {
            System.out.print("Enter the marks of Student: ");
            marks = sc.nextDouble();
        }while (!(Validator.isValidMarks(marks)));

        service.addStudent(id,name,age,course,marks);
    }

    public static void handleSearch(Scanner sc) {
        System.out.print("Enter Student ID: ");
        int searchID = sc.nextInt();
        service.searchStudent(searchID);
    }

    public static void handleDelete(Scanner sc) {
        System.out.print("Enter Student ID: ");
        int deleteID = sc.nextInt();
        service.deleteStudent(deleteID);
    }

    public static void handleUpdate(Scanner sc) {
        System.out.print("Enter Student ID: ");
        int updatedID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the student name: ");
        String updatedName = sc.nextLine();
        int updatedAge;
        do {
            System.out.print("Enter the Student age: ");
            updatedAge = sc.nextInt();
        }while (!(Validator.isValidAge(updatedAge)));
        sc.nextLine();
        System.out.print("Enter the Student course: ");
        String updatedCourse = sc.nextLine();
        double updatedMarks;
        do {
            System.out.print("Enter the marks of Student: ");
            updatedMarks = sc.nextDouble();
        }while (!(Validator.isValidMarks(updatedMarks)));

        service.updateStudent(updatedID,updatedName,updatedAge,updatedCourse,updatedMarks);
    }
}
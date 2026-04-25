package Validator;

public class Validator {

    public static boolean isValidAge(int age) {
        if(age >= 4 && age <= 80){
            return true;
        }
        return false;
    }

    public static boolean isValidMarks(double marks) {
        if(marks >= 0 && marks <= 100){
            return true;
        }
        return false;
    }
}
package Interface;

public interface StudentOperations {

    void addStudent(model.Student student);

    void viewStudents();

    model.Student searchStudent(int id);

    boolean deleteStudent(int id);

    boolean updateStudent(int id, String name, int age, String course, double marks);
}

package jdbc;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static DataSource ds = DbConnection.getMySQLDataSource();

    public static void main(String[] args) throws SQLException {
        while (true) {
            System.out.println("             ------------------Menu-------------------");
            System.out.println("             1. add student                     |");
            System.out.println("             2. update student                  |");
            System.out.println("             3. delete student                  |");
            System.out.println("             4. add teacher                     |");
            System.out.println("             5. update teacher                  |");
            System.out.println("             6. delete teacher                  |");
            System.out.println("             7. add students to teacher[id]     |");
            System.out.println("             8. show teacher[id] students       |");
            System.out.println("             9. Exit                            |");
            System.out.println("             Which option do you choose? :       ");

            int result = input.nextInt();
            if (result == 1) {
                addStudent();
            } else if (result == 2) {
                updateStudent();
            } else if (result == 3) {
                deleteStudent();
            } else if (result == 4) {
                addTeacher();
            } else if (result == 5) {
                updateTeacher();
            } else if (result == 6) {
                deleteTeacher();
            } else if (result == 7) {
                addStudentsToTeacher();
            } else if (result == 8) {
                showTeacherStudents();
            } else if (result == 9) {
                break;
            }
        }
    }

    private static void showTeacherStudents() throws SQLException {
        System.out.println("Enter teacher id: ");
        long id = input.nextInt();

        TeacherDb teacherDb = new TeacherDb(ds);
        teacherDb.reade(id);
    }

    private static void addStudentsToTeacher() throws SQLException {

        System.out.println("Enter teacher id you want to add students: ");
        long teacherID = input.nextLong();

        System.out.println("Enter number of students you want to add: ");
        int counter = input.nextInt();

        for (int i = 0; i < counter; i++) {
            System.out.println("Enter student id: ");
            long studentID = input.nextLong();
            TeacherStudentDb teacherStudentDb = new TeacherStudentDb(ds, studentID, teacherID);
            teacherStudentDb.add();
        }
    }

    private static void deleteTeacher() throws SQLException {
        System.out.println("Enter teacher id: ");
        long id = input.nextInt();

        TeacherDb teacherDb = new TeacherDb(ds);
        teacherDb.delete(id);
    }

    private static void updateTeacher() throws SQLException {
        TeacherDb teacherDb = takeTeacherInfo();
        teacherDb.update();
    }

    private static void addTeacher() throws SQLException {
        TeacherDb teacherDb = takeTeacherInfo();
        teacherDb.add();
    }

    private static void deleteStudent() throws SQLException {
        System.out.println("Enter Student id: ");
        long id = input.nextInt();

        StudentDb studentDb = new StudentDb(ds);
        studentDb.delete(id);
    }

    private static void updateStudent() throws SQLException {
        StudentDb studentDb = takeStudentInfo();
        studentDb.update();
    }

    private static void addStudent() throws SQLException {
        StudentDb studentDb = takeStudentInfo();
        studentDb.add();
    }

    private static StudentDb takeStudentInfo() {
        System.out.println("Enter Student id: ");
        long id = input.nextInt();

        System.out.println("Enter student first name: ");
        String firstName = input.next();

        System.out.println("Enter student last name: ");
        String lastName = input.next();

        return new StudentDb(ds, id, firstName, lastName);
    }

    private static TeacherDb takeTeacherInfo() {
        System.out.println("Enter teacher id: ");
        long id = input.nextInt();

        System.out.println("Enter teacher first name: ");
        String firstName = input.next();

        System.out.println("Enter teacher last name: ");
        String lastName = input.next();

        return new TeacherDb(ds, id, firstName, lastName);
    }
}

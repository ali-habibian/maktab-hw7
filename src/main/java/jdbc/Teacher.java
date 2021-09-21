package jdbc;

import java.util.ArrayList;

public class Teacher {
    private long id;
    private String firstName;
    private String lastName;
    private ArrayList<Student> students;

    public Teacher() {
    }

    public Teacher(long id, String firstName, String lastName, ArrayList<Student> students) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}

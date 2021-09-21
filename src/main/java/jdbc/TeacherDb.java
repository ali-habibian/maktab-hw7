package jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherDb extends Db {

    private long teacherID;
    private String firstName;
    private String lastName;

    private String addQuery = "INSERT INTO university.teachers (teacher_id, first_name, last_name) VALUES(?, ?, ?)";

    private String updateQuery = "UPDATE university.teachers SET first_name=?, last_name=? WHERE teacher_id=?";

    private String deleteQuery = "DELETE FROM university.teachers WHERE teacher_id=?";

    private String selectQuery = "SELECT s.first_name , s.last_name , s.student_id , ts.teacher_id " +
            "FROM university.teachers t " +
            "JOIN university.teachers_students ts " +
            "ON t.teacher_id = ts.teacher_id " +
            "JOIN university.students s " +
            "ON s.student_id = ts.student_id " +
            "WHERE t.teacher_id = ?";

    public TeacherDb(DataSource ds) {
        super(ds);
    }

    public TeacherDb(DataSource ds, long teacherID, String firstName, String lastName) {
        super(ds);
        this.teacherID = teacherID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void add() throws SQLException {
        Connection connection = ds.getConnection();

        PreparedStatement statement = connection.prepareStatement(addQuery);
        statement.setLong(1, teacherID);
        statement.setString(2, firstName);
        statement.setString(3, lastName);
        statement.execute();
    }

    @Override
    public void update() throws SQLException {
        Connection connection = ds.getConnection();

        PreparedStatement statement = connection.prepareStatement(updateQuery);
        statement.setString(1, firstName);
        statement.setString(2, lastName);
        statement.setLong(3, teacherID);
        statement.executeUpdate();
    }

    @Override
    public void delete(long id) throws SQLException {
        Connection connection = ds.getConnection();

        PreparedStatement statement = connection.prepareStatement(deleteQuery);
        statement.setLong(1, id);
        statement.executeUpdate();
    }

    @Override
    public void reade(long id) throws SQLException {
        Connection connection = ds.getConnection();

        PreparedStatement statement = connection.prepareStatement(selectQuery);
        statement.setLong(1, id);

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            long teacherID = resultSet.getLong("teacher_id");
            long studentID = resultSet.getLong("student_id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            Student student = new Student();

            student.setId(studentID);
            student.setFirstName(firstName);
            student.setLastName(lastName);

            System.out.println(student);
        }
    }
}

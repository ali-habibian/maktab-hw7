package jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDb extends Db {
    private long studentID;
    private String firstName;
    private String lastName;

    private String addQuery = "INSERT INTO university.students (student_id, first_name, last_name) VALUES(?, ?, ?)";
    private String updateQuery = "UPDATE university.students SET first_name=?, last_name=? WHERE student_id=?";
    private String deleteQuery = "DELETE FROM university.students WHERE student_id=?";

//    private String selectQuery = "SELECT student_id, first_name, last_name FROM university.students";

    public StudentDb(DataSource ds) {
        super(ds);
    }

    public StudentDb(DataSource ds, long studentID, String firstName, String lastName) {
        super(ds);
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void add() throws SQLException {
        Connection connection = ds.getConnection();

        PreparedStatement statement = connection.prepareStatement(addQuery);
        statement.setLong(1, studentID);
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
        statement.setLong(3, studentID);
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

    }
}

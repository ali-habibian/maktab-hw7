package jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TeacherStudentDb extends Db {

    private long studentID;
    private long teacherID;

    private String addQuery = "INSERT INTO university.teachers_students (teacher_id, student_id) VALUES(?, ?)";

    public TeacherStudentDb(DataSource ds) {
        super(ds);
    }

    public TeacherStudentDb(DataSource ds, long studentID, long teacherID) {
        super(ds);
        this.studentID = studentID;
        this.teacherID = teacherID;
    }

    @Override
    public void add() throws SQLException {
        Connection connection = ds.getConnection();

        PreparedStatement statement = connection.prepareStatement(addQuery);
        statement.setLong(1, teacherID);
        statement.setLong(2, studentID);
        statement.execute();
    }

    @Override
    public void update() throws SQLException {

    }

    @Override
    public void delete(long id) throws SQLException {

    }

    @Override
    public void reade(long id) throws SQLException {

    }
}

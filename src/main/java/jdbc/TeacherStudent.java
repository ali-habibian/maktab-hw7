package jdbc;

public class TeacherStudent {
    private long studentID;
    private long teacherID;

    public TeacherStudent() {
    }

    public TeacherStudent(long studentID, long teacherID) {
        this.studentID = studentID;
        this.teacherID = teacherID;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(long teacherID) {
        this.teacherID = teacherID;
    }
}

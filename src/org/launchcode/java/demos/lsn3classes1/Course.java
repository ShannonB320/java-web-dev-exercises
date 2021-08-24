package org.launchcode.java.demos.lsn3classes1;
import java.util.HashMap;

public class Course {
    private String courseName;
    private HashMap<String, Integer> attendingStudent = new HashMap<>();
    private int courseCredit;
    private String assignedTeacher;

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void setAttendingStudent(String name, int studentId) {
        this.attendingStudent.put(name, studentId);
    }

    public void setCourseCredit(int courseCredit){
        this.courseCredit = courseCredit;
    }

    public void setAssignedTeacher(String assignedTeacher) {
        this.assignedTeacher = assignedTeacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public HashMap<String, Integer> getAttendingStudent() {
        return attendingStudent;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public String getAssignedTeacher() {
        return assignedTeacher;
    }


}

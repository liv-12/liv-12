package tema1;

import java.util.ArrayList;

class Course {
    private String courseName;
    private Teacher teacher;
    private ArrayList<Student> enrolledStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<Student>();
    }

    // Method to assign a teacher
    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    // Method to add a student
    public void addStudent(Student student) {
        enrolledStudents.add (student);
    }

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

}
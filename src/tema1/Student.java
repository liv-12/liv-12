package tema1;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Student {
    private String name;
    private int id;
    private ArrayList<Course> enrolledCourses;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
}

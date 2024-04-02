package tema1;

public class MainSchool {
    public static void main(String[] args) {
        // Create a Teacher
        Teacher teacher = new Teacher("John Doe");

        // Create a Course and assign the teacher
        Course course = new Course("Java Programming");
        course.assignTeacher(teacher);

        // Create Students
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        // Enroll students in the course
        student1.enrollCourse(course);
        student2.enrollCourse(course);

        // Display course details
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Teacher: " + course.getTeacher().getName());
        System.out.println("Enrolled Students:");
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("- " + student.getName());
        }
    }
}
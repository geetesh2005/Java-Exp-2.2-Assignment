// Student.java
public class Student {
    private Course course;

    public Student(Course course) {
        this.course = course;
    }

    public void showDetails() {
        System.out.println("Enrolled in: " + course.getCourseName());
    }
}

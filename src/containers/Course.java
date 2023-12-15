package containers;

import java.util.Objects;
import java.util.Vector;

public class Course {
    CourseInfo courseInfo;
    private Vector<Student> registeredStudents;
    private Vector<Teacher> availableTeachers;
    private Vector<Lesson> lessons;
    {
        registeredStudents = new Vector<Student>();
        availableTeachers = new Vector<Teacher>();
        lessons = new Vector<Lesson>();
    }

    public Course(){}

    public Course(CourseInfo courseInfo) {
        this.courseInfo = courseInfo;
    }

    public Course(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    public Course(String courseCode, String courseName, int credits, Vector<Course> prerequisites) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }



}

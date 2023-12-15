package containers;

import java.util.Objects;
import java.util.Vector;

public class CourseInfo {
    private String courseCode;
    private String courseName;
    private int credits;
    private Vector<Course> prerequisites;
    {
        prerequisites = new Vector<Course>();
    }

    public CourseInfo() {}

    public CourseInfo(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    public CourseInfo(String courseCode, String courseName, int credits, Vector<Course> prerequisites) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseInfo courseInfo = (CourseInfo) o;
        return credits == course.credits && Objects.equals(courseCode, course.courseCode) && Objects.equals(courseName, course.courseName) && Objects.equals(prerequisites, course.prerequisites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseCode, courseName, credits, prerequisites);
    }

    /**
     * @param course A course that is going to be added to prerequisites
     */
    public void addPrerequisite(Course course){
        prerequisites.add(course);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Vector<Course> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(Vector<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }

}

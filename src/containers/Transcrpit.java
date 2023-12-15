package containers;

import java.util.*;

public class Transcrpit {
    private Semester semester;
    private int year;
    private double gpa;
    Map<Course, Mark> marks;

    {
        marks = new HashMap<Course, Mark>();
    }

    public Transcrpit() {}

    public Transcrpit(Semester semester, int year, double gpa, Map<Course, Mark> marks) {
        this.semester = semester;
        this.year = year;
        this.gpa = gpa;
        this.marks = marks;
    }

    public double calculateGpa(){ // TO DO
        return 4.0;
    }

    @Override
    public String toString() { // TO DO (view transcript)
        return "Transcrpit{" +
                "semester=" + semester +
                ", year=" + year +
                ", gpa=" + gpa +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transcrpit that = (Transcrpit) o;
        return year == that.year && Double.compare(gpa, that.gpa) == 0 && semester == that.semester && Objects.equals(marks, that.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(semester, year, gpa, marks);
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Map<Course, Mark> getMarks() {
        return marks;
    }

    public void setMarks(Map<Course, Mark> marks) {
        this.marks = marks;
    }
}

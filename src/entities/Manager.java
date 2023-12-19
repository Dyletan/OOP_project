package entities;

import containers.*;
import messages.Inbox;
import java.io.Serializable;

import java.util.Map;
import java.util.Vector;
import java.util.Comparator;

public abstract class Manager extends Employee implements Serializable{
	
	public Manager(String userId, Login login, String email, String name, String surname, Inbox inbox) {
        super(userId, login, email, name, surname, inbox);
    }
	
	public void viewStudentInfo(Student student) {
        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Surname: " + student.getSurname());
        System.out.println("Email: " + student.getEmail());

        System.out.println("\nCourses:");
        for (Map.Entry<Course, Mark> entry : student.getGradeBook().entrySet()) {
            Course course = entry.getKey();
            Mark mark = entry.getValue();
            System.out.println(course.getCourseCode() + " - " + course.getCourseName() + ": Grade - " + mark.getGrade());
        }

        System.out.println("\nTranscripts:");
        for (Transcript transcript : student.getTranscripts()) {
            System.out.println(transcript.toString());
        }
    }
    
	
    public void viewTeacherInfo(Teacher teacher) {
        System.out.println("Teacher Information:");
        System.out.println("Name: " + teacher.getName());
        System.out.println("Surname: " + teacher.getSurname());
        System.out.println("Email: " + teacher.getEmail());
        System.out.println("Title: " + teacher.getTitle());
        System.out.println("Ratings: " + teacher.getRatings());
        
        Schedule schedule = teacher.getSchedule();
        if (schedule != null) {
            System.out.println("Teacher's Schedule:");
            System.out.println(schedule);
        } 
    }
        
}

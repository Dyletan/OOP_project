package OOP.Entities;

import OOP.Data.DataBase;

import java.util.*;

public class Student extends User{
    private FacultyName faculty;
    private Vector<Organization> organizations;
    private Schedule schedule;
    private Vector<Courses> doneCourses;
    private Boolean isExpelled;
    private Map<Course, Mark> gradeBook;
    private Set<Transcript> transcripts;

    public Student() {
    }

    public Student(String userId, Login login, String email, String name, String surname, Vector<Notification> notifications, Vector<Journal> subscribedJournals, Faculty faculty, Vector<Organization> organizations, Schedule schedule, Vector<Courses> doneCourses, Boolean isExpelled, Map<Course, Mark> gradeBook, Set<Transcript> transcripts) {
        super(userId, login, email, name, surname, notifications, subscribedJournals);
        this.faculty = faculty;
        this.organizations = organizations;
        this.schedule = schedule;
        this.doneCourses = doneCourses;
        this.isExpelled = isExpelled;
        this.gradeBook = gradeBook;
        this.transcripts = transcripts;
    }

    public String viewTransript(Transcript transcript){
        return transcript.toString();
    }
    public String viewTeacherInfo(Teacher teacher){
        return teacher.toString();
    }
    public void joinStudentOrganization(Organization organizaiton){
        this.organizations = this.organizations.add(organizaiton);
    }
    public void rateTeacher(Teacher teacher, int rating){
        teacher.setRatings(teacher.getRatings().add(rating));
    }
    public void viewMarks(){
        System.out.println(gradeBook);
    }

    public void registerCourse(Course c){
        List<Course> availableCourses =  DataBase.getInstance().
                getFaculties().
                stream().
                filter(n -> n.name == faculty).
                getAvailableMajorElectives();
        if(availableCourses.contains(c)){
            c.registeredStudents.add(this);
            System.out.println("You are registered to "+ c.name + " course.");
        }else{
            System.out.println("This course is not meant to be in your schedule.");
        }
    }


    public Vector<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(Vector<Organization> organizations) {
        this.organizations = organizations;
    }

    public Set<Transcript> getTranscripts() {
        return transcripts;
    }

    public void setTranscripts(Set<Transcript> transcripts) {
        this.transcripts = transcripts;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Vector<Organization> getOrganization() {
        return organizations;
    }

    public void setOrganization(Vector<Organization> organizations) {
        this.organizations = organizations;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Vector<Courses> getDoneCourses() {
        return doneCourses;
    }

    public void setDoneCourses(Vector<Courses> doneCourses) {
        this.doneCourses = doneCourses;
    }

    public Boolean getExpelled() {
        return isExpelled;
    }

    public void setExpelled(Boolean expelled) {
        isExpelled = expelled;
    }

    public Map<Course, Mark> getGradeBook() {
        return gradeBook;
    }

    public void setGradeBook(Map<Course, Mark> gradeBook) {
        this.gradeBook = gradeBook;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(faculty, student.faculty) && Objects.equals(organization, student.organization) && Objects.equals(schedule, student.schedule) && Objects.equals(doneCourses, student.doneCourses) && Objects.equals(isExpelled, student.isExpelled) && Objects.equals(gradeBook, student.gradeBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), faculty, organization, schedule, doneCourses, isExpelled, gradeBook);
    }

    @Override
    public String toString() {
        return "Student{" +
                "faculty=" + faculty +
                ", organization=" + organization +
                ", schedule=" + schedule +
                ", doneCourses=" + doneCourses +
                ", isExpelled=" + isExpelled +
                ", gradeBook=" + gradeBook +
                '}';
    }
}

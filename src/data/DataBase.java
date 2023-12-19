package OOP.Data;
import OOP.Entities.*;

import java.io.*;
import java.util.*;

public class DataBase implements Serializable {
    private static DataBase instance;

    private Vector<Log> logs;
    private LinkedList<News> news;
    private HashMap<String, String> logins;
    private Vector<User> users;
    private Vector<Journal> jounrals;
    private HashMap<Researcher, ResearchData> dataOfResearchers;
    private Vector<Cabinet> cabinets;
    private HashMap<Teacher, Complaint> complaints;
    private Map<Course, Vector<Teacher>> teachersByCourse;
    private Set<Faculty> faculties;
    private Map<Course, Vector<Lesson>> courses;

    {
        logs = new Vector<Log>;
        news = new LinkedList<News>;
        logins = new HashMap<String, String>;
        users = new Vector<User>;
        jounrals = new Vector<Journal>;
        dataOfResearchers = new HashMap<Researcher, ResearchData>;
        cabinets = new Vector<Cabinet>;
        complaints = new HashMap<Teacher, Complaint>;
        teachersByCourse = new Map<Course, Vector<Teacher>>;
        faculties = new Set<Faculty>;
    }
    private DataBase(){};


    public static DataBase getInstance() {
        if(instance == null){
            instance = new DataBase();
        }
        return instance;
    }
    public static DataBase getInstance(Vector<Log> logs, LinkedList<News> news, HashMap<String, String> logins, Vector<User> users, Vector<Journal> jounrals, HashMap<Researcher, ResearchData> dataOfResearchers, Vector<Cabinet> cabinets, HashMap<Teacher, Complaint> complaints, Map<Course, Vector<Teacher>> teachersByCourse, Set<Faculty> faculties, Map<Course, Vector<Lesson>> courses){
        if(instance == null){
            instance = new DataBase(logs, news, logins, users, jounrals, dataOfResearchers,  cabinets,  complaints, teachersByCourse,  faculties,  lessons);
        }
        return instance;
    }

    public void sendLog(Log log){
        logs.add(log);
    }

    public Vector<Log> getLogs() {
        return logs;
    }

    public void setLogs(Vector<Log> logs) {
        this.logs = logs;
    }

    public LinkedList<News> getNews() {
        return news;
    }

    public void setNews(LinkedList<News> news) {
        this.news = news;
    }

    public HashMap<String, String> getLogins() {
        return logins;
    }

    public void setLogins(HashMap<String, String> logins) {
        this.logins = logins;
    }

    public Vector<User> getUsers() {
        return users;
    }

    public void setUsers(Vector<User> users) {
        this.users = users;
    }

    public Vector<Journal> getJounrals() {
        return jounrals;
    }

    public void setJounrals(Vector<Journal> jounrals) {
        this.jounrals = jounrals;
    }

    public HashMap<Researcher, ResearchData> getDataOfResearchers() {
        return dataOfResearchers;
    }

    public void setDataOfResearchers(HashMap<Researcher, ResearchData> dataOfResearchers) {
        this.dataOfResearchers = dataOfResearchers;
    }

    public Vector<Cabinet> getCabinets() {
        return cabinets;
    }

    public void setCabinets(Vector<Cabinet> cabinets) {
        this.cabinets = cabinets;
    }

    public HashMap<Teacher, Complaint> getComplaints() {
        return complaints;
    }

    public void setComplaints(HashMap<Teacher, Complaint> complaints) {
        this.complaints = complaints;
    }

    public Map<Course, Vector<Teacher>> getTeachersByCourse() {
        return teachersByCourse;
    }

    public void setTeachersByCourse(Map<Course, Vector<Teacher>> teachersByCourse) {
        this.teachersByCourse = teachersByCourse;
    }

    public Set<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(Set<Faculty> faculties) {
        this.faculties = faculties;
    }

    public Vector<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(Vector<Lesson> lessons) {
        this.lessons = lessons;
    }

    public void serialize(String filename) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(instance);
        }
    }

    public static DataBase deserialize(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (DataBase) in.readObject();
        }
    }
}

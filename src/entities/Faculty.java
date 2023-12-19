package entities;

import java.io.*;
public class Faculty  implements Serializable {
    private FacultyName name;
    private Vector<Course> mandatoryCourses;
    private Vector<Course> availableMajorElective;
    private Vector<Course> availableMinorElective;


    public Faculty (FacultyName name){
        this.name = name;
    }

    public FacultyName getName() {
        return name;
    }

    public void setName(FacultyName name) {
        this.name = name;
    }
}

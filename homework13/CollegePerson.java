package homework13;

import java.util.LinkedList;
import java.util.List;

public abstract class CollegePerson {
    protected String firstName;
    protected String lastName;
    protected String faculty = "";
    private List<String> courses = new LinkedList<>();

    public CollegePerson(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFaculty(){
        return this.faculty;
    }

    public void setFaculty(String faculty){
        this.faculty = faculty;
    }

    public void addCourse(String course){
        this.courses.add(course);
    }
}

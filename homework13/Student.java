package homework13;

import java.util.LinkedList;
import java.util.List;

public class Student extends CollegePerson{
    private List<String> courses = new LinkedList<>();
    private Teacher supervisor;

    public Student(String firstName, String lastName, String faculty, Teacher supervisor) {
        super(firstName, lastName);
        this.faculty = faculty;
        this.supervisor = supervisor;
    }
}

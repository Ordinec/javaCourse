package homework13;

import java.util.LinkedList;
import java.util.List;

public class Teacher extends CollegePerson{
    private List<Student> supervisedStudents = new LinkedList<>();

    public Teacher(String firstName, String lastName, String faculty) {
        super(firstName, lastName);
        this.faculty = faculty;
    }

    public void addSupervised(Student... students){
        this.supervisedStudents.addAll(List.of(students));
    }
}

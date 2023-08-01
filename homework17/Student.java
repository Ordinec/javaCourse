package homework17;

import homework13.Teacher;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String faculty = "";

    public Student(String firstName, String lastName, String faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}

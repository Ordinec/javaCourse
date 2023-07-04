package homework10;

import java.util.LinkedList;
import java.util.List;

public class Teacher {
    private String firstName;
    private String lastName;
    private int age;
    private List<Student> students = new LinkedList<>();

    public Teacher(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Teacher(String firstName, String lastName, int age, List<Student> students){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.students = students;
    }

    public String getFistName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setStudents(List<Student> students){
        this.students = students;
    }

    public void addStudents(Student... students){
        this.students.addAll(List.of(students));
    }
}

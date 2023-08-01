package homework17;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new StudentsList<>(10);
        List<Student> arraysList =  new ArrayList<>(2000000);
        for (int i = 0; i < 10; i++){
            studentList.add(new Student("John" + i, "Smith" + i*2, "Hogwarts"));
        }

        for(Student student : studentList){
            System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
        }
    }
}

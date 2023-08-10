package homework21;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        students.add(new Student("Ivan", 4.5));
        students.add(new Student("Oleh", 4.7));
        students.add(new Student("Oleskii", 3.1));
        students.add(new Student("Serhii", 4.0));
        students.add(new Student("Andrii", 5.0));
        students.add(new Student("Andrii", 3.0));

        Comparator<Student> lastNameComparator = (object1, object2) -> object1.getLastName()
                .compareTo(object2.getLastName());
        Comparator<Student> averageScoreComparator = Comparator.comparing(Student::getAverageScore);
        System.out.println(students);
        students.sort(lastNameComparator);
        System.out.println(students);
        students.sort(averageScoreComparator);
        System.out.println(students);
    }
}

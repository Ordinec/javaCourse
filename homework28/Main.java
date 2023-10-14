package homework28;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Serhii", "Moroz", "Group A", "test@test.com");
        Student student2 = new Student("Serhii", "Moroz", "Group B", "testtest.com");
        Student student3 = new Student("Serhii", "Moroz", "Group C", "test@testcom");

        Validator validator = new Validator();
        validator.validate(student);
        validator.validate(student2);
        validator.validate(student3);
    }
}

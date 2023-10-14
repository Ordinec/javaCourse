package homework28;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    @ValidateEmail
    public String email;

    public Student(String firstName, String lastName, String group){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String firstName, String lastName, String group, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.email = email;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getGroup(){
        return this.group;
    }

    @Override
    public String toString(){
        return "First Name: " + firstName + ", Last Name: " + lastName + ", Group: " + group;
    }

    @Override
    public boolean equals(Object obj){
        Student other = (Student) obj;
        return this.firstName.equals(other.firstName) &&
                this.lastName.equals(other.lastName) &&
                this.group == other.group;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * result + firstName.hashCode();
        result += 31 * result + lastName.hashCode();
        result += 31 * result + group.hashCode();
        return result;
    }
}

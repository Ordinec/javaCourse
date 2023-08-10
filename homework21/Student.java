package homework21;

import homework19.Translations;

public class Student {
    private String lastName;
    private String firstName;
    private double averageScore;

    public Student(String lastName, double averageScore){
        this.lastName = lastName;
        this.averageScore = averageScore;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFirstName(){
        return this.getFirstName();
    }

    public double getAverageScore(){
        return this.averageScore;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setAverageScore(long averageScore){
        this.averageScore = averageScore;
    }

    @Override
    public String toString(){
        return "Last Name: " + lastName + ", Average Score: " + averageScore;
    }

    @Override
    public boolean equals(Object obj){
        Student other = (Student) obj;
        return this.lastName.equals(other.lastName) &&
                this.averageScore == other.averageScore;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * result + lastName.hashCode();
        return result;
    }
}

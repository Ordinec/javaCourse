public class Main {
    public static void main(String[] args){
        int varA = 2;
        int varB = 1;
        System.out.println("Sum: " + (varA + varB));
        System.out.println("Subtraction: " + (varA - varB));
        System.out.println("Division: " + (varA / varB));
        System.out.println("Multiplication: " + (varA * varB));

        String value = "qwerrewq";
        StringBuilder sb =new StringBuilder(value);
        String valueReversed = sb.reverse().toString();
        System.out.println(value.equals(valueReversed));
    }
}

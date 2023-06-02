import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int varA = 2;
        int varB = 1;
        System.out.println("Sum: " + (varA + varB));
        System.out.println("Subtraction: " + (varA - varB));
        System.out.println("Division: " + (varA / varB));
        System.out.println("Multiplication: " + (varA * varB));

        System.out.println(isPolyndrom("qwerrewq"));
        System.out.println(checkOccurences("Try your skill", "your"));
    }

    private static boolean isPolyndrom(String value){
        StringBuilder sb = new StringBuilder(value);
        String valueReversed = sb.reverse().toString();
        return value.equals(valueReversed);
    }

    private static int checkOccurences(String phrase, String valueToSearch){
        String[] array = phrase.split(" ");
        return (int) Arrays.stream(array).filter(x -> x.equals(valueToSearch)).count();
    }
}

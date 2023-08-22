package homework24;

public class MainException {
    public static void main(String[] args) {
        System.out.println(getSquare(2));
        System.out.println(getSquare(11));
        System.out.println(getSquare(-11));
    }

    private static long getSquare(int number){
        if(number < 0){
            throw new NegativeInputException("Provided input is below 0: " + number);
        }
        return (long) number * number;
    }
}

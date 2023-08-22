package homework24;

import java.util.*;

public class MainConsole {
    public static void main(String[] args) {
        boolean exceptionFlag;
        int number = 0;
        do {
            try {
                number = new Scanner(System.in).nextInt();
                exceptionFlag = false;
            } catch (InputMismatchException e) {
                exceptionFlag = true;
                System.out.println("Wrong input provided instead of number");
            }
        } while (exceptionFlag);
        System.out.println(number);
    }
}

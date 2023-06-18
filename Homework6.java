public class Homework6 {

    public static void main(String[] args){
        printNumberFrom1To10();
        System.out.println("DELIMITER");
        showEvenFrom1to100();
        System.out.println("DELIMITER");
        System.out.println(factorial(7));
        System.out.println("DELIMITER");
        printFibonacciTo100();
    }

    private static void printNumberFrom1To10(){
        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }
    }

    private static void showEvenFrom1to100(){
        int index = 2;
        while(index < 101){

            System.out.println(index);
            index = index + 2;
        }
    }

    private static int factorial(int number){
        int result = 1;
        for(int i = 1; i <= number; i++){
            result *= i;
        }
        return result;
    }

    private static void printFibonacciTo100(){
        int firstNumber = 1;
        int secondNumber = 1;
        int currentNumber = 2;
        System.out.print(firstNumber + " ");
        System.out.print(secondNumber + " ");
        do {
            System.out.print(currentNumber + " ");
            currentNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = currentNumber;
        } while (currentNumber < 101);
    }
}

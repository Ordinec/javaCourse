public class Homework7 {

    public static void main(String[] args){
        System.out.println(cubeCalc(10));
        System.out.println("DELIMITER");
        excludeStar("dkfsdfnalfd*a*ad*fs*df*sad*a*df*asdf");
        System.out.println("DELIMITER");
        excludeSymbol("&", "ldfld&akdfhslkdjfh& Ljks;lldkjfs;& ;sdfksd;flk&");
        System.out.println("DELIMITER");
    }

    private static int cubeCalc(int number){
        return number*number*number;
    }

    private static void excludeStar(String input){
        int count = input.length() - input.replace("*", "").length();
        for(int i = 0; i < count; i++){
            System.out.print("* ");
        }
        System.out.println();
    }

    private static void excludeSymbol(String symbol, String input){
        int count = input.length() - input.replace(symbol, "").length();
        for(int i = 0; i < count; i++){
            System.out.print(symbol + " ");
        }
        System.out.println();
    }
}

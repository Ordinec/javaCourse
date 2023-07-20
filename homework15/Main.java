package homework15;

public class Main {
    public static void main(String[] args) {
        Pair pair1 = new Pair("asdaasd", 121323.3);
        Pair pair2 = new Pair(12, 0.12);
        Pair pair3 = new Pair('d', "123");
        System.out.println("First: " + pair1.getFirst() + "\nSecond: " + pair1.getSecond());
        System.out.println("_______________________________________________________________");
        System.out.println("First: " + pair2.getFirst() + "\nSecond: " + pair2.getSecond());
        System.out.println("_______________________________________________________________");
        System.out.println("First: " + pair3.getFirst() + "\nSecond: " + pair3.getSecond());
    }
}

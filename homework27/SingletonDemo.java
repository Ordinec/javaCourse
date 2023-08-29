package homework27;

public class SingletonDemo {
    private static SingletonDemo singleton = null;
    private String contents = "";

    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        if (SingletonDemo.singleton == null) {
            SingletonDemo.singleton = new SingletonDemo();
        }
        System.out.println("Singleton pattern demo");
        return SingletonDemo.singleton;
    }
}

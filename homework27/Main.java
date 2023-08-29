package homework27;

import homework27.factory.LuckFactory;
import homework27.factory.LuckType;
import homework27.proxy.TestObject;
import homework27.proxy.TestObjectProxy;

public class Main {
    public static void main(String[] args) {
        TestObject object = new TestObjectProxy();
        object.process();

        SingletonDemo.getInstance();

        LuckFactory factory = new LuckFactory();
        System.out.println(factory.getLuckGenerator(LuckType.DICE).generateNext());
    }
}

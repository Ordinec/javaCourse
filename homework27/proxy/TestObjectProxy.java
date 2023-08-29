package homework27.proxy;

public class TestObjectProxy implements TestObject{
    private static TestObject object;

    @Override
    public void process() {
        if (object == null) {
            object = new TestObjectImpl();
        }
        object.process();
    }
}

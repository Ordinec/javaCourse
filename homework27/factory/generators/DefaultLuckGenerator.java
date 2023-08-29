package homework27.factory.generators;

import homework27.factory.LuckGenerator;

public class DefaultLuckGenerator implements LuckGenerator {

    protected DefaultLuckGenerator(){}

    @Override
    public String getType() {
        return null;
    }

    @Override
    public int generateNext() {
        return 0;
    }
}

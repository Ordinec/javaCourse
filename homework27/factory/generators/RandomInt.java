package homework27.factory.generators;

import java.util.Random;

import static homework27.factory.LuckType.RANDOM_INT;

public class RandomInt extends DefaultLuckGenerator{
    @Override
    public String getType() {
        return RANDOM_INT.getType();
    }

    @Override
    public int generateNext(){
        Random random = new Random();
        return random.nextInt();
    }
}

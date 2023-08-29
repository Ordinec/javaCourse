package homework27.factory.generators;


import java.util.Random;

import static homework27.factory.LuckType.COIN;

public class Coin extends DefaultLuckGenerator {
    @Override
    public String getType() {
        return COIN.getType();
    }

    @Override
    public int generateNext() {
        return coinFlip();
    }

    private int coinFlip(){
        Random random = new Random();
        return random.nextInt(2);
    }
}

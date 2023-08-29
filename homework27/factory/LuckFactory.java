package homework27.factory;

import homework27.factory.generators.Coin;
import homework27.factory.generators.Dice;
import homework27.factory.generators.RandomInt;
import homework27.factory.generators.Weekday;

public class LuckFactory {
    public LuckGenerator getLuckGenerator(LuckType luckType) {
        return switch(luckType){
            case DICE -> new Dice();
            case COIN -> new Coin();
            case RANDOM_INT -> new RandomInt();
            case WEEKDAY -> new Weekday();
        };
    }

}

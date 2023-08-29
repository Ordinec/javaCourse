package homework27.factory.generators;

import java.util.Random;

import static homework27.factory.LuckType.DICE;

public class Dice extends homework27.factory.generators.DefaultLuckGenerator {
    private int numberOfSides = 6;

    @Override
    public String getType() {
        return DICE.getType();
    }

    @Override
    public int generateNext(){
        Random random = new Random();
        // +1 is used because result 0 is impossible
        return random.nextInt(numberOfSides) + 1;
    }

    public void setDiceSidesNumber(int newNumberOfSides){
        this.numberOfSides = newNumberOfSides;
    }
}

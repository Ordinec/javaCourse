package homework27.factory.generators;

import java.util.List;
import java.util.Random;

import static homework27.factory.LuckType.WEEKDAY;
import static java.util.Arrays.asList;

public class Weekday extends DefaultLuckGenerator{
    private final List<String> possibleValuesInString = asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
            "Saturday", "Sunday");
    private int currentValue = 0;

    @Override
    public String getType() {
        return WEEKDAY.getType();
    }

    @Override
    public int generateNext(){
        Random random = new Random();
        // +1 is used because result 0 is impossible
        currentValue = random.nextInt(7) + 1;
        return currentValue;
    }

    public String getStringValue(){
        if(currentValue == 0){
            generateNext();
        }
        // -1 is used because index 0 possible in List
        return possibleValuesInString.get(currentValue - 1);
    }
}

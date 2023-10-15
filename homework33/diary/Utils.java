package homework33.diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
    private static final String datePattern = "DD MMM YYYY HH:mm";

    public static String getCurrentTime(){
        DateTimeFormatter parsingPattern = DateTimeFormatter.ofPattern(datePattern);
        return parsingPattern.format(LocalDateTime.now());
    }
}

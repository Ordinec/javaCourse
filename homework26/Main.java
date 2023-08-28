package homework26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String pathToFile = "homework26/textFile.txt";
        writeToFile(pathToFile, "SomeText");
        System.out.println(readFromFile(pathToFile));
    }

    private static String readFromFile(String pathToFile) {
        Path path = Paths.get(pathToFile);
        StringBuilder result = new StringBuilder();
        try {
            Files.lines(path).forEach(result::append);
        } catch (IOException ex) {
            ex.printStackTrace();//handle exception here
        }
        return result.toString();
    }

    private static void writeToFile(String pathToFile, String valueToWrite){
        Path path = Paths.get(pathToFile);
        try {
            Files.write(path, valueToWrite.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

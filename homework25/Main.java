package homework25;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        String pathToFile = "homework25/textFile.txt";
        writeToFile(pathToFile, "SomeText");
        System.out.println(readFromFile(pathToFile));
    }

    private static String readFromFile(String pathToFile) {
        Path filePath = Path.of(pathToFile);
        String content = "";
        try {
            content = Files.readString(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    private static void writeToFile(String pathToFile, String valueToWrite){
        PrintWriter out = null;
        try {
            out = new PrintWriter(pathToFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert out != null;
        out.println(valueToWrite);
        out.close();
    }
}

package lesson6task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {
    public static void printEverySecondLine(String filePath) {
        try {
            String text = Files.readString(Path.of(filePath));
            String[] lines = text.split("\n");
            for (int i = 0; i < lines.length; i += 2) {
                System.out.println(lines[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

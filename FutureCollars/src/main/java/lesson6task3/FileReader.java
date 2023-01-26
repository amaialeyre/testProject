package lesson6task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {
    public static void readFile(String filePath) {
        try {
            String text = Files.readString(Path.of(filePath));
            System.out.println(text.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
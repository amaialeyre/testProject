package lesson6task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class FileReader {
    public static void searchForGivenWord(String filePath, String searchWord) {
        try {
            String text = Files.readString(Path.of(filePath));
            System.out.println(text.contains(searchWord));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package lesson6task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {
    public static void reverse(String filePath) {
        try {
            String text = Files.readString(Path.of(filePath));
            System.out.println(new StringBuilder(text).reverse());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

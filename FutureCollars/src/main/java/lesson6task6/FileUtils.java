package lesson6task6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

    public static void convertToUpperCase(String inputFilePath, String outputFilePath) {
        try {
            Path path = Paths.get(inputFilePath);
            String content = Files.readString(path);
            String upperCaseContent = content.toUpperCase();
            Files.writeString(Path.of(outputFilePath), upperCaseContent);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

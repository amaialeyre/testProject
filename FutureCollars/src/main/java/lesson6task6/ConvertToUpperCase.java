package lesson6task6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConvertToUpperCase {

    public void readString() {
        try {
            Path path = Paths.get("C:\\Users\\HP\\Desktop\\data.txt");
            String content = Files.readString(path);
            String upperCaseContent = content.toUpperCase();
            Files.writeString(Path.of("C:\\Users\\HP\\Desktop\\output.txt"), upperCaseContent);
            System.out.println(upperCaseContent);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

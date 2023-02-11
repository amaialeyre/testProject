package lesson11task5;

import java.util.Arrays;
import java.util.List;

public class TextUtils {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Dzisiaj", "jest", "sobota");

        printUniqueAndUpperCaseLetters(words);
    }

    private static void printUniqueAndUpperCaseLetters(List<String> words) {
        words.stream()
                .map(String::toUpperCase)
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .distinct()
                .forEach(System.out::println);
    }
}

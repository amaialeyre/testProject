package lesson11task5;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TextUtils {
    public static void main(String[] args){
        List<String> words = Arrays.asList("Dzisiaj", "jest", "sobota");

        Set<Character> textUtils = words.stream()
                .map(word -> word.toUpperCase())
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toSet());
        System.out.println(textUtils);
    }
}

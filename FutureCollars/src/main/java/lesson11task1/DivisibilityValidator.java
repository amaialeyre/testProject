package lesson11task1;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivisibilityValidator {

    public static List<Integer> aaa(int start, int end){
        return IntStream.range(start, end)
                .filter(number -> number % 3 == 0)
                .boxed()
                .collect(Collectors.toList());
    }

}

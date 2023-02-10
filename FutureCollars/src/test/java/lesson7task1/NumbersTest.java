package lesson7task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @ParametrizedTest
    @ValueSource(ints = {8, 12, 16, 24})
    void shouldReturnTrueForEvenNumbers(int number) {
        assertTrue(Numbers.isEven(number));
    }

    @ParametrizedTest
    @ValueSource(ints = {3, 7, 13, 21})
    void shouldReturnFalseForOddNumbers(int number) {
        assertFalse(Numbers.isEven(number));
    }

    @ParametrizedTest
    @CsvSource(value = {"18:9", "756:18", "1000:1", "1200:3"}, delimiter = ':')
    void shouldReturnSumOfDigitsForGivenNumbers(int number, int expected) {
        assertEquals(expected, Numbers.getSumOfDigits(number));
    }
}
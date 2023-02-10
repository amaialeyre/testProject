package lesson7task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @ParametrizedTest
    @ValueSource(ints = {Integer.MIN_VALUE, -8, 0, 12})
    void shouldReturnTrueForEvenNumbers(int number) {
        assertTrue(Numbers.isEven(number));
    }

    @ParametrizedTest
    @ValueSource(ints = {-111, 999, Integer.MAX_VALUE})
    void shouldReturnFalseForOddNumbers(int number) {
        assertFalse(Numbers.isEven(number));
    }

    @ParametrizedTest
    @CsvSource(value = {"-35353:19", "-18:9", "1000:1", "756:18", "1200:3"}, delimiter = ':')
    void shouldReturnSumOfDigitsForGivenNumbers(int number, int expected) {
        assertEquals(expected, Numbers.getSumOfDigits(number));
    }
}
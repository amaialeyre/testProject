package lesson2task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EvenOddTest {

    @Test
    void shouldReturnTrueIfEvenNumber() {
        //given
        int number = 2;
        //when
        boolean isEven = EvenOdd.isEvenNumber(number);
        //then
        Assertions.assertTrue(isEven);
    }

    @Test
    void shouldReturnFalseIfNotEvenNumber() {
        // given
        int number = 3;
        // when
        boolean isEven = EvenOdd.isEvenNumber(number);
        // then
        Assertions.assertFalse(isEven);
    }

    @Test
    void shouldReturnTrueIfOddNumber() {
        // given
        int number = 7;
        // when
        boolean isOdd = EvenOdd.isOddNumber(number);
        //then
        Assertions.assertTrue(isOdd);
    }

    @Test
    void shouldReturnFalseIfNotOddNumber() {
        // given
        int number = 8;
        // when
        boolean isOdd = EvenOdd.isOddNumber(number);
        // then
        Assertions.assertFalse(isOdd);
    }
}
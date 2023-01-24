package lesson2task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeTest {

    @Test
    void shouldReturnTrueIfAdult() {
        //given
        int age = 54;
        //when
        boolean isAdult = Age.isAdult(age);
        //then
        Assertions.assertTrue(isAdult);
    }

    @Test
    void shouldReturnFalseIfNotAdult() {
        //given
        int age = 17;
        //when
        boolean isAdult = Age.isAdult(age);
        //then
        Assertions.assertFalse(isAdult);
    }

    @Test
    void shouldReturnTrueIf18() {
        //given
        int age = 18;
        //when
        boolean isAdult = Age.isAdult(age);
        //then
        Assertions.assertTrue(isAdult);
    }
}
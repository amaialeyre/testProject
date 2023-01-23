package lesson2task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {

    @Test
    void shouldAddTwoNumbers() {
        //given
        int value1 = 5;
        int value2 = 2;
        //when
        int sum = Calculator.add(value1, value2);
        //then
        Assertions.assertEquals(7, sum);
    }
    @Test
    void shouldSubtractTwoNumbers() {
        //given
        int value1 = 4;
        int value2 = 3;
        //when
        int resultOfSubtract = Calculator.subtract(value1, value2);
        //then
        Assertions.assertEquals(1, resultOfSubtract );
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        //given
        int value1 = 3;
        int value2 = 4;
        //when
        int resultOfMultiply = Calculator.multiply(value1, value2);
        //then
        Assertions.assertEquals(12, resultOfMultiply);
    }

    @Test
    void shouldDivideTwoNumbers() {
        //given
        int value1 = 6;
        int value2 = 2;
        //when
        int resultOfDivide = Calculator.divide(value1, value2);
        //then
        Assertions.assertEquals(3, resultOfDivide);
    }
}
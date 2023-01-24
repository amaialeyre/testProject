package lesson3task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TriangleTest {

    @Test
    void shouldBeTrueForRightTriangle() {
        //given
        int sideA = 3;
        int sideB = 4;
        int hypotenuse = 5;

        //when
        boolean isRight = Triangle.isRight(sideA, sideB, hypotenuse);

        //then
        assertTrue(isRight);
    }

    @Test
    void shouldBeFalseForNotRightTriangle() {
        //given
        int sideA = 7;
        int sideB = 6;
        int hypotenuse = 5;

        //when
        boolean isRight = Triangle.isRight(sideA, sideB, hypotenuse);

        //then
        assertFalse(isRight);
    }
}
package lesson4task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldGetArea() {
        // given
        int sideA = 2;
        int sideB = 3;
        // when
        Rectangle rectangle = new Rectangle(sideA, sideB);
        int area = rectangle.getArea();
        // then
        Assertions.assertEquals(6, area);
    }

    @Test
    void shouldGetPerimeter() {
        // given
        int sideA = 3;
        int sideB = 2;
        // when
        Rectangle rectangle = new Rectangle(sideA, sideB);
        int perimeter = rectangle.getPerimeter();
        // then
        Assertions.assertEquals(10, perimeter);
    }
}
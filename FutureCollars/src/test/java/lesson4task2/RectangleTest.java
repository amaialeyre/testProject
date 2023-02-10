package lesson4task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCalculateRectangleArea() {
        Rectangle rectangle = new Rectangle(2, 6);
        double getArea = rectangle.getArea();
        Assertions.assertEquals(12, getArea);
    }

    @Test
    void shouldCalculateRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(4, 7);
        double getPerimeter = rectangle.getPerimeter();
        Assertions.assertEquals(22, getPerimeter);
    }
}
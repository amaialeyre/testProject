package lesson4task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldCalculateSquareArea() {
        Square square = new Square(4);
        double getArea = square.getArea();
        Assertions.assertEquals(16, getArea);
    }

    @Test
    void shouldCalculateSquarePerimeter() {
        Square square = new Square(5);
        double getPerimeter = square.getPerimeter();
        Assertions.assertEquals(20, getPerimeter);
    }
}
package lesson4task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldCalculateTriangleArea() {
        Triangle triangle = new Triangle(12, 10, 10, 8);
        double getArea = triangle.getArea();
        Assertions.assertEquals(48, getArea);
    }

    @Test
    void shouldCalculateTrianglePerimeter() {
        Triangle triangle = new Triangle(15, 8, 17, 8);
        double getPerimeter = triangle.getPerimeter();
        Assertions.assertEquals(40, getPerimeter);
    }
}
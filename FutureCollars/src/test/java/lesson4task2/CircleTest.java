package lesson4task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CircleTest {

    @Test
    void shouldCalculateCircleArea() {
        Circle circle = new Circle(5);
        double getArea = circle.getArea();
        Assertions.assertEquals(78.53981633974483, getArea);
    }

    @Test
    void shouldCalculateCirclePerimeter() {
        Circle circle = new Circle(5);
        double getPerimeter = circle.getPerimeter();
        Assertions.assertEquals(31.41592653589793, getPerimeter);
    }
}
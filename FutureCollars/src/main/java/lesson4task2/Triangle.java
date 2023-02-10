package lesson4task2;

public class Triangle extends Shape {
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final double heightA;

    public Triangle(double sideA, double sideB, double sideC, double heightA) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.heightA = heightA;
    }

    @Override
    public double getArea() {
        return 0.5 * sideA * heightA;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}

package lesson4task2;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double getArea() {
        return 0.5 * a * h;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}

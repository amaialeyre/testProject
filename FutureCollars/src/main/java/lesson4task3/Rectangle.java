package lesson4task3;

public class Rectangle implements Figures {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int getArea() {
        return sideA * sideB;
    }

    @Override
    public int getPerimeter() {
        return 2 * sideA + 2 * sideB;
    }
}

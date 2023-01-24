package lesson4task3;

public class Square implements Figures {

    private int sideA;

    public Square(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public int getArea() {
        return sideA * sideA;

    }

    @Override
    public int getPerimeter() {
        return 4 * sideA;
    }
}


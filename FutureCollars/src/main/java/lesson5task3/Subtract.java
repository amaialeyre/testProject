package lesson5task3;

public class Subtract implements Operation {

    @Override
    public double calculate(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }
}
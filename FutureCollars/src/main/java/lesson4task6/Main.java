package lesson4task6;

public class Main {
    public static double calculate(double bill, float serviceCharge) {
        return bill + serviceCharge;
    }

    public static double calculate(double bill, float serviceCharge, double discount) {
        return bill * (1 - discount) + serviceCharge;
    }

    public static double calculate(double bill, float serviceCharge, short takeoutCharge) {
        return bill + serviceCharge + takeoutCharge;
    }
}

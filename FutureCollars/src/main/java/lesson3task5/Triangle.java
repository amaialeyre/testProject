package lesson3task5;

public class Triangle {
    public static boolean isRight(int sideA, int sideB, int hypotenuse) {
        return (sideA * sideA + sideB * sideB == hypotenuse * hypotenuse);
    }
}

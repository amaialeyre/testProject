package lesson2task5;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(2));
    }
    public static boolean isEvenNumber(int value) {
        return value % 2 == 0;
    }
    public static boolean isOddNumber(int value) {
        return value % 2 == 1;
    }

}

package lesson7task1;

class Numbers {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int getSumOfDigits(int number) {
        int sumOfDigits = 0;

        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        return sumOfDigits;
    }
}

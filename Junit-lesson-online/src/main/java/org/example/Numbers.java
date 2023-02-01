package org.example;

public class Numbers {

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static int getSumOfDigits(int number) {
        int sumOfDigits;
        number = Math.abs(number);
        for (sumOfDigits = 0; number != 0; number = number / 10) {
            sumOfDigits = sumOfDigits + number % 10;
        }
        return sumOfDigits;
    }
}

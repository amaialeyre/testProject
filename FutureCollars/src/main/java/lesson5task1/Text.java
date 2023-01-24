package lesson5task1;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world");
        String text = scanner.nextLine();

        if (text.length() == 0) {
            System.out.println("Empty");
        } else {
            int length = text.length();
            System.out.println("Text length: " + length);

            boolean isPalindrome = true;
            for (int i = 0; i < length / 2; i++) {
                if (text.charAt(i) != text.charAt(length - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("Text is palindrome");
            } else {
                System.out.println("Text is not palindrome");
            }
        }
    }
}

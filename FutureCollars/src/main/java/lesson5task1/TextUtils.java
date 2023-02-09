package lesson5task1;

public class TextUtils {
    public static void check(String text) {
        int length = text.length();

        if (text.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Text length: " + length);

            if (isPalindrome(text, length)) {
                System.out.println("Text is palindrome");
            } else {
                System.out.println("Text is not palindrome");
            }
        }
    }

    private static boolean isPalindrome(String text, int length) {
        boolean isPalindrome = true;
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
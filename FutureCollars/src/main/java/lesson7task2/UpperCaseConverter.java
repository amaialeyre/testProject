package lesson7task2;

class UpperCaseConverter {
    public static String changeToUpperCase(String text) {
        if (text == null) {
            throw new IllegalArgumentException("This input should not be null");
        }
        return text.toUpperCase();
    }
}
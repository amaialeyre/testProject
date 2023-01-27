package lesson10task2;


public class PeselValidator {
    public static void main(String[] args) {
        if (isCorrect("0012345678")) {
            System.out.println("Poprawny PESEL");
        } else {
            System.out.println("Niepoprawny PESEL");
        }
    }

    public static boolean isCorrect(String pesel) {
        if (pesel.length() != 11) {
            return false;
        }

        for (int i = 0; i < pesel.length(); i++) {
            if (!Character.isDigit(pesel.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

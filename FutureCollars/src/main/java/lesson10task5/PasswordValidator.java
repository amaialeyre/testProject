package lesson10task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {

        String password = "aa1jduhHa";
        boolean isCorrect = validatorPassword(password);
        System.out.println("Correct password (" + password + "): " + isCorrect);
    }

    private static final String passwordCharacters = "^(?=.*[A-Z])(?=.*[0-9])(?=\\S+$).{7,}$";
    private static final String passwordYear = ".*(2021|21).*";

    public static boolean validatorPassword(String haslo) {
        Matcher m = Pattern.compile(passwordCharacters).matcher(haslo);
        Matcher f = Pattern.compile(passwordYear).matcher(haslo);

        return !f.matches() && m.matches();
    }
}


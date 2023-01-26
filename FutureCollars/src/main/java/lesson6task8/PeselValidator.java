package lesson6task8;

public class PeselValidator {
    public static void validateNumericValues(String pesel) {
        try {
            Long.parseLong(pesel);
        } catch (NumberFormatException e) {
            throw new WrongTypeOfDataException("only numbers are allowed");
        }
        if (pesel.length() != 11) {
            throw new IllegalLengthException("wrong number of characters");
        }
    }
}
package lesson10task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChooseNumbers {
    public static void main(String[] args) {
        String[] numbers = {
                "342",
                "5.34",
                "756",
                "1.234e+07",
                "7.234243E-02",
                "6.09",
                "3457",
                "87",
                "1.0001",
                "3",
                "5"
        };

        String intNumbers = "^[-+]?[0-9]+$";
        String floatNumbers = "^[-+]?[0-9]*\\.?[0-9]+$";
        String scientificNotation = "^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$";

        Pattern intP = Pattern.compile(intNumbers);
        Pattern floatP = Pattern.compile(floatNumbers);
        Pattern scientificP = Pattern.compile(scientificNotation);

        for (String number : numbers) {
            Matcher intM = intP.matcher(number);
            Matcher floatM = floatP.matcher(number);
            Matcher scientificM = scientificP.matcher(number);

            if (intM.matches()) {
                System.out.println(number + ": integer");
            } else if (floatM.matches()) {
                System.out.println(number + ": floating point number");
            } else if (scientificM.matches()) {
                System.out.println(number + ": scientific notation");
            }
        }
    }
}

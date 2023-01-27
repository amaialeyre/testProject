package lesson10task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {
    public static void main(String[] args) {

        String url = "onet.pl";

        String expression = "^(http://|https://)?(www\\.)?([a-zA-Z0-9]+\\.)+[a-zA-Z]{2,}$|^([a-zA-Z0-9]+\\.)+[a-zA-Z]{2,}$";
        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher(url);
        if (m.matches()) {
            System.out.println("URL is correct");
        } else {
            System.out.println("URL is not correct");
        }
    }
}


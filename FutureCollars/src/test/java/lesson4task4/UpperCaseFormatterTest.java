package lesson4task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseFormatterTest {

    @Test
    void shouldGetToUpperCase() {
        // given
        String text = "Ala ma kota";
        // when
        UpperCaseFormatter formatter = new UpperCaseFormatter();
        String formattedText = formatter.formatText(text);
        // then
        Assertions.assertEquals("ALA MA KOTA", formattedText);
    }
}

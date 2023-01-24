package lesson4task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerCaseFormatterTest {

    @Test
    void shouldGetToLowerCase() {
        // given
        String text = "Ala ma kota";
        // when
        LowerCaseFormatter formatter = new LowerCaseFormatter();
        String formattedText = formatter.formatText(text);
        // then
        Assertions.assertEquals("ala ma kota", formattedText);
    }
}
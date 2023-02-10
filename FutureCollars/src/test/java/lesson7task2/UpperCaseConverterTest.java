package lesson7task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UpperCaseConverterTest {

    @ParametrizedTest
    @ValueSource(strings = {"FIRST", "second", "tHIRd"})
    void shouldChangeToUpperCase(String text) {
        assertEquals(text.toUpperCase(), UpperCaseConverter.changeToUpperCase(text));
    }
    @Test
    void shouldThrowExceptionForNullInput() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            UpperCaseConverter.changeToUpperCase(null);
        });
        assertEquals("This input should not be null", exception.getMessage());
    }
}
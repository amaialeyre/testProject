package lesson7task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseConverterTest {

    @ParametrizedTest
    @NullSource
    void shouldReturnException_ForNull(String text) {
        assertThrows(RuntimeException.class, () -> {
            UpperCaseConverter.changeToUpperCase(text);
        });
    }

    @ParametrizedTest
    @EmptySource
    void shouldReturnEmptyString(String text) {
        assertEquals("", UpperCaseConverter.changeToUpperCase(text));
    }

    @ParametrizedTest
    @ValueSource(strings = {"FIRST", "second", "tHIRd"})
    void shouldChangeToUpperCase(String text) {
        assertEquals(text.toUpperCase(), UpperCaseConverter.changeToUpperCase(text));
    }
}
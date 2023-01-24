package lesson3task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeConverterTest {

    @Test
    void shouldConvert1MinuteToSeconds() {
        // given
        int minutes = 1;
        // when
        int seconds = TimeConverter.convertMinutesToSeconds(minutes);
        // then
        Assertions.assertEquals(60, seconds);
    }
}
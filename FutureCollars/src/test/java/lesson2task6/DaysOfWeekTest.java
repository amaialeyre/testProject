package lesson2task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DaysOfWeekTest {

    @Test
    void shouldReturnMonday() {
        String day = DaysOfWeek.getWeekday(1);
        Assertions.assertEquals("Monday", day);
    }

    @Test
    void shouldReturnTuesday() {
        String day = DaysOfWeek.getWeekday(2);
        Assertions.assertEquals("Tuesday", day);
    }

    @Test
    void shouldReturnWednesday() {
        String day = DaysOfWeek.getWeekday(3);
        Assertions.assertEquals("Wednesday", day);
    }

    @Test
    void shouldReturnThursday() {
        String day = DaysOfWeek.getWeekday(4);
        Assertions.assertEquals("Thursday", day);
    }


    @Test
    void shouldReturnFriday() {
        String day = DaysOfWeek.getWeekday(5);
        Assertions.assertEquals("Friday", day);
    }

    @Test
    void shouldReturnSaturday() {
        String day = DaysOfWeek.getWeekday(6);
        Assertions.assertEquals("Weekend", day);
    }


    @Test
    void shouldReturnSunday() {
        String day = DaysOfWeek.getWeekday(7);
        Assertions.assertEquals("Weekend", day);
    }

    @Test
    void shouldReturnNoSuchDay() {
        String day = DaysOfWeek.getWeekday(8);
        Assertions.assertEquals("There is no such a day!", day);
    }
}
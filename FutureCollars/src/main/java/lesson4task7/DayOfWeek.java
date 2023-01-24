package lesson4task7;

import java.time.DayOfWeek;

class DayOfWeekUtils {
    public static String getDaysName(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                return "Monday";
            case TUESDAY:
                return "Tuesday";
            case WEDNESDAY:
                return "Wednesday";
            case THURSDAY:
                return "Thursday";
            case FRIDAY:
                return "Friday";
            case SATURDAY:
                return "Saturday";
            case SUNDAY:
                return "Sunday";
            default:
                return "No such day";
        }
    }
}

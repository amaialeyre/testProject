package lesson10task6;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class DateOfBirth {
    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.parse("2002-02-19");
        LocalDate dateToday = LocalDate.now();

        int age = dateToday.getYear() - dateOfBirth.getYear();
        if (dateToday.getMonthValue() < dateOfBirth.getMonthValue() || (dateToday.getMonthValue() == dateOfBirth.getMonthValue())) {
            if (dateToday.getDayOfMonth() < dateOfBirth.getDayOfMonth()) {
                return;
            }
            age--;
        }

        System.out.println("Wiek: " + age);
        System.out.println("Dzień tygodnia urodzenia: " + dateOfBirth.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.println("Tydzień roku: " + dateOfBirth.get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear()));
    }
}

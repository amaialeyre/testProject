package lesson3task2;

public class Movie {
    private final String title;
    private final String nameAndSurnameOfDirector;
    private final int durationInMinutes;
    private final int yearOfProduction;

    public Movie(String title, String nameAndSurnameOfDirector, int durationInMinutes, int yearOfProduction) {
        this.title = title;
        this.nameAndSurnameOfDirector = nameAndSurnameOfDirector;
        this.durationInMinutes = durationInMinutes;
        this.yearOfProduction = yearOfProduction;
    }
}

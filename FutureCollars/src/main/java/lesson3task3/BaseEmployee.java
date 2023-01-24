package lesson3task3;

public abstract class BaseEmployee {
    private static final int BASE_SALARY = 3000;
    private final String name;
    private final String surname;
    private final int employmentYear;
    private final int salary;

    public BaseEmployee(String name, String surname, int employmentYear, int salary) {
        this.name = name;
        this.surname = surname;
        this.employmentYear = employmentYear;
        this.salary = salary;
    }

    public BaseEmployee(String name, String surname, int employmentYear) {
        this.name = name;
        this.surname = surname;
        this.employmentYear = employmentYear;
        this.salary = BASE_SALARY;
    }

    public int getWorkYears() {
        return 2020 - employmentYear;
    }

    public int getSalary() {
        return this.salary;
    }

    public abstract int calculateMonthlySalary();
}

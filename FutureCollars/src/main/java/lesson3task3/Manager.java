package lesson3task3;

public class Manager extends BaseEmployee {
    private static final int BASE_SALARY = 5000;
    private static final int BASE_BONUS = 500;
    private int bonus;

    public Manager(String name, String surname, int employmentYear, int salary) {
        super(name, surname, employmentYear, salary);
        this.bonus = BASE_BONUS;
    }

    @Override
    public int calculateMonthlySalary() {
        return this.getSalary() + bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}

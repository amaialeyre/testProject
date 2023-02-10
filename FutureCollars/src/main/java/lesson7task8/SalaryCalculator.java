package lesson7task8;

public class SalaryCalculator {
    private final BaseSalaryService baseSalaryService;
    private final SaturdaySalaryService saturdaySalaryService;

    public SalaryCalculator(BaseSalaryService baseSalaryService, SaturdaySalaryService saturdaySalaryService) {
        this.baseSalaryService = baseSalaryService;
        this.saturdaySalaryService = saturdaySalaryService;
    }

    public double calculateSalary(double bonus, int numberOfSaturdays) {
        return baseSalaryService.fetchBaseSalary() + bonus + (saturdaySalaryService.fetchSaturdaySalary() * numberOfSaturdays);
    }
}
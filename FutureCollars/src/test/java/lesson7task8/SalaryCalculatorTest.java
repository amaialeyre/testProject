package lesson7task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SalaryCalculatorTest {

    @Test
    void shouldCalculateSalary() {
        // given
        BaseSalaryService baseSalaryService = Mockito.mock(BaseSalaryService.class);
        Mockito.when(baseSalaryService.fetchBaseSalary()).thenReturn(1000.0);

        SaturdaySalaryService saturdaySalaryService = Mockito.mock(SaturdaySalaryService.class);
        Mockito.when(saturdaySalaryService.fetchSaturdaySalary()).thenReturn(50.0);

        SalaryCalculator salaryCalculator = new SalaryCalculator(baseSalaryService, saturdaySalaryService);

        // when
        double salary = salaryCalculator.calculateSalary(500, 2);

        // then
        Assertions.assertEquals(1600, salary);
    }
}

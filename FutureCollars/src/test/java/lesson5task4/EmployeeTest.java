package lesson5task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void shouldRetrieveEmployeeDescription() {
        //given
        Employee employee = new Employee("Jan", "Nowak");
        //when
        String actualEmployeeInfo = employee.getEmployeeInfo();
        //then
        Assertions.assertNotNull(actualEmployeeInfo);
        Assertions.assertEquals("Employee name: Jan Nowak", actualEmployeeInfo);
    }

    @Test
    void shouldRetrieveEmployeeDetailsWithAge() {
        //given
        Employee employee = new Employee("Jan", "Nowak", 34);
        //when
        String actualEmployeeDetails = employee.getEmployeeDetails();
        //then
        Assertions.assertNotNull(actualEmployeeDetails);
        Assertions.assertEquals("Employee details: Jan Nowak is 34", actualEmployeeDetails);
    }

    @Test
    void shouldRetrieveBaseSalary() {
        //given
        BigDecimal baseSalary = new BigDecimal("5000");
        Employee employee = new Employee("Jan", "Nowak", 34, baseSalary);
        //when
        BigDecimal actualBaseSalary = employee.getBaseSalary();
        //then
        Assertions.assertNotNull(actualBaseSalary);
        Assertions.assertEquals(baseSalary, actualBaseSalary);
    }


    @Test
    void shouldRetrieveBaseSalaryWithBonus() {
        //given
        BigDecimal baseSalary = new BigDecimal("5000");
        BigDecimal bonus = new BigDecimal("100");
        Employee employee = new Employee("Jan", 34, baseSalary, bonus, "Nowak");
        //when
        BigDecimal actualTotalSalary = employee.getTotalSalary();
        //then
        Assertions.assertNotNull(actualTotalSalary);
        Assertions.assertEquals(baseSalary.add(bonus), actualTotalSalary);
    }

    @Test
    void shouldRetrieveEmployeeBonus() {
        //given
        BigDecimal baseSalary = new BigDecimal("5000");
        BigDecimal bonus = new BigDecimal("100");
        Employee employee = new Employee("Jan", 34, baseSalary, bonus, "Nowak");
        //when
        BigDecimal actualBonus = employee.getBonus();
        //then
        Assertions.assertNotNull(actualBonus);
        Assertions.assertEquals(bonus, actualBonus);
    }
}
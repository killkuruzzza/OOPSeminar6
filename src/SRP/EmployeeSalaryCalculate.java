package SRP;

/**
 * Отделяем логику вычисления ЗП, чтобы не менять класс Employee в будущем при изменении правил вычисления зарплаты.
 * Single response для класса EmployeeSalaryCalculate - это вычислять ЗП.
 */
public class EmployeeSalaryCalculate {
    private int baseSalary;

    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double salaryCalculate(){
        return this.baseSalary * 1.5;
    }
}

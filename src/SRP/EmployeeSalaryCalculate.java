package SRP;

public class EmployeeSalaryCalculate {
    //    Класс обладает хорошим потенциалом для использования в других проектах или задачах
    private int baseSalary;

    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double salaryCalculate(){
        return this.baseSalary * 1.5;
    }
}

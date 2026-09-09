package lambda.salaryCalculator;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("Sujay",60000.0);
        SalaryCalculator bonus=salary -> salary+(salary*10)/100;

        SalaryCalculator tax=salary -> salary-(salary*10)/100;

        SalaryCalculator increment=salary -> salary+(salary*20)/100;

        System.out.println(bonus.calculate(employee.getSalary()));

        System.out.println(tax.calculate(employee.getSalary()));

        System.out.println(increment.calculate(employee.getSalary()));
    }
}

package practice.employeefilter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();

        employeeList.addAll(
               List.of(
                       new Employee(101,"Ajay",1000.0),
                       new Employee(102,"Rohit",2000.0),
                       new Employee(103,"Kumar",3000.0)
               )
        );

        EmployeeFilter employeeFilter=employee -> employee.getSalary()>1500.0;
        for(Employee employee:employeeList)
        {
            if(employeeFilter.filter(employee))
            {
                System.out.println(employee.getName()+"->"+employee.getSalary());
            }
        }
    }
}

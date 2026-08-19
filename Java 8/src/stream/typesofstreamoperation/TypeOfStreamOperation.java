package stream.typesofstreamoperation;

import java.util.ArrayList;
import java.util.stream.Stream;

public class TypeOfStreamOperation {
    public static void main(String[] args) {
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Mahesh",20000));
        employees.add(new Employee("Viththal",40000));
        employees.add(new Employee("Rohit",30000));
        employees.add(new Employee("Ajay",45000));

        Stream<Employee> stream1=employees.stream();
        Stream<Employee> stream2 = stream1.filter(employee -> employee.getSalary() > 35000);
        long count=stream2.count();
        System.out.println(count);
    }
}

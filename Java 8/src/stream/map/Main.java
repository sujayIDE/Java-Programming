package stream.map;

import stream.typesofstreamoperation.Employee;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<stream.typesofstreamoperation.Employee> employees=new ArrayList<>();
        employees.add(new stream.typesofstreamoperation.Employee("Mahesh",20000));
        employees.add(new stream.typesofstreamoperation.Employee("Viththal",40000));
        employees.add(new stream.typesofstreamoperation.Employee("Rohit",30000));
        employees.add(new stream.typesofstreamoperation.Employee("Ajay",45000));

      Stream<Employee> stream=employees.stream();
/*
      stream.map(e->e.getName())
              .forEach(e-> System.out.println(e));
*/

      stream.filter(e->e.getSalary()>35000)
              .map(e->e.getName())
              .forEach(name-> System.out.println(name));
    }
}

package stream.operations;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.addAll(
                Arrays.asList(
                        new Employee(7516, "Scott", 7000, "Research"),
                        new Employee(7167, "Turner", 6000, "IT"),
                        new Employee(7267, "David", 5000, "Research"),
                        new Employee(7144, "Clara", 7000, "HR"),
                        new Employee(7984, "Miller", 9000, "IT"),
                        new Employee(7154, "Emma", 8000, "HR"),
                        new Employee(7378, "Sophia", 6000, "HR"),
                        new Employee(7625, "Edward", 4000, "Accounting"),
                        new Employee(7763, "Smith", 7000, "IT")
        ));

        //print employees of department "IT"
        employees.stream()
                .filter(e->e.getDepartment().equals("IT"))
                .forEach(System.out::println);

        System.out.println("==================================================================");

        //print high salary
        //option 1
        Optional<Employee> optional = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSal).reversed())
                .findFirst();
               optional .ifPresent(System.out::println);

        //option 2
        Optional<Employee> optional1 = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSal));
                optional1.ifPresent(System.out::println);

        System.out.println("======================================================================");
        //print second highest most salary
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSal).reversed())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("=========================================================================");
        //group employee of list by there department
        Map<String, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        collect.forEach((k,v)->{
            System.out.println(k+"->"+v);
        });

        //count department
        System.out.println("======================================================================================");
        Map<String, Long> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        collect1.forEach((k,v)-> System.out.println(k+"->"+v));

        System.out.println("======================================================================================");
        Map<String, Double> salMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSal)));
        salMap.forEach((k,v)->{
            System.out.println("Department name : "+k);
            System.out.println("Salary sum by department : "+v);
        });


        System.out.println("==========================================================================================");
        //average salary
        double asDouble = employees.stream()
                .mapToDouble(Employee::getSal)
                .average()
                .getAsDouble();
        System.out.println(asDouble);

        System.out.println("================================================================");
        //Sum of values of list of integer
        List<Integer> list=Arrays.asList(56,30,40,19,30);
        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        System.out.println("==================================================================");
        //remove duplicate
        int [] arr={3,1,6,1,9,3,4};
        int[] array = Arrays.stream(arr)
                .distinct()
                .toArray();
       for(int a:array)
       {
           System.out.print(a+" ");
       }
       String [] str={"Java","Python","Java"};
        String[] array1 = Arrays.stream(str)
                .distinct()
                .toArray(String[]::new);
        for(String s:array1)
        {
            System.out.println(s);
        }

        System.out.println("===================================================================================");
        Stream<Integer> integerStream=Stream.of(10,20,30,40,50);
        boolean b = integerStream.allMatch(i -> i % 10 == 0);
        System.out.println(b);

        Stream<Integer> integerStream1=Stream.of(10,20,30,40,50);
        boolean b1 = integerStream1.noneMatch(i -> i >100);
        System.out.println(b1);

        Stream<Integer> integerStream2=Stream.of(10,20,30,40,50);
        boolean b3=integerStream2.anyMatch(i->(i*i)>2000);
        System.out.println(b3);


        System.out.println("================================================================");
        //chek Palindrome
        String str1="madam";
        int n=str1.length();
        boolean b2 = IntStream.range(0, n / 2)
                .allMatch(i -> str1.charAt(i) == str1.charAt(n - i - 1));
        if(b2)
        {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindorme");
        }

        System.out.println("====================================================================================");
        //check Prime number
        int number=9;
        boolean b4 = IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(i -> number % i == 0);
        if(b4)
        {
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}

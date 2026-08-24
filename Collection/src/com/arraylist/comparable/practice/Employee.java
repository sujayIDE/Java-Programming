package com.arraylist.comparable.practice;

public class Employee implements Comparable<Employee> {
    private int id;
    private double salary;

    public Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if(this.salary<o.getSalary())
        {
            return -1;
        } else if (this.salary==o.getSalary()) {
            return 0;
        }else{
            return 1;
        }
    }
}

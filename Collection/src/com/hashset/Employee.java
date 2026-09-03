package com.hashset;

import java.util.Objects;

public class Employee {
    private int employee_id;
    private String employee_name;
    private double salary;

    public Employee(int employee_id, String employee_name, double salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.salary = salary;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employee_id == employee.employee_id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(employee_id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

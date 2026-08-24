package stream.operations;

public class Employee {
    private int empno;
    private String ename;
    private double sal;
    private String department;

    public Employee(int empno, String ename, double sal, String department) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
        this.department = department;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                ", department='" + department + '\'' +
                '}';
    }
}

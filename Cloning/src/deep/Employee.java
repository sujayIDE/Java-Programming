package deep;

public class Employee implements Cloneable {
    private int empno;
    private String ename;

    private Department department;

    public Employee(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();

        cloned.department = (Department) this.department.clone();

        return cloned;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", department no=" + department.getDeptno() +
                ", department name="+department.getDname()+
                '}';
    }

    void display()
    {
        System.out.println(toString());
    }
}

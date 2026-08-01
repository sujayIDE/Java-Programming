class Employee {
    private int empno;
    private String ename;

    Employee(int empno, String ename) {
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
}
    class FullTimeEmployee extends Employee{
        private double sal;

        FullTimeEmployee(int empno,String ename,double sal)
        {
            super(empno,ename);
            this.sal=sal;
        }

        public double getSal() {
            return sal;
        }

        public void setSal(double sal) {
            this.sal = sal;
        }

        public void displayFullTimeEMployee()
        {
            System.out.println("Empno: "+getEmpno());
            System.out.println("Ename: "+getEname());
            System.out.println("Salary: "+sal);
        }
    }

    public class Test{
        public static void main(String[] args) {
            FullTimeEmployee fte=new FullTimeEmployee(23,"Sujay",85000.0);
            fte.displayFullTimeEMployee();
        }
    }


class Company_Emp{
    private int empno;
    private String empname;

    Company_Emp(int empno,String empname)
    {
        this.empno=empno;
        this.empname=empname;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }
}

class FullTimeEmployee1 extends Company_Emp {
    private double monthlysalary;
    private double leaveTaken;

    public FullTimeEmployee1(int empno, String empname, double monthlysalary, double leaveTaken) {
        super(empno, empname);
        this.monthlysalary = monthlysalary;
        this.leaveTaken = leaveTaken;
    }

    public double calculateSalary() {
        int leaves = 2;
        double daySalary = monthlysalary / 30;
        if (leaveTaken > 2) {
            monthlysalary = monthlysalary - (leaveTaken - leaves) * daySalary;
        }
        return monthlysalary;
    }
}

    public class TestInheritanceClass {
        public static void main(String[] args) {
            FullTimeEmployee1 fte = new FullTimeEmployee1(101, "Rohit", 100000, 4);
            double sal = fte.calculateSalary();
            System.out.println("salary:" + sal);
        }
    }



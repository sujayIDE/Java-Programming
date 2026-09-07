package deep;

public class Department  implements Cloneable{
    private int deptno;
    private String dname;

    public Department(int deptno, String dname) {
        this.deptno = deptno;
        this.dname = dname;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

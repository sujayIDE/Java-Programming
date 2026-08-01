import com.sun.tools.javac.Main;

public final class Immutable_Class {
    private final int eid;
    private final StringBuffer ename;

    public Immutable_Class(int eid, StringBuffer ename) {
        this.eid = eid;
        this.ename = new StringBuffer(ename);
    }

    public int getEid() {
        return eid;
    }

    public StringBuffer getEname() {
        return new StringBuffer(ename);
    }

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Sujay");
        Immutable_Class c=new Immutable_Class(101,sb);
        System.out.println(c.getEname());
        sb.append("Kumar");
        System.out.println(c.getEname());

    }
}

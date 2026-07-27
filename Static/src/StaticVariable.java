class Employee{
    private int stdid;
    private String stdName;
    static String collegeName;

    public Employee(int stdid, String stdName) {
        this.stdid = stdid;
        this.stdName = stdName;
    }

    static void display()
    {
        System.out.println("Static method"+collegeName);
    }
    public int getStdid() {
        return stdid;
    }

    public void setStdid(int stdid) {
        this.stdid = stdid;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public static String getCollegeName() {
        return collegeName;
    }

    public static void setCollegeName(String collegeName) {
        Employee.collegeName = collegeName;
    }

    public void printDetails()
    {
        System.out.println("StdID: "+stdid);
        System.out.println("StdName: "+stdName);
        System.out.println("CollegeName: "+collegeName);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Employee e=new Employee(101,"Ajay");
        Employee.collegeName="DYP";
        e.printDetails();
        Employee.display();


    }
}

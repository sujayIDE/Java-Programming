public class Test {
    private int age;
    private String name;
    private double sal;

    public Test(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public int getAge()
    {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}

public class StaticInstanceMethodAccessFromBothViceVersa {
    public void m1()
    {

    }

    public static void m2()
    {
        System.out.println("Static method");
    }

    public void m3()
    {
        System.out.println("Instance method");
    }

    public static void m4(StaticInstanceMethodAccessFromBothViceVersa s)
    {
       s. m3();
    }

    public static void main(String[] args) {
        StaticInstanceMethodAccessFromBothViceVersa s=new StaticInstanceMethodAccessFromBothViceVersa();
        s.m3();
        m4(s);
    }
}

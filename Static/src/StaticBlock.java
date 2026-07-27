class A{
    static int a=1111;
    static {
        System.out.println("Static block A " +a);
    }

    static {
        System.out.println("Staic block A+");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        A.a=7777;
       // A a=new A();
        System.out.println("Method");

    }
}

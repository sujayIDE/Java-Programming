interface A{
    void m1();
}

class B implements A{
    @Override
    public void m1() {
        System.out.println("B");
    }
}

public class Null {
    public static void main(String[] args) {
        A a=null;
        System.out.println(a==null);
        System.out.println(a);
    }
}

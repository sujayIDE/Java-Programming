package task1;

public class ClassA {
    public void method1()
    {
        System.out.println("hello world");
        ClassA classA=new ClassA();
        classA.method2();
    }

    public void method2()
    {
        System.out.println("awsome world");
    }

    public static void main(String[] args) {
        System.out.println("Start");
        ClassA classA=new ClassA();
        classA.method1();
        System.out.println("End");
    }
}

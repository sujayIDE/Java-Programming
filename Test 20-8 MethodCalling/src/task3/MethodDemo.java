package task3;

public class MethodDemo {
    void display(){
        System.out.println("Welcome to Java Programming");
    }

    void show()
    {
        System.out.println("Now let's understand parameterized methods");
    }

    void calculate(int a, int b){
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("Sum : "+(a+b));
    }

    public static void main(String[] args) {
        MethodDemo methodDemo=new MethodDemo();
        methodDemo.display();

        MethodDemo methodDemo1=new MethodDemo();
        methodDemo1.show();
        methodDemo1.calculate(10,20);
    }
}

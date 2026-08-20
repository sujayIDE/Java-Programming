package task2;

public class Day_4 {
    int a=20;
    int b=10;

    void method1()
    {
        System.out.println("Addition : "+(a+b));
    }

    void method2()
    {
        System.out.println("Substraction : "+(a-b));
    }

    void method3()
    {
        System.out.println("Multiplication : "+(a*b));
        System.out.println("Division : "+(a/b));
    }

    public static void main(String[] args) {
        Day_4 day1=new Day_4();
        day1.method1();

        Day_4 day2=new Day_4();
        day2.method2();

        Day_4 day3=new Day_4();
        day3.method3();
    }
}

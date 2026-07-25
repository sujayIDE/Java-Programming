public class Test {
    int x;
    String b;

    Test(int x,String b)
    {
        this.x=x;
        this.b=b;
    }

    void display()
    {
        System.out.println(this.x);
        System.out.println(this.b);
    }

    public static void main(String[] args) {
        Test t1=new Test(10,"Sujay");
        t1.display();
        Test t2=new Test(20,"Ajay");
        t2.display();
    }
}

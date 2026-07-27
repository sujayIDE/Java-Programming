class Test1{
    int a=10;
    static int x=40;
    //we can not declare same varible for instance and static varible
    void display()
    {
        int x=50;
//        static int x=60;  //always outsie method
        System.out.println(x);
        System.out.println(this.x);
    }
}
public class TestClass {
    public static void main(String[] args) {
       Test1 t=new Test1();
       t.display();

    }
}

//this.x can access a static variable if no instance field with that name exists,
// but using the class name (Test1.x) is the recommended style.
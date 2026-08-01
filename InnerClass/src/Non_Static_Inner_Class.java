class Outer {
    private int x = 10;
    private static int y = 20;

     class Inner{
         private int z=50;
        void add()
        {
            System.out.println(x+y);
        }
    }

    void show()
    {
        Inner inner1=new Inner();
        System.out.println(inner1.z);
    }
}
public class Non_Static_Inner_Class {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner inner=o.new Inner();
        inner.add();
        o.show();
    }

}

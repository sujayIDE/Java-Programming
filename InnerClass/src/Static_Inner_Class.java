class OuterClass{
    int a=10;
    static int y=20;
  static class InnerClass{
      int y=30;
        void show()
        {
           // System.out.println(a);
            System.out.println(y);
        }
    }
}
public class Static_Inner_Class {
    public static void main(String[] args) {
        OuterClass.InnerClass inner=new OuterClass.InnerClass();
        inner.show();
    }
}

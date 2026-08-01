public class Pass_By_Value {
    void m1(int x)
    {
        x=x+20;
        System.out.println(x);
    }
    public static void main(String[] args) {
        Pass_By_Value p=new Pass_By_Value();
        int k=10;
        p.m1(k);
        System.out.println(k);
    }
}

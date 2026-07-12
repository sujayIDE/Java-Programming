public class OperatorPrecedence {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        int c=(++a + b--)*b - a--;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

//        boolean b=true;
//        boolean b2=b && !b || b;
//        System.out.println(b2);

        int x=10;
        x+=x+10 + ++x*3/(2+1);
        System.out.println(x);
    }
}

public class AssignmentOperator {
    public static void main(String[] args) {
        //ex1:
//        int x=10;
//        x/=x++ + --x;
//        System.out.println(x);

        int a=10;
        int b=11;
        a-=a++ % ++b - ++a;
        System.out.println(a);
    }
}

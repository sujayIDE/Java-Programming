public class TernaryOperator {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        int c=b++>a? a:b;
//        System.out.println(c);

//        int a=7;
//        int b=18;
//        int c=9;
//        int d=(a>b && a>c)?a:(b>c)?b:c;
//        System.out.println(d);

        int y=2028;
        String s=((y%4==0 && y%100!=0 )||y%400==0)?"leap":"non-leap";
        System.out.println(s);

    }
}

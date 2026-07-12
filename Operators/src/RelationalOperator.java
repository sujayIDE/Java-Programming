public class RelationalOperator {
    public static void main(String[] args) {
        //relational operators
//        int x=12;
//        int y=11;
//        System.out.println(x++ >= ++y);
//        System.out.println(--x >y);
//        System.out.println(++x <y++);
//        System.out.println(x==y);
//        System.out.println(x++ != y);

        //logical &&(and) operator
//        int x=11;
//        int y=10;
//        System.out.println(x++ >y && ++y >= x++);
//        System.out.println(--x <y -- && x != y++);
//        System.out.println(x);
//        System.out.println(y);

        //logical ||(or) operator
//        int x=11;
//        int y=10;
//        System.out.println(x++ >y || ++y >= x++);
//        System.out.println(--x <y -- || x != y++);
//        System.out.println(x);
//        System.out.println(y);

        boolean b1=false;
        boolean b2=true;
        System.out.println(b1==!b2);
        System.out.println(b1==b2);
        System.out.println(!b1==b2);
        System.out.println((b1=true)==!b2);
        System.out.println(b1==!b2 && !b1==b2);
    }
}

package lambda;


public interface MyInterface {
    void add(int a,int b);
}

class Main{
    public static void main(String[] args) {
       MyInterface m= (a,b)->{
            System.out.println(a+b);
        };
       m.add(10,20);
    }
}



class Account{
    int x;
    static int y;

    Account(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

//    static {
//        y=50;
//    }

    void display()
    {
        System.out.println(x+" "+y);
    }
}

public class Test {
    public static void main(String[] args) {
        Account a=new Account(10,50);
        a.display();
    }}

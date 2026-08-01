class Manager{
    Manager()
    {
        this(10);
        System.out.println("no-args:Constructor");
    }

    Manager(int x)
    {
        System.out.println("args constructor");
    }
}

public class ThisMethodCall {
    public static void main(String[] args) {
        Manager mgr=new Manager();
    }
}

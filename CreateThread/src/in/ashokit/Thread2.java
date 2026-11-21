package in.ashokit;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        char start='A';
        char end='J';
        for(int i=start;i<=end;i++)
        {
            System.out.println("Char  = "+(char)i);
        }
    }
}

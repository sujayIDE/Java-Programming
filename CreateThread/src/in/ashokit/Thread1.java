package in.ashokit;

public class Thread1 implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
            System.out.println("i = "+i);
        }
    }
}

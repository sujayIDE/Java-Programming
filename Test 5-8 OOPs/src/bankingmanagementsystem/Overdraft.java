package bankingmanagementsystem;

public class Overdraft extends RuntimeException{
    public Overdraft()
    {

    }

    public Overdraft(String message)
    {
        super(message);
    }
}

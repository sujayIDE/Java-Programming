public class Account {
    private int id;
    private String name;
    private double balance=10000;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount)
    {
        if(amount<0)
        {
            throw new InvalidAmount("Invalid Amount");
        }
    }
}

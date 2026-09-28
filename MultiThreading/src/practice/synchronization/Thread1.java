package practice.synchronization;

public class Thread1 extends Thread{
    AccountBalance accountBalance;

    public Thread1(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public void run() {
        accountBalance.withdraw(700);
    }
}

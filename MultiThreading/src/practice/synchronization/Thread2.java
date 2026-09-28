package practice.synchronization;

public class Thread2 extends Thread{
        AccountBalance accountBalance;

        public Thread2(AccountBalance accountBalance) {
            this.accountBalance = accountBalance;
        }

        @Override
        public void run() {
            accountBalance.withdraw(500);
        }
    }


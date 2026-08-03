package bankingmanagementsystem;

public class Main {
    public static void main(String[] args) {
        SBI sbi=new SBI(10101010,"Ajay",50000.0,5000.0,35000.0);
        HDFC hdfc=new HDFC(2020202,"Rohit",1.0,50000.0,20000.0);
        ICICI icici=new ICICI(303033,"Mohit",20000.0,10000.0,5000.0);

        Bank [] banks={sbi,hdfc,icici};

        for (Bank bank:banks)
        {
            bank.display();
            System.out.println();
            bank.deposit();
            System.out.println();
            bank.withdraw();
            System.out.println();
            bank.calculateInterest();
            System.out.println("=====================================");
        }
    }
}

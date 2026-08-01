class Payment{
    public void pay()
    {
        System.out.println("Payment is done");
    }
}

class CardPayment extends Payment{
    public void pay()
    {
        System.out.println("Card Payment");
    }
}

class UpiPayment extends Payment{
    public void pay()
    {
        System.out.println("Upi Payment");
    }
}

class ProcessPayment
{
   public void service(Payment payment)
   {
       payment.pay();
   }
}
public class OverloadingClass {
    public static void main(String[] args) {
        ProcessPayment pp=new ProcessPayment();
        pp.service(new CardPayment());
        pp.service(new UpiPayment());
    }
}

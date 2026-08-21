public class Main {
    public static void main(String[] args) {
        Account account=new Account(101,"Sujay");
    try
    {
        account.deposit(-2);
    }catch (InvalidAmount e){
        System.out.println(e.getMessage());
    }
    }
}

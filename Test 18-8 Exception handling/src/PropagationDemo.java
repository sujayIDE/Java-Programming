public class PropagationDemo {

    void divide() throws ArithmeticException
    {
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        PropagationDemo propagationDemo=new PropagationDemo();
       try
       {
           propagationDemo.divide();
       }catch (ArithmeticException e)
       {
           System.out.println("/ by zero");
       }
    }
}

 interface Generic_Interface <T>{
    T format(T t1,T t2);
}

public class IntegerFormatter implements Generic_Interface <Integer>{
    @Override
    public Integer format(Integer i1,Integer i2)
    {
        return 1;
    }

    public static void main(String[] args) {
        IntegerFormatter i=new IntegerFormatter();
        System.out.println(i.format(10,20));
    }
}

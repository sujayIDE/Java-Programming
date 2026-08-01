import java.util.ArrayList;

public class Before_Generics {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(10);
        list.add("Hello");

        for(Object ob:list){
            System.out.println(ob+" ");
        }

        Integer i=(Integer) list.get(1);
        System.out.println(i);
    }
}

package optional;

import java.util.Optional;

public class Progam1 {
    static String getName(Optional<String> name)
    {
        if(name.isEmpty())
        {
           return "Guest";
        }else{
           return name.get();
        }
    }
    public static void main(String[] args) {
        Optional<String> optional=Optional.of("Sujay");
        String result=getName(optional);
        System.out.println(result);
    }
}

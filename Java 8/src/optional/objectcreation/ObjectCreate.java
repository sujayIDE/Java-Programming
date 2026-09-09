package optional.objectcreation;

import java.util.Optional;

public class ObjectCreate {
    public static void main(String[] args) {
        Optional<String> optional=Optional.empty();
        System.out.println(optional);
        Optional<String> optionalS=Optional.of("Hello");
        System.out.println(optionalS.toString());
        Optional<String> optionalS1=Optional.ofNullable("");
        System.out.println(optionalS1.toString());
    }
}

package shrinivassir.functionalinterface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> msg=()->"Hello java";
        System.out.println("Message is :" +msg.get());
    }
}

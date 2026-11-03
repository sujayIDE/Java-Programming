package practice.stringprocessor;

public class Main {
    public static void main(String[] args) {
        StringProcessor sp=String::toUpperCase;
        System.out.println("Uppercase: "+ sp.process("sujay"));
    }
}

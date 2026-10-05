package practice2.aggregation;

public class Main {
    public static void main(String[] args) {
        Address address=new Address("Ammerpet","Hydrabad");
        Student student=new Student("Sujay",address);

        System.out.println(student);
    }
}

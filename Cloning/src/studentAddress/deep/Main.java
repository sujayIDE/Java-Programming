package studentAddress.deep;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address  address=new Address("Kolhapur",41609);
        Student original=new Student(101,"Ajay",address);

       Student clone= (Student) original.clone();
       clone.setRollNo(102);
       clone.setName("Vijay");

        System.out.println("Original : ");
        System.out.println(original);

        System.out.println("Cloned : ");
        System.out.println(clone);
    }
}

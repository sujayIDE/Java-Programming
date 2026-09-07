package studentAddress.shallow;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address=new Address("Kolhapur",416509);
        Student original=new Student(101,"Sujay",address);

       Student clone= (Student) original.clone();
       clone.setRollNo(102);
       clone.setName("Ajay");

      // original.getAddress().setCity("Pune");

        System.out.println("Original Student : ");
        System.out.println(original);

        System.out.println("Cloned Student : ");
        System.out.println(clone);


    }
}

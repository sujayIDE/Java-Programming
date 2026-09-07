package deep;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee original=new Employee(101,"Sujay");
        Department department=new Department(1,"HR");
        original.setDepartment(department);

        Employee cloned= (Employee) original.clone();
        cloned.setEmpno(102);
        cloned.setEname("Miller");

        original.getDepartment().setDname("Accounting");

        System.out.println("Original employee data : ");
        original.display();
        System.out.println();
        System.out.println("Cloned employee : ");
        cloned.display();
    }
}

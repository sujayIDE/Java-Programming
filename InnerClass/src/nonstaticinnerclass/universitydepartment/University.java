package nonstaticinnerclass.universitydepartment;

public class University {
    class Department{
        void displayDepartment()
        {
            System.out.println("University created....");
            System.out.println("Department created....");
        }
    }

    public static void main(String[] args) {
        University university=new University();
        University.Department ud=university.new Department();
        ud.displayDepartment();
    }
}

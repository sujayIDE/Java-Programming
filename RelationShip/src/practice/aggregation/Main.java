package practice.aggregation;

public class Main {
    public static void main(String[] args) {
        Teacher teacher=new Teacher(101,"Mohan");
        Department department=new Department(102,"IT",teacher);

        System.out.println(department);
    }
}

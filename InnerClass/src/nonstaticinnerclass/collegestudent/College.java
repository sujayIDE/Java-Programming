package nonstaticinnerclass.collegestudent;

public class College {

    class Student{
        void print()
        {
            System.out.println(" Student admitted into ABC College ");
        }
    }

    public static void main(String[] args) {
        College college=new College();
        College.Student cs=college.new Student();
        cs.print();
    }
}

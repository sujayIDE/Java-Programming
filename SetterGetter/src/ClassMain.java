public class ClassMain {
    public static void main(String[] args) {
        Test test=new Test(24,"Sujay",45000.0);
        System.out.println(test.getAge()+" "+test.getName()+" "+test.getSal());

        test.setAge(34);
        System.out.println(test.getAge());
    }
}

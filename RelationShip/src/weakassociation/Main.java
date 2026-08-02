package weakassociation;

public class Main {
    public static void main(String[] args) {
        Library library=new Library(101,"Aarambh");
        Student student1=new Student(101111,"Rohit",library);
        Student student2 = new Student(101112, "Amit", library);
        Student student3 = new Student(101113, "Priya", library);

        student1.display();
        System.out.println();

        student2.display();
        System.out.println();

        student3.display();
    }
}

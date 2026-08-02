package weakassociation;

public class Student {
    int studentId;
    String name;
    Library library;

    public Student(int studentId, String name,Library library) {
        this.studentId = studentId;
        this.name = name;
        this.library=library;
    }

    void display()
    {
        System.out.println("Student Id: "+studentId);
        System.out.println("Student Name: "+name);
        System.out.println("Library Id: "+library.getLibraryId());
        System.out.println("Library Name: "+library.getLibraryName());
    }

}

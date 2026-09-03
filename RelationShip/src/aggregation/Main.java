package aggregation;

public class Main {
    public static void main(String[] args) {
        Professor professor=new Professor(101,"Kumar","Maths");

        College college=new College("DYP",professor);

        System.out.println("College name : "+college.getCollegeName());
        System.out.println("Professor name : "+college.getProfessor().getProfessorName());
        System.out.println("Professor subject : "+college.getProfessor().getSubject());
//        System.out.println(professor.getProfessorName());
    }
}

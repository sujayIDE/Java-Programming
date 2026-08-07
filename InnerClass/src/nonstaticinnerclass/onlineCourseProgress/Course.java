package nonstaticinnerclass.onlineCourseProgress;

import java.util.Scanner;

public class Course {
    String course;
    int totalModules;

    public Course(String course, int totalModules) {
        this.course = course;
        this.totalModules = totalModules;
    }

    class Progress{
        void completeModule(int complete)
        {
            int remaining=totalModules-complete;

            System.out.println("Course : "+course);
            System.out.println("Completed : "+complete);
            System.out.println("Remaining : "+remaining);
            System.out.println("Completion : "+(complete*100)/totalModules);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Course Name : ");
        String name=sc.nextLine();

        System.out.println("Enter Modules : ");
        int module=sc.nextInt();

        System.out.println("Enter completed : ");
        int complete=sc.nextInt();

        Course course1=new Course(name,module);
        Course.Progress cp=course1.new Progress();
        cp.completeModule(complete);
    }
}

class Course{
    private String coursName;
    private int numSeatAvailable;

    public Course(String coursName, int numSeatAvailable) {
        this.coursName = coursName;
        this.numSeatAvailable = numSeatAvailable;
    }

    public synchronized void registerForCourse(int rollno)
    {
        try{
            if(numSeatAvailable-1<0)
            {
                throw new Exception("Sorry no seat avilable...");
            }
            numSeatAvailable-=1;
            System.out.println("Booking successfull: "+rollno);
            System.out.println("Available seats now: "+numSeatAvailable);
        }catch (Exception e){}
    }
}

class RegisterThread extends Thread{
    Course course;
    int rollno;

    public RegisterThread(Course course,int rollno)
    {
        this.course=course;
        this.rollno=rollno;
    }

    @Override
    public void run() {
        try
        {
            Thread.sleep(2000);
            course.registerForCourse(rollno);
        }catch (Exception e){}
    }
}
public class Synchronized_Method {
    public static void main(String[] args) {
        Course course=new Course("CSE",1);
        RegisterThread thread1=new RegisterThread(course,101);
        RegisterThread thread2=new RegisterThread(course,102);
        thread1.start();
        thread2.start();
    }
}

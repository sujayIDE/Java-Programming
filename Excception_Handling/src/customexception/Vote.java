package customexception;

public class Vote {
    int age;

    public Vote(int age) {
        this.age = age;
    }

    void eligibility()
    {
        if(age>=18)
        {
            System.out.println("you are eligible for vote");
        }else{
            throw new InvalidAge("Not Valid age...");
        }
    }
}

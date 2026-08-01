public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int temp=num;
        int count=0;

        while(temp>0)
        {
            temp/=10;
            count++;
        }

        int sum=0;
        int temp2=num;
        while(temp2>0)
        {
            int lastdigit=temp2%10;
            sum= (int) (sum+Math.pow(lastdigit,count));
            temp2/=10;
        }

        if(sum==num)
        {
            System.out.println("Armstrong number");
        }else {
            System.out.println("Not Armstrong");
        }
    }
}

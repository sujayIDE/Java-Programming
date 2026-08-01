public class Two_Sum {
    static void display_two_sum(int num[],int target){
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]+num[j]==target)
                {
                    System.out.println("Index:"+ i+" "+j);
                    System.out.println("Number :"+num[i]+" "+num[j]);
                }
            }
        }
        System.out.println("not found");
    }
    public static void main(String[] args) {
        int num[]={1,2,3,6,7,11,15};
        int target=9;
        display_two_sum(num,target);
    }
}

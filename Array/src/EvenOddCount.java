public class EvenOddCount {
    public static void main(String[] args) {
        int a[]={33,2,44,22,3,25};
        int evenCount=0, oddCount=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
            {
                evenCount+=1;
            }else{
                oddCount+=1;
            }
        }
        System.out.println("EvenCount="+evenCount);
        System.out.println("OddCount="+oddCount);

    }
}

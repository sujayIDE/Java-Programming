package lambda.evenNumber;

import java.util.Scanner;

public interface CheckEvenNumber {
    boolean check(int n);
}

interface Square {
    int calculate(int n);
}

interface NumberCheck {
    boolean check(int n);
}

class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
        int n=sc.nextInt();

        CheckEvenNumber c=num-> {
            if(num%2==0)
            {
                return true;
            }
            return false;
        };
        System.out.println(c.check(n));

        //square
        Square square=num->
                num*num;
        System.out.println("Square: "+square.calculate(n));

        //check positive
        NumberCheck numberCheck=num->
                 num>0;
        System.out.println("Positive : "+numberCheck.check(n));
    }
}

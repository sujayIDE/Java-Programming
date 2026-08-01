import java.util.Scanner;

public class Traingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int side1=sc.nextInt();
        System.out.print("Enter side 2: ");
        int side2=sc.nextInt();
        System.out.print("Enter side 3: ");
        int side3=sc.nextInt();

        if((side1+side2>side3) && (side1+side3>side2) && (side2+side3>side1)){
            if(side1==side2 && side2==side3)
            {
                System.out.println("Equilateral Triangle");
            }else if (side1==side2 && side2!=side3)
                System.out.println("Isosceles Triangle");
            else if (side1!=side2 && side2!=side3) {
                System.out.println("Scalene Triangle");
            }
        }
        else
            System.out.println("The triangle is not valid.");
    }
}

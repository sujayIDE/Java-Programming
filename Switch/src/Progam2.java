public class Progam2 {
    public static void main(String[] args) {
        int x=2,y=3;
        switch (++x + y++)
        {
            case 5:
                System.out.println("five");
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("Seven");
        }
    }
}

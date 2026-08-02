public class MethodOverloading {
    void area(int side)
    {
        System.out.println("Square area : "+(side*side));
    }

    void area(int height,int breadth){
        System.out.println("Rectangle are : "+(height*breadth));
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading=new MethodOverloading();
        methodOverloading.area(10);
        methodOverloading.area(10,20);
    }
}

package nonstaticinnerclass.librarybook;

public class Library {
    int bookCount=1500;

    class Book{
        void display()
        {
            System.out.println(bookCount);
        }
    }

    public static void main(String[] args) {
        Library library=new Library();
        Library.Book lb=library.new Book();
        lb.display();
    }
}

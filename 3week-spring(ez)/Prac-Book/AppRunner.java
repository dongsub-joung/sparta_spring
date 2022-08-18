import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        Book book_A= new Book("abc", 12, new Date(), "asdf");
        Book book_B= new Book("abc", 12, new Date(), "asdf");
        BookService bookService_A=new BookService(book_A);
        BookService bookService_B=new BookService(book_B);

        List<Book> bookList= new ArrayList<>();
        bookList.add(book_A);
        bookList.add(book_B);
    }
}

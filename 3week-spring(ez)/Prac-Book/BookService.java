public class BookService extends BookRepository {
    Book book;
    BookRepository bookRepository;

    public BookService(Book book) {
        this.book = book;
    }

    public Book update(Dto dto){
        Book book= new Book(dto);
        book.update(dto);
        return book;
    }

}

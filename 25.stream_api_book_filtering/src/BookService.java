import java.util.Arrays;

public class BookService {
    public Book[] filterBooksByAuthor(Author author, Book[] books) {
        return Arrays.stream(books)
                .filter(book -> Arrays.asList(book.authors).contains(author))
                .toArray(Book[]::new);
    }

    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
        return Arrays.stream(books)
                .filter(book -> book.publisher.equals(publisher))
                .toArray(Book[]::new);
    }

    // methods keeps books with publishing year inclusively.
    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        return Arrays.stream(books)
                .filter(book -> book.publishingYear >= yearFromInclusively)
                .toArray(Book[]::new);
    }
}

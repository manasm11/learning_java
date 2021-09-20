package spring5webapp.learn.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring5webapp.learn.domain.Author;
import spring5webapp.learn.domain.Book;
import spring5webapp.learn.repositories.AuthorRepository;
import spring5webapp.learn.repositories.BookRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    AuthorRepository authorRepository;
    BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    private void saveBookWithAuthor(String firstName, String lastName, String bookName, String isbn) {
        Author author = new Author(firstName, lastName);
        Book book = new Book(bookName, isbn);
        author.getBooks().add(book);
        book.getAuthors().add(author);
        bookRepository.save(book);
        authorRepository.save(author);
    }


    @Override
    public void run(String... args) throws Exception {
        saveBookWithAuthor("Manas", "Mishra", "OSSUM", "121231");
        saveBookWithAuthor("Homo", "Sepian", "Poori Duniya Pagal", "98318432");
        System.out.println("Number of books " + bookRepository.count());
    }
}

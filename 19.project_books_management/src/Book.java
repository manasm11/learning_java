import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

enum CoverType{Paperback, Hardcover}

public class Book {
    int id;
    String name;
    Author[] authors;
    Publisher publisher;
    int publishingYear;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return id == book.id && publishingYear == book.publishingYear && amountOfPages == book.amountOfPages && name.equals(book.name) && Arrays.equals(authors, book.authors) && publisher.equals(book.publisher) && price.equals(book.price) && coverType == book.coverType;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, publisher, publishingYear, amountOfPages, price, coverType);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }

    int amountOfPages;
    BigDecimal price;
    CoverType coverType;
}

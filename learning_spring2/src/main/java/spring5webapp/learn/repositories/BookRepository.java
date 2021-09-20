package spring5webapp.learn.repositories;

import org.springframework.data.repository.CrudRepository;
import spring5webapp.learn.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}

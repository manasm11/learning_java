package spring5webapp.learn.repositories;

import org.springframework.data.repository.CrudRepository;
import spring5webapp.learn.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

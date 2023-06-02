package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gd on 6/2/2023
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}

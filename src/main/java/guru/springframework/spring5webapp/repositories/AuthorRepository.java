package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gd on 6/2/2023
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}

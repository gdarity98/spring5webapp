package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gd on 6/5/2023
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}

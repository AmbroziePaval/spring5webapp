package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ambrozie on 29/09/2018
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}

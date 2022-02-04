package guru.springframwork.springwebapp.repositories;

import guru.springframwork.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface IAuthorRepository extends CrudRepository<Author,Long> {
}

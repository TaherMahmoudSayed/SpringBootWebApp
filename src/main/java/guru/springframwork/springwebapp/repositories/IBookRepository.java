package guru.springframwork.springwebapp.repositories;

import guru.springframwork.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface IBookRepository extends CrudRepository<Book,Long> {

}

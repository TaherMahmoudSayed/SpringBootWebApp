package guru.springframwork.springwebapp.bootstrap;

import guru.springframwork.springwebapp.domain.Author;
import guru.springframwork.springwebapp.domain.Book;
import guru.springframwork.springwebapp.repositories.IAuthorRepository;
import guru.springframwork.springwebapp.repositories.IBookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class BootStrapData implements CommandLineRunner {
    IAuthorRepository authorRepository;
    IBookRepository bookRepository;

    public BootStrapData(IAuthorRepository authorRepository, IBookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric=new Author("eric","evan");
        Book ddd=new Book("Domain driven design","1235");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        Author rod=new Author("rod","johnson");
        Book spring=new Book("spring Boot","152956");
        rod.getBooks().add(spring);
        spring.getAuthors().add(rod);
        authorRepository.saveAll(Arrays.asList(new Author[]{eric,rod} ));
        bookRepository.saveAll(Arrays.asList(new Book[]{ddd,spring} ));
        System.out.println(authorRepository.count());
        System.out.println( bookRepository.count());
        System.out.println( eric.equals(eric));
        System.out.println( eric.equals(eric));


    }
}

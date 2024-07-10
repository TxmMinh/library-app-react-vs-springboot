package springbootlibrary.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootlibrary.backend.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}

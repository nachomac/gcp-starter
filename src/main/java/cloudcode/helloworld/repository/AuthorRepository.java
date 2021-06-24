package cloudcode.helloworld.repository;

import cloudcode.helloworld.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository <Author, Long> {
}

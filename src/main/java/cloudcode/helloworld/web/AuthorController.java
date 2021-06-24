package cloudcode.helloworld.web;

import cloudcode.helloworld.entity.Author;
import cloudcode.helloworld.repository.AuthorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {
  @Autowired
  private AuthorRepository authorRepository;
  public AuthorController() {
    super();
  }
  // Read - get all
  @GetMapping
  public List<Author> getAllAuthors() {
    return (List<Author>) authorRepository.findAll();
  }


}

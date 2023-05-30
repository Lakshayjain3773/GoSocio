package goSocio.backend.repository;

import goSocio.backend.model.post.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post,String> {
    List<Post> findAllByAuthorId(String authorId);
}

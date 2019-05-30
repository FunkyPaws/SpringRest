package com.genise.repository;

import com.genise.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostRepository extends JpaRepository<Post, Long> {

    // custom query to search to blog post by title or content
    List<Post> findByTitleContainingOrContentContaining(String text, String textAgain);

}

package com.project.questapp.repos;

import com.project.questapp.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findByUserId(Long aLong);  // this is jpa repository advantage. userId located in Post entity and we can creat method with findBy
}

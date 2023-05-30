package com.project.questapp.repos;

import com.project.questapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// jpa repository for get all important methods(for ex: findAll())
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserName(String userName);
}

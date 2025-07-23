package com.springsecurity.custom_redirection.repository;

import com.springsecurity.custom_redirection.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

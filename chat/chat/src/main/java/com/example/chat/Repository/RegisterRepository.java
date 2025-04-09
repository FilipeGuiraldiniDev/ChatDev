package com.example.chat.Repository;

import com.example.chat.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<User, Long> {
    // Some methods are native of JPA repository
}

package com.example.demo.repositories;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<User, Long> {
}

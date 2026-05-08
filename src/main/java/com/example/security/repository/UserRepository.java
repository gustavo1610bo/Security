package com.example.security.repository;

import com.example.security.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<Produto, Long> {

    UserDetails findByUser(String Pro);
}

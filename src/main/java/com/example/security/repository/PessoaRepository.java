package com.example.security.repository;

import com.example.security.models.PessoaModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModels, Long> {
}

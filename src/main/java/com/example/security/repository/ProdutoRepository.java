package com.example.security.repository;

import com.example.security.models.ProdutoModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModels, Long> {
}

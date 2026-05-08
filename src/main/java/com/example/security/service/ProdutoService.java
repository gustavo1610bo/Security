package com.example.security.service;

import com.example.security.models.ProdutoModels;
import com.example.security.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoModels adicionar(ProdutoModels produtoModels){
        return produtoRepository.save(produtoModels);
    }

    public List<ProdutoModels> buscaTudo(){
        return produtoRepository.findAll();
    }

}

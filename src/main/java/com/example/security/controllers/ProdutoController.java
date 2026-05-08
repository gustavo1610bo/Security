package com.example.security.controllers;

import com.example.security.models.ProdutoModels;
import com.example.security.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/produtos_123Abacate.com@gov.br")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModels> findAll(){
        return  produtoService.findAll();
    }
    @PostMapping
    public ProdutoModels criarPessoa(@RequestBody ProdutoModels produtoModels){
        return  produtoService.adicionar(produtoModels);
    }

}

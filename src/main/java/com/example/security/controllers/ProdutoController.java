package com.example.security.controllers;

import com.example.security.models.ProdutoModels;
import com.example.security.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/mybols")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    public ProdutoModels adicionar(@RequestBody ProdutoModels produtoModels){
        return produtoService.adicionar(produtoModels);
    }
}

package com.example.security.controllers;

import com.example.security.models.PessoaModels;
import com.example.security.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/mybols")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    public PessoaModels<> add(@RequestBody PessoaModels pessoaModels){
        return pessoaService.adicionar(pessoaModels);
    }
}

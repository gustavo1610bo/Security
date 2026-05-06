package com.example.security.service;

import com.example.security.models.PessoaModels;
import com.example.security.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaModels adicionar(PessoaModels pessoaModels){
        return pessoaRepository.save(pessoaModels);
    }

    public List<PessoaModels> buscaTudo(){
        return pessoaRepository.findAll();
    }

    public PessoaModels buscaId(Long id){
        return pessoaRepository.findById(id).orElse(null);
    }

}

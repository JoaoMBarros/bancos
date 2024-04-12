package com.example.bancos.services;


import com.example.bancos.domains.Banco;
import com.example.bancos.repositories.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Faz a chamada do repository que vai conversar com o banco de dados e lógica de manipulação
@Service
public class BancoService {

    @Autowired
    private BancoRepository repository;


    public Optional<Banco> getSpecificBanco(Integer codigo) throws Exception {
        return repository.findBancoByCodigo(codigo);
    }

    public List<Banco> getAllBancos(){
        return repository.findAll();
    }
}
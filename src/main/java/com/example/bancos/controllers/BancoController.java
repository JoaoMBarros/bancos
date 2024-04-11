package com.example.bancos.controllers;

import com.example.bancos.domains.Banco;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/bancos")
public class BancoController {

    @GetMapping
    public ResponseEntity<List<Banco>> getAllBancos(){
        return 0;
    }
}

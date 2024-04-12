package com.example.bancos.controllers;

import com.example.bancos.domains.Banco;
import com.example.bancos.services.BancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/api/bancos")
@CrossOrigin(origins = "http://localhost:5173") // Cors que permite chamada externa de um client específico
public class BancoController {

    @Autowired
    private BancoService service;

    // Função que retorna todos os bancos
    @GetMapping
    public ResponseEntity<List<Banco>> getAllBancos(){
        return ResponseEntity.ok().body(this.service.getAllBancos());
    }

    // Funcao que retorna um banco especifico
    @GetMapping("/{codigo}")
    public ResponseEntity<Optional<Banco>> getSpecificBanco(@PathVariable Integer codigo) throws Exception {
        Optional<Banco> banco = this.service.getSpecificBanco(codigo);

        if (!banco.isEmpty()){
            return ResponseEntity.ok().body(banco);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

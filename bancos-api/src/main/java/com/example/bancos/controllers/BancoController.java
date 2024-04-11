package com.example.bancos.controllers;

import com.example.bancos.domains.Banco;
import com.example.bancos.services.BancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/bancos")
public class BancoController {

    @Autowired
    private BancoService service;

    @GetMapping
    public ResponseEntity<List<Banco>> getAllBancos(){
        return ResponseEntity.ok().body(this.service.getAllBancos());
    }

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

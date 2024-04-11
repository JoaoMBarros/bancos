package com.example.bancos.repositories;

import com.example.bancos.domains.Banco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Integer> {
    Optional<Banco> findBancoByCodigo(Integer codigo);
}

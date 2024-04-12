package com.example.bancos.domains;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

// Entidade do banco
@Entity(name="bancos")
@Table(name="bancos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Banco {
    @Id
    private Integer codigo;

    private String nome;
}

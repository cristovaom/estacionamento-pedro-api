package br.com.uniamerica.estacionamento.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@MappedSuperclass
public class AbstractEntity {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Getter
    @Column(name = "cadastro",nullable = false)
    public LocalDateTime cadastro;
    @Getter
    @Column(name = "edicao")
    public LocalDateTime edicao;
    @Getter
    @Setter
    @Column(name = "ativo")
    public boolean ativo;

    /**
     * Método automatico, executado no pré-cadastro dos dados
     */
    @PrePersist
    public void prePersist() {
        this.cadastro = LocalDateTime.now();
        this.ativo = true;
    }

    /**
     * Método automatico, executado no pré-edição dos dados
     */
    @PreUpdate
    public void preUpdate() {
        this.edicao = LocalDateTime.now();
    }


}

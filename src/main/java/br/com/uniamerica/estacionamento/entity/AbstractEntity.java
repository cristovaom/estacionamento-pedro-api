package br.com.uniamerica.estacionamento.entity;

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
    private Long id;
    @Getter
    @Column(name = "cadastro",nullable = false)
    private LocalDateTime cadastro;
    @Getter
    @Column(name = "edicao")
    private LocalDateTime edicao;
    @Getter
    @Setter
    @Column(name = "ativo")
    private boolean ativo;

    /**
     * Método automatico, executado no pré-cadastro dos dados
     */
    @PrePersist
    public void prePersist() {
        this.cadastro = LocalDateTime.now();
        this.ativo = true;
    }

    /**
     * Método automatico, executado no pré-edição dos dadosd
     */
    @PreUpdate
    public void preUpdate() {
        this.edicao = LocalDateTime.now();
    }
}

package br.com.uniamerica.estacionamento.dto;

import br.com.uniamerica.estacionamento.entities.AbstractEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class AbstractEntityDTO {
    @Getter
    @Setter
    public Long id;

    @Getter
    public LocalDateTime cadastro;
    @Getter
    public LocalDateTime edicao;
    @Getter
    @Setter
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

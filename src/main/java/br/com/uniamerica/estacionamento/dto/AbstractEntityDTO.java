package br.com.uniamerica.estacionamento.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class AbstractEntityDTO{

    @Getter
    private Long id;

    @Getter
    private LocalDateTime cadastro;
    @Getter
    private LocalDateTime edicao;
    @Getter
    @Setter
    @Column(name = "ativo")
    private boolean ativo;
    
    
}

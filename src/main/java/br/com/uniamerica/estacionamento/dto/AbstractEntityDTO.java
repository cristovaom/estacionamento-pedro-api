package br.com.uniamerica.estacionamento.dto;

import br.com.uniamerica.estacionamento.entities.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class AbstractEntityDTO {
    @Getter
    public Long id;

    @Getter
    public LocalDateTime cadastro;
    @Getter
    public LocalDateTime edicao;
    @Getter
    @Setter
    public boolean ativo;


}

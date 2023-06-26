package br.com.uniamerica.estacionamento.dto;

import lombok.Getter;
import lombok.Setter;

public class ModeloDTO extends AbstractEntityDTO{
    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private Long marcaId;

    public ModeloDTO(String nome, Long marcaId) {
        this.nome = nome;
        this.marcaId = marcaId;
    }
}

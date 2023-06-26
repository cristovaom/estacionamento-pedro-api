package br.com.uniamerica.estacionamento.dto;

import br.com.uniamerica.estacionamento.entities.Modelo;
import lombok.Getter;
import lombok.Setter;

public class ModeloDTO extends AbstractEntityDTO{
    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private Long marcaId;

    public ModeloDTO(Long id,String nome, Long marcaId) {
        this.id = id;
        this.nome = nome;
        this.marcaId = marcaId;
    }
    public ModeloDTO(Modelo entity) {
        id = entity.getId();
        nome = entity.getNome();
        marcaId = entity.getMarca().getId();
    }
}

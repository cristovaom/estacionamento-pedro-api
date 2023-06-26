package br.com.uniamerica.estacionamento.dto;

import br.com.uniamerica.estacionamento.entities.Modelo;
import lombok.Getter;
import lombok.Setter;

public class ModeloMarcaDTO extends AbstractEntityDTO{
    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private MarcaDTO marcaDTO;

    public ModeloMarcaDTO(String nome, MarcaDTO marcaDTO) {
        this.nome = nome;
        this.marcaDTO = marcaDTO;
    }

    public ModeloMarcaDTO(Modelo entity) {
        id = entity.getId();
        nome = entity.getNome();
        marcaDTO = new MarcaDTO(entity.getMarca());
    }
}

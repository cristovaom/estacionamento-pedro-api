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
    private MarcaDTO marca;

    public ModeloMarcaDTO(String nome, MarcaDTO marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public ModeloMarcaDTO(Modelo entity) {
        id = entity.getId();
        nome = entity.getNome();
        marca = new MarcaDTO(entity.getMarca());
    }
}

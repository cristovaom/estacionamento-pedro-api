package br.com.uniamerica.estacionamento.dto;

import br.com.uniamerica.estacionamento.entities.Marca;
import lombok.Getter;
import lombok.Setter;

public class MarcaDTO extends AbstractEntityDTO{

    @Getter
    @Setter
    private String nome;

    public MarcaDTO(Long id,String nome){
        this.id = id;
        this.nome = nome;
    }

    public MarcaDTO(Marca entity){
        id = entity.getId();
        cadastro = entity.getCadastro();
        edicao = entity.getEdicao();
        ativo = entity.isAtivo();
        nome = entity.getNome();
    }
}

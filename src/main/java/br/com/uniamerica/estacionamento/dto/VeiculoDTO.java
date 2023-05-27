package br.com.uniamerica.estacionamento.dto;

import br.com.uniamerica.estacionamento.entity.Cor;
import br.com.uniamerica.estacionamento.entity.Modelo;
import br.com.uniamerica.estacionamento.entity.Tipo;
import br.com.uniamerica.estacionamento.entity.Veiculo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;

public class VeiculoDTO extends AbstractEntityDTO{
    @Getter
    @NotBlank(message = "Placa não pode ser nula, por favor inserir uma placa valida!")
    @Size(min = 6,max = 10,message = "Erro tamanho no maximo de 6 a 10 caracteres!")
    @Pattern(regexp = "^[A-Z]{3}[0-9][0-9A-Z][0-9]{2}$", message = "Placa invalida! favor digitar uma placa valida!")
    private String placa;

    @Getter
    @NotNull(message = "Modelo não pode ser nulo!")
    private Modelo modelo;
    @Getter
    @NotNull(message = "Cor não pode ser invalida!")
    private Cor cor;
    @Getter
    @NotNull(message = "Ano invalido!")
    private int ano;

    @Getter
    @NotNull(message = "Tipo invalido!")
    private Tipo tipo;

    public VeiculoDTO(String placa, Modelo modelo, Cor cor, int ano, Tipo tipo) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.tipo = tipo;
    }

    public VeiculoDTO(Veiculo veiculo){
        placa = veiculo.getPlaca();
        modelo = veiculo.getModelo();
        cor = veiculo.getCor();
        ano = veiculo.getAno();
    }
}

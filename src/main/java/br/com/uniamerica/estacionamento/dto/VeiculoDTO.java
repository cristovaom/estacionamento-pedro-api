package br.com.uniamerica.estacionamento.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;

public class VeiculoDTO extends AbstractEntityDTO{
    @Getter
    @NotBlank(message = "Placa não pode ser nula, por favor inserir uma placa valida!")
    @Size(min = 6,max = 10,message = "Erro tamanho no maximo de 6 a 10 caracteres!")
    @Pattern(regexp = "^[A-Z]{3}[0-9][0-9A-Z][0-9]{2}$", message = "Placa invalida! favor digitar uma placa valida!")
    private String placa;
}

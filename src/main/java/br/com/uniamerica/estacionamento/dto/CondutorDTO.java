package br.com.uniamerica.estacionamento.dto;

import br.com.uniamerica.estacionamento.entity.Condutor;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;

public class CondutorDTO extends AbstractEntityDTO{
    @Getter
    @NotNull
    @NotEmpty
    @Pattern(regexp = "^(?![ ])(?!.*[ ]{2})((?:e|da|do|das|dos|de|d'|D'|la|las|el|los)\\s*?|(?:[A-Z][^\\s]*\\s*?)(?!.*[ ]$))+$",message = "Nome tem que ter no minimo 3 Caractecteres e no Maximo 50!, Favor nome e Sobrenome!")
    @Size(min = 3,max = 50)
    private String nome;

    @NotEmpty
    @NotNull(message = "CPF tem que ser valido! e não nulo!")
    @Size(min = 3,max = 20)
    @Getter
    private String cpf;
    @NotEmpty
    @Size(min = 3,max = 20)
    @NotNull(message = "Telefone tem que ter no minimo 3 Caracteres e no Maximo 20 E não pode ser nulo!")
    @Getter
    private String telefone;
    @Getter
    private Long tempoPago;
    @Getter
    private Long tempoDesconto;

    public CondutorDTO(String nome, String cpf, String telefone, Long tempoPago, Long tempoDesconto) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.tempoPago = tempoPago;
        this.tempoDesconto = tempoDesconto;
    }

    public CondutorDTO(Condutor condutor){
        nome = condutor.getNome();
        cpf = condutor.getCpf();
        telefone = condutor.getCpf();
        tempoPago = condutor.getTempoPago();
        tempoDesconto = condutor.getTempoDesconto();
    }
}

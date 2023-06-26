package br.com.uniamerica.estacionamento.dto;

import lombok.Getter;

public class FieldMessage {
    @Getter
    private String fileldName;
    @Getter
    private String message;

    public FieldMessage(String fileldName, String message) {
        this.fileldName = fileldName;
        this.message = message;
    }

}
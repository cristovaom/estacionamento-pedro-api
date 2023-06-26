package br.com.uniamerica.estacionamento.dto;

import lombok.Getter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError{
    @Getter
    public List<FieldMessage> errors = new ArrayList<>();


    public ValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public void addError(String fieldName,String message){
        errors.add(new FieldMessage(fieldName,message));
    }
}
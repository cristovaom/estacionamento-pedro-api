package br.com.uniamerica.estacionamento.dto;


import lombok.Getter;

import java.time.Instant;

public class CustomError {
    @Getter
    private Instant timestamp;
    @Getter
    private Integer status;
    @Getter
    private String error;
    @Getter
    private String path;

    public CustomError(Instant timestamp, Integer status, String error, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.path = path;
    }
}
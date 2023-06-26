package br.com.uniamerica.estacionamento.entities;

public enum Tipo {
    CARRO("CARRO"),
    MOTO("MOTO"),
    VAN("VAN");

    private final String value;

    private Tipo(String value){
        this.value=value;
    }
}

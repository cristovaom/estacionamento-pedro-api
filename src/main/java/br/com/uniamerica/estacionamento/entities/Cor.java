package br.com.uniamerica.estacionamento.entities;

public enum Cor {
    AMARELO("AMARELO"),
    AZUL("AZUL"),
    BEGE("BEGE"),
    BRANCA("BRANCA"),
    CINZA("CINZA"),
    DOURADA("DOURADA"),
    GRENÁ("GRENÁ"),
    LARANJA("LARANJA"),
    MARROM("MARROM"),
    PRATA("PRATA"),
    PRETA("PRETA"),
    ROSA("ROSA"),
    ROXA("ROXA"),
    VERDE("VERDE"),
    VERMELHA("VERMELHA"),
    FANTASIA("FANTASIA");

    private final String value;

    private Cor(String value){
        this.value=value;
    }
}

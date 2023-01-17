package com.dio.strategy;

public class Robo {

    //Classe que irá utilizar a estratégia

    private Comportamento comportamento;

    public void setStrategy(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }
}

package br.com.devinhouse.jogo.model;

import br.com.devinhouse.jogo.model.enums.Arma;

public abstract class Inimigo extends Personagem implements Atacante{

    private Arma arma;

    public Inimigo(int pontosDeSaude, int pontosDeAtaque, int pontosDeDefesa, Arma arma) {
        super(pontosDeSaude, pontosDeAtaque, pontosDeDefesa);
        this.arma = arma;
    }
}

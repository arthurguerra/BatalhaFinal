package br.com.devinhouse.jogo.model;

import br.com.devinhouse.jogo.model.enums.Arma;
import br.com.devinhouse.jogo.model.enums.Motivacao;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class Jogador extends Personagem implements Atacante{

    private String nome;
    private char sexo;
    private Motivacao motivacao;
    private Arma arma;
    private static final int SAUDE_MAXIMA_JOGADOR = 200;

    public Jogador(int ptsAtaque, int ptsDefesa, String nome, char sexo){

        super(SAUDE_MAXIMA_JOGADOR, ptsAtaque, ptsDefesa);
        this.nome = nome;
        this.sexo = sexo;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Motivacao getMotivacao() {
        return motivacao;
    }

    public void setMotivacao(Motivacao motivacao) {
        this.motivacao = motivacao;
    }
}

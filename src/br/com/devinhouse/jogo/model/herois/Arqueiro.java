package br.com.devinhouse.jogo.model.herois;

import br.com.devinhouse.jogo.model.Jogador;
import br.com.devinhouse.jogo.model.Personagem;
import br.com.devinhouse.jogo.model.enums.Arma;

public class Arqueiro extends Jogador {

    private static final int ATAQUE_ARQUEIRO = 18;
    private static final int DEFESA_ARQUEIRO = 13;

    public Arqueiro(String nome, char sexo, Arma arma) {
        super(ATAQUE_ARQUEIRO, DEFESA_ARQUEIRO, nome, sexo);
        try {
            if (arma.equals(Arma.arco) || arma.equals(Arma.besta)) {
                super.setArma(arma);
            } else {
                throw new IllegalArgumentException("A classe Arqueiro não pode usar "+arma.getDisplayName());
            }
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public String getMensagemAtaque() {
        if (this.getArma() == Arma.arco) {
            return "Você atacou com seu arco, a flecha atingiu e causou %d de dano no inimigo!";
        } else {
            return "Você atacou com sua besta, o vitore atingiu e causou %d de dano no inimigo!";
        }
    }
}

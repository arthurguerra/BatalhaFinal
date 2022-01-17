package br.com.devinhouse.jogo.model.herois;

import br.com.devinhouse.jogo.model.Jogador;
import br.com.devinhouse.jogo.model.Personagem;
import br.com.devinhouse.jogo.model.enums.Arma;

public class Paladino extends Jogador {

    private static final int ATAQUE_PALADINO = 13;
    private static final int DEFESA_PALADINO = 18;

    public Paladino(String nome, char sexo, Arma arma) throws IllegalArgumentException {
        super(ATAQUE_PALADINO, DEFESA_PALADINO, nome, sexo);
        try {
            if (arma.equals(Arma.martelo) || arma.equals(Arma.clava)) {
                super.setArma(arma);
            } else {
                throw new IllegalArgumentException("A classe Paladino não pode usar "+arma.getDisplayName());
            }
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public String getMensagemAtaque() {
        if (this.getArma() == Arma.martelo) {
            return "Você atacou com seu martelo e causou %d de dano no inimigo!";
        } else {
            return "Você atacou com sua clava e causou %d de dano no inimigo!";
        }
    }
}

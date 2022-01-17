package br.com.devinhouse.jogo.model.herois;

import br.com.devinhouse.jogo.model.Jogador;
import br.com.devinhouse.jogo.model.Personagem;
import br.com.devinhouse.jogo.model.enums.Arma;

public class Mago extends Jogador {

    private static final int ATAQUE_MAGO = 19;
    private static final int DEFESA_MAGO = 11;

    public Mago(String nome, char sexo, Arma arma) throws IllegalArgumentException {
        super(ATAQUE_MAGO, DEFESA_MAGO, nome, sexo);
        try {
            if (arma.equals(Arma.cajado) || arma.equals(Arma.livro_de_magias)) {
                super.setArma(arma);
            } else {
                throw new IllegalArgumentException("A classe Mago não pode usar "+arma.getDisplayName());
            }
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public String getMensagemAtaque() {
        if (this.getArma() == Arma.cajado) {
            return "Você atacou com seu cajado, lançando uma bola de fogo e causou %d de dano no inimigo!";
        } else {
            return "Você atacou absorvendo energia do livro com uma mão e liberando com a outra e causou %d de dano no inimigo!";
        }
    }
}

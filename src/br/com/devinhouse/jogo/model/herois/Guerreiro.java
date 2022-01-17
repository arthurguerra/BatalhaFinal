package br.com.devinhouse.jogo.model.herois;

import br.com.devinhouse.jogo.model.Jogador;
import br.com.devinhouse.jogo.model.Personagem;
import br.com.devinhouse.jogo.model.enums.Arma;

public class Guerreiro extends Jogador {

    private static final int ATAQUE_GUERREIRO = 15;
    private static final int DEFESA_GUERREIRO = 15;

    public Guerreiro(String nome, char sexo, Arma arma) throws IllegalArgumentException {
        super(ATAQUE_GUERREIRO, DEFESA_GUERREIRO, nome, sexo);
        try {
            if (arma.equals(Arma.espada) || arma.equals(Arma.machado)) {
                super.setArma(arma);
            } else {
                throw new IllegalArgumentException("A classe Guerreiro não pode usar "+arma.getDisplayName());
            }
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public String getMensagemAtaque() {
        if (this.getArma() == Arma.espada) {
            return "Você atacou com sua espada e causou %d de dano no inimigo!";
        } else {
            return "Você atacou com seu machado e causou %d de dano no inimigo!";
        }
    }
}

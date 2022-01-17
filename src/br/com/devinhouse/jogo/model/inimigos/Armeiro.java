package br.com.devinhouse.jogo.model.inimigos;

import br.com.devinhouse.jogo.model.Inimigo;
import br.com.devinhouse.jogo.model.Personagem;
import br.com.devinhouse.jogo.model.enums.Arma;

public class Armeiro extends Inimigo {

    private static final int SAUDE_MAXIMA_ARMEIRO = 100;
    private static final int ATAQUE_ARMEIRO = 10;
    private static final int DEFESA_ARMEIRO = 15;
    private static final Arma ARMA_ARMEIRO = Arma.espada;

    public Armeiro() {
        super(SAUDE_MAXIMA_ARMEIRO, ATAQUE_ARMEIRO, DEFESA_ARMEIRO, ARMA_ARMEIRO);
    }
}

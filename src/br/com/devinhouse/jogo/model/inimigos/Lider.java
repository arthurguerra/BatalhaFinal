package br.com.devinhouse.jogo.model.inimigos;

import br.com.devinhouse.jogo.model.Inimigo;
import br.com.devinhouse.jogo.model.Personagem;
import br.com.devinhouse.jogo.model.enums.Arma;

public class Lider extends Inimigo{

    private static final int SAUDE_MAXIMA_LIDER = 200;
    private static final int ATAQUE_LIDER = 15;
    private static final int DEFESA_LIDER = 15;
    private static final Arma ARMA_LIDER = Arma.machado_duplo;

    public Lider() {
        super(SAUDE_MAXIMA_LIDER, ATAQUE_LIDER, DEFESA_LIDER, ARMA_LIDER);
    }

    @Override
    public void atacar(Personagem alvo) {

    }
}

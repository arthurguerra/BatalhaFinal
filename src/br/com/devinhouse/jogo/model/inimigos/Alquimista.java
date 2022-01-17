package br.com.devinhouse.jogo.model.inimigos;

import br.com.devinhouse.jogo.model.Inimigo;
import br.com.devinhouse.jogo.model.Personagem;
import br.com.devinhouse.jogo.model.enums.Arma;

public class Alquimista extends Inimigo {

    private static final int SAUDE_MAXIMA_ALQUIMISTA = 100;
    private static final int ATAQUE_ALQUIMISTA = 15;
    private static final int DEFESA_ALQUIMISTA = 10;
    private static final Arma ARMA_ALQUIMISTA = Arma.cajado;

    public Alquimista() {
        super(SAUDE_MAXIMA_ALQUIMISTA, ATAQUE_ALQUIMISTA, DEFESA_ALQUIMISTA, ARMA_ALQUIMISTA);
    }
}

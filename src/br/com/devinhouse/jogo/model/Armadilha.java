package br.com.devinhouse.jogo.model;

import br.com.devinhouse.jogo.model.enums.Arma;

public class Armadilha implements Atacante{

    private int pontosDeAtaque;
    private Arma arma;

    public Armadilha() {
        this.pontosDeAtaque = 5;
        this.arma = Arma.armadilha;
    }

    @Override
    public void atacar(Personagem alvo) {

        int danoCausado, dado;

        dado = Dado.rolarDadoDeDez();

        if (dado == 1) {
            System.out.println("O ataque da armadilha pegou de raspão e você não sofreu dano.");
            danoCausado = 0;
        } else {
            danoCausado = this.pontosDeAtaque + this.arma.getValorAtaqueArma() + dado;
            danoCausado -= alvo.getPontosDeDefesa();
            alvo.recebeDano(danoCausado);
            System.out.printf("Você sofreu %d de dano e agora possui %d pontos de vida.", danoCausado, alvo.getPontosDeSaude());
        }
    }
}

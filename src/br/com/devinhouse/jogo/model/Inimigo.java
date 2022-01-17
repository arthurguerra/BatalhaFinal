package br.com.devinhouse.jogo.model;

import br.com.devinhouse.jogo.model.enums.Arma;

public abstract class Inimigo extends Personagem implements Atacante{

    private Arma arma;

    public Inimigo(int pontosDeSaude, int pontosDeAtaque, int pontosDeDefesa, Arma arma) {
        super(pontosDeSaude, pontosDeAtaque, pontosDeDefesa);
        this.arma = arma;
    }

    @Override
    public void atacar(Personagem alvo) {
        String mensagem = "";
        int dado = Dado.rolarDadoDeDez();
        int danoCausado;
        if (dado == 1) {
            mensagem = "O inimigo errou o ataque! Você não sofreu dano.";
        } else if (dado == 20) {
            danoCausado = this.getPontosDeAtaque() + this.arma.getValorAtaqueArma() + dado;
            alvo.recebeDano(danoCausado);
            mensagem = String.format("O inimigo acertou um ataque crítico! Você sofreu %d de dano e agora possui %d pontos de vida.", danoCausado, alvo.getPontosDeSaude());
        } else {
            danoCausado = this.getPontosDeAtaque() + this.arma.getValorAtaqueArma() + dado - alvo.getPontosDeDefesa();
            alvo.recebeDano(danoCausado);
            mensagem = String.format("O inimigo atacou! Você sofreu %d de dano e agora possui %d pontos de vida.", danoCausado, alvo.getPontosDeSaude());
        }
        System.out.println(mensagem);
    }
}

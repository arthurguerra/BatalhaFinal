package br.com.devinhouse.jogo.model;

import br.com.devinhouse.jogo.model.enums.Arma;
import br.com.devinhouse.jogo.model.enums.Motivacao;

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

    public abstract String getMensagemAtaque();

    public String getMensagemMotivacao() {
        String mensagem = "Você não estava preparado para a força do inimigo. ";
        if (this.motivacao == Motivacao.vinganca) {
            mensagem += "Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.";
        } else {
            String mensagemSexo;
            mensagemSexo = this.sexo == 'm' ? "seu próximo herói." : "sua próxima heroina.";
            mensagem += "A glória que buscavas não será sua, e a cidade aguarda por "+mensagemSexo;
        }
        return mensagem;
    }

    @Override
    public void atacar(Personagem alvo) {
        int danoCausado;
        String mensagem = "";
        int dado = Dado.rolarDadoDeDez();
        if (dado == 1) {
            mensagem += "Você errou seu ataque! O inimigo não sofreu dano algum.";
        } else {
            if (dado == 20) {
                danoCausado = this.getPontosDeAtaque() + this.arma.getValorAtaqueArma() + dado;
                mensagem += "Você acertou um ataque crítico! ";
            } else {
                danoCausado = this.getPontosDeAtaque() + this.arma.getValorAtaqueArma() + dado - alvo.getPontosDeDefesa();
            }
            alvo.recebeDano(danoCausado);
            mensagem += this.getMensagemAtaque();
            mensagem += String.format(" O inimigo agora possui %d pontos de vida.%n", alvo.getPontosDeSaude());
            System.out.printf(mensagem, danoCausado);
        }
    }
}

package br.com.devinhouse.jogo.model;

public abstract class Personagem {
    private int pontosDeSaude;
    private int pontosDeAtaque;
    private int pontosDeDefesa;

    public Personagem(int pontosDeSaude, int pontosDeAtaque, int pontosDeDefesa) {

        this.pontosDeSaude = pontosDeSaude;
        this.pontosDeAtaque = pontosDeAtaque;
        this.pontosDeDefesa = pontosDeDefesa;
    }

    public int getPontosDeDefesa() {
        return pontosDeDefesa;
    }

    public int getPontosDeSaude() {
        return pontosDeSaude;
    }

    public void recebeDano(int dano) {
        this.pontosDeSaude -= dano;
    }
}

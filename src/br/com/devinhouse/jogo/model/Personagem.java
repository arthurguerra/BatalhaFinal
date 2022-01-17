package br.com.devinhouse.jogo.model;

public abstract class Personagem {
    private int pontosDeSaude;
    private int pontosDeAtaque;
    private int pontosDeDefesa;
    private boolean estaVivo;

    public Personagem(int pontosDeSaude, int pontosDeAtaque, int pontosDeDefesa) {

        this.pontosDeSaude = pontosDeSaude;
        this.pontosDeAtaque = pontosDeAtaque;
        this.pontosDeDefesa = pontosDeDefesa;
        this.estaVivo = true;
    }

    public int getPontosDeSaude() {
        return pontosDeSaude;
    }

    public int getPontosDeAtaque() {
        return pontosDeAtaque;
    }

    public int getPontosDeDefesa() {
        return pontosDeDefesa;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void recebeDano(int dano) {
        if (this.pontosDeSaude - dano <= 0) {
            this.pontosDeSaude = 0;
            this.estaVivo = false;
        } else {
            this.pontosDeSaude -= dano;
        }
    }

    public void setPontosDeDefesa(int pontosDeDefesa) {
        this.pontosDeDefesa += pontosDeDefesa;
    }

    public void setPontosDeSaude(int pontosDeSaude) {
        this.pontosDeSaude = pontosDeSaude;
    }
}

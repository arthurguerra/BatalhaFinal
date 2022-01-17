package br.com.devinhouse.jogo.model.enums;

public enum Motivacao implements StringValueEnum{

    vinganca("vinganca", "Vinganca"),
    gloria("gloria", "Glória");

    private String idMotivacao;
    private String descricaoMotivacao;

    Motivacao(String idMotivacao, String descricaoMotivacao) {
        this.idMotivacao = idMotivacao;
        this.descricaoMotivacao = descricaoMotivacao;
    }

    @Override
    public String getValue() {
        return idMotivacao;
    }

    @Override
    public String getDisplayName() {
        return descricaoMotivacao;
    }
}

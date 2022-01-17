package br.com.devinhouse.jogo.model.enums;

public enum Classe implements StringValueEnum{
    ARQUEIRO("arqueiro", "Arqueiro"),
    GUERREIRO("guerreiro", "Guerreiro"),
    MAGO("mago", "Mago"),
    PALADINO("paladino", "Paladino");

    private String idClasse;
    private String descricaoClasse;

    Classe(String idClasse, String descricaoClasse) {
        this.idClasse = idClasse;
        this.descricaoClasse = descricaoClasse;
    }

    @Override
    public String getValue() {
        return idClasse;
    }

    @Override
    public String getDisplayName() {
        return descricaoClasse;
    }
}

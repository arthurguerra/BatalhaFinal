package br.com.devinhouse.jogo.model.enums;

public enum Arma implements StringValueEnum{

    espada("espada", "Espada", "jogador", 5),
    machado("machado", "Machado", "jogador", 5),
    martelo("martelo", "Martelo", "jogador", 5),
    clava("clava", "Clava", "jogador", 5),
    arco("arco", "Arco", "jogador", 5),
    besta("besta", "Besta", "jogador", 5),
    cajado("cajado", "Cajado", "jogador", 5),
    livro_de_magias("livro_de_magias", "Livro de Magias", "jogador", 5),
    armadilha("armadilha", "Armadilha", "armadilha", 2),
    machado_duplo("machado_duplo", "Machado Duplo", "lider", 7);

    private String idArma;
    private String descricaoArma;
    private String tipoArma;
    private int valorAtaqueArma;

    Arma(String idArma, String descricaoArma, String tipoArma, int valorAtaqueArma) {
        this.idArma = idArma;
        this.descricaoArma = descricaoArma;
        this.tipoArma = tipoArma;
        this.valorAtaqueArma = valorAtaqueArma;
    }

    @Override
    public String getValue() {
        return idArma;
    }

    @Override
    public String getDisplayName() {
        return descricaoArma;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public int getValorAtaqueArma() {
        return valorAtaqueArma;
    }
}

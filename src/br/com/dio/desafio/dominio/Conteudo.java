package br.com.dio.desafio.dominio;

public abstract class  Conteudo {
    protected static final double XP_PADRAO = 15d;

    private String titulo;
    private String descricacao;

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricacao() {
        return descricacao;
    }

    public void setDescricacao(String descricacao) {
        this.descricacao = descricacao;
    }
}

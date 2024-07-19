package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    //Atributos da Classe

    private String titulo;
    private String descricacao;
    private LocalDate data;

    public Mentoria() {
    }

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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricacao='" + descricacao + '\'' +
                ", data=" + data +
                '}';
    }
}

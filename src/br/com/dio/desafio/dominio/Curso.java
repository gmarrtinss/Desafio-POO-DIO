package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    //Atributos da Classe
    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "br.com.dio.desafio.dominio.Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricacao='" + getDescricacao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}

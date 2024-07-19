import br.com.dio.desafio.dominio.Conteudo;

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
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricacao='" + getDescricacao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}

import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricacao("Curso sobre Java: Do Basico ao Avancado");
        curso1.setCargaHoraria(100);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricacao("Curso sobre Python: Do Basico ao Avancado");
        curso2.setCargaHoraria(50);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria sobre mercado de trabalho");
        mentoria1.setDescricacao("Mentoria voltada para os jovens buscando insercao no mercado de trabalho");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

    }



}
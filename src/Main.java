import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;
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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Back-End 2024");
        bootcamp.setDescricao("Bootcamp Java do Basico ao Avancado: POO e Banco de Dados");
        bootcamp.getConteudosBoot().add(curso1);
        bootcamp.getConteudosBoot().add(curso2);
        bootcamp.getConteudosBoot().add(mentoria1);

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme Martins");
        devGuilherme.inscreverBootCamp(bootcamp);
        System.out.println(devGuilherme.getNome() + " Matriculado em: " + devGuilherme.getConteudosInscritos());
        devGuilherme.avancar();
        System.out.println(devGuilherme.getNome() + " Matriculado em: " + devGuilherme.getConteudosInscritos());
        System.out.println("Conteudos concluidos de " + devGuilherme.getNome() + " " + devGuilherme.getConteudosConcluidos());


        System.out.println("---");

        Dev devJulia = new Dev();
        devJulia.inscreverBootCamp(bootcamp);
        devJulia.setNome("Julia");
        System.out.println(devJulia.getNome() + " Matriculado em: " + devJulia.getConteudosInscritos());
        devJulia.avancar();
        System.out.println(devJulia.getNome() + " Matriculado em: " + devJulia.getConteudosInscritos());
        System.out.println("Conteudos concluidos de " + devJulia.getNome() + " " + devJulia.getConteudosConcluidos());





    }



}
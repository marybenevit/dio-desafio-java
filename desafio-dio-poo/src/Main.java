import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Este é um curso de Java.");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Este é um curso de Java.");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Esta é uma mentoria de Java.");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(curso1);
//        System.out.println(mentoria);
//
//        Conteudo conteudo = new Curso();
//        Conteudo conteudo2 = new Mentoria();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Maria");
        System.out.println("Conteúdos inscritos:" + dev.getConteudosInscritos());

        Dev dev1 = new Dev();
        dev1.setNome("João");
        System.out.println("Conteúdos inscritos:" + dev1.getConteudosInscritos());
    }
}

import br.com.dio.desafioPOO.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("curso Java");
        cursoJava.setDescricao("Curso de Java para iniciantes");
        cursoJava.setCargaHoraria(10);

        Curso cursoPython = new Curso();
        cursoPython.setTitulo("curso Python");
        cursoPython.setDescricao("Introdução ao Python");
        cursoPython.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Tirando dúvidas e esclarecendo os principais conceitos de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda os conceitos de Java do básico ao intermediário!!");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPython);
        bootcamp.getConteudos().add(mentoria);

        Dev devNathalia = new Dev();
        devNathalia.setNome("Nathalia Grott");
        devNathalia.inscricaoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Nathalia: " + devNathalia.getConteudosInscritos());
        devNathalia.progrecao();
        devNathalia.progrecao();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos de Nathalia: " + devNathalia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Nathalia: " + devNathalia.getConteudosConcluidos());
        System.out.println("XP: " + devNathalia.totalXp());

        System.out.println("----------------------------");

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo Albuquerque");
        devRodrigo.inscricaoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Rodrigo: " + devRodrigo.getConteudosInscritos());
        devRodrigo.progrecao();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos de Rodrigo: " + devRodrigo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Rodrigo: " + devRodrigo.getConteudosConcluidos());
        System.out.println("XP: " + devRodrigo.totalXp());
    }
}

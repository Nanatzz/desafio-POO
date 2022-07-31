import br.com.dio.desafioPOO.Curso;
import br.com.dio.desafioPOO.Mentoria;

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

        System.out.println(cursoJava);
        System.out.println(cursoPython);
        System.out.println(mentoria);
    }
}

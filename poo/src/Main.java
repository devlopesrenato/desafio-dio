import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso crusoJava = new Curso();
        crusoJava.setTitulo("Curso java");
        crusoJava.setDescricao("Descrição do curso de java");
        crusoJava.setCargaHoraria(15);

        Curso crusoJavaScript = new Curso();
        crusoJavaScript.setTitulo("Curso JavaScript");
        crusoJavaScript.setDescricao("Descrição do curso de JavaScript");
        crusoJavaScript.setCargaHoraria(10);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Descrição da mentoria de Java");
        mentoriaJava.setData(LocalDate.now());

        System.out.println(crusoJava);
        System.out.println(crusoJavaScript);
        System.out.println(mentoriaJava);

        Bootcamp bootcampJavaDev = new Bootcamp();
        bootcampJavaDev.setNome("Bootcamp Dio Java Developer");
        bootcampJavaDev.setDescricao("Descrição Bootcamp Dio Java Developer");
        bootcampJavaDev.getConteudos().add(crusoJava);
        bootcampJavaDev.getConteudos().add(crusoJavaScript);
        bootcampJavaDev.getConteudos().add(mentoriaJava);

        System.out.println("#####################");

        Dev devRenato = new Dev();
        devRenato.setNome("Renato");
        devRenato.inscreverBootcamp(bootcampJavaDev);
        System.out.println("Conteúdos Inscritos Renato:" + devRenato.getConteudosInscritos());
        devRenato.progredir();
        devRenato.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Renato:" + devRenato.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Renato:" + devRenato.getConteudosConcluidos());
        System.out.println("XP:" + devRenato.calcularTotalXp());

        System.out.println("#####################");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcampJavaDev);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
package br.com.dio.desafio.dominio;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        // Criando cursos
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        // Definindo os cursos
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        // Criando mentoria
        Mentoria mentoria = new Mentoria();

        // Definindo a mentoria
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        // Criando o Bootcamp
        Bootcamp bootcamp = new Bootcamp();

        // Definindo o Bootcamp
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Criando os Devs
        Dev devCaio = new Dev();
        Dev devBeatriz = new Dev();

        // Definindo os Devs
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println(devCaio.getNome()+ " inscreveu-se no Bootcamp");
        devBeatriz.setNome("Beatriz");
        devBeatriz.inscreverBootcamp(bootcamp);
        System.out.println(devBeatriz.getNome()+ " inscreveu-se no Bootcamp");

        // Exibindo os conteúdos inscritos de cada Dev
        System.out.println("Conteúdos Inscritos de " + devCaio.getNome() + ": " + devCaio.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos de " + devBeatriz.getNome() + ": " + devBeatriz.getConteudosInscritos());

        // Exibindo os conteúdos concluídos de cada Dev
        System.out.println("Conteúdos Concluídos de " + devCaio.getNome() + ": " + devCaio.getConteudosConcluidos());
        System.out.println("Conteúdos Concluídos de " + devBeatriz.getNome() + ": " + devBeatriz.getConteudosConcluidos());

        // Progredindo nos conteúdos
        devCaio.progredir();
        System.out.println(devCaio.getNome()+ " está progredindo no Bootcamp");
        devCaio.progredir();
        System.out.println(devCaio.getNome()+ " está progredindo no Bootcamp");
        devBeatriz.progredir();
        System.out.println(devBeatriz.getNome()+ " está progredindo no Bootcamp");
        devBeatriz.progredir();
        System.out.println(devBeatriz.getNome()+ " está progredindo no Bootcamp");
        devBeatriz.progredir();
        System.out.println(devBeatriz.getNome()+ " está progredindo no Bootcamp");

        // Exibindo os conteúdos inscritos de cada Dev
        System.out.println("Conteúdos Inscritos de " + devCaio.getNome() + ": " + devCaio.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos de " + devBeatriz.getNome() + ": " + devBeatriz.getConteudosInscritos());

        // Exibindo os conteúdos concluídos de cada Dev
        System.out.println("Conteúdos Concluídos de " + devCaio.getNome() + ": " + devCaio.getConteudosConcluidos());
        System.out.println("Conteúdos Concluídos de " + devBeatriz.getNome() + ": " + devBeatriz.getConteudosConcluidos());

        // Exibindo a quantidade de XP de cada Dev
        System.out.println("Quantidade de XP de "+ devCaio.getNome() + ": " + devCaio.calcularTotalXP());
        System.out.println("Quantidade de XP de "+ devBeatriz.getNome() + ": " + devBeatriz.calcularTotalXP());

        // Desinscrevendo um Dev do Bootcamp
        devCaio.desinscreverBootcamp(bootcamp);
        System.out.println(devCaio.getNome()+ " desinscreveu-se do Bootcamp");

        // Gerando certificado
        System.out.println(devBeatriz.gerarCertificado(bootcamp));


    }
}

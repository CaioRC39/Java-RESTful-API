package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    // Atributo
    private Set<Aluno> alunos;

    // Método Construtor
    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    // Adicionar um aluno ao conjunto
    public void adicionarAluno(String nome, Long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    // Remover um aluno do conjunto a partir da matricula, se estiver presente
    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoParaRemover = null;
        if(!alunos.isEmpty()) {
            for(Aluno a : alunos) {
                if(a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunos.remove(alunoParaRemover);
        } else {
            System.out.println("Não há alunos para remover");
        }

        if(alunoParaRemover == null) {
            System.out.println("Matrícula não encontrada");
        }
    }

    // Exibe todos os alunos do conjunto em ordem alfabética pelo nome
    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        return alunosPorNome;
    }

    // Exibe todos os alunos do conjunto em ordem crescente de nota
    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunos);
        return alunosPorNota;
    }

    public Set<Aluno> exibirAlunos() {
        return alunos;
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
    
        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        System.out.println("Adicionando aluno...");
        
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        System.out.println("Adicionando aluno...");

        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        System.out.println("Adicionando aluno...");

        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);
        System.out.println("Adicionando aluno...");
    
        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunos);
    
        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAlunoPorMatricula(000L);
        System.out.println("Removendo aluno...");
        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
        System.out.println("Removendo aluno...");
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunos);
    
        // Exibindo alunos ordenados por nome
        System.out.println("Exibindo alunos por ordem alfabética: " + gerenciadorAlunos.exibirAlunosPorNome());
    
        // Exibindo alunos ordenados por nota
        System.out.println("Exibindo alunos por ordem alfabética: " + gerenciadorAlunos.exibirAlunosPorNota());
      }

}

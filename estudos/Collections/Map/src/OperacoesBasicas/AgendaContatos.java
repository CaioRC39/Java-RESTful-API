package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // Atributo
    private Map<String, Integer> agenda;

    // Método Construtor
    public AgendaContatos() {
        this.agenda = new HashMap<>();
    }

    // Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente
    public void adicionarContato(String nome, Integer telefone) {
        agenda.put(nome, telefone);
    }

    // Remove um contato da agenda, dado o nome do contato
    public void removerContato(String nome) {
        if(!agenda.isEmpty()) {
            agenda.remove(nome);
        } else {
            System.out.println("A agenda de contatos está vazia");
        }
    }

    // Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato
    public void exibirContatos() {
        System.out.println(agenda);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agenda.isEmpty()) {
            numeroPorNome = agenda.get(nome);
        } else {
            System.out.println("A agenda de contatos está vazia");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
    
        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        System.out.println("Adicionando contato...");

        agendaContatos.adicionarContato("João", 5665);
        System.out.println("Adicionando contato...");

        agendaContatos.adicionarContato("Carlos", 1111111);
        System.out.println("Adicionando contato...");

        agendaContatos.adicionarContato("Ana", 654987);
        System.out.println("Adicionando contato...");

        agendaContatos.adicionarContato("Maria", 1111111);
        System.out.println("Adicionando contato...");

        agendaContatos.adicionarContato("Camila", 44444);
        System.out.println("Adicionando contato...");

        System.out.println("Exibindo contatos:");
        agendaContatos.exibirContatos();
    
        // Remover um contato
        agendaContatos.removerContato("Maria");
        System.out.println("Removendo contato...");

        System.out.println("Exibindo contatos:");
        agendaContatos.exibirContatos();
    
        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);
    
        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
      }
}

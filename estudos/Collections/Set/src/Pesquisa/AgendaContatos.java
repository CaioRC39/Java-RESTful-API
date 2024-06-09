package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // Atributo
    private Set<Contato> agenda;

    // Método Construtor
    public AgendaContatos() {
        this.agenda = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        agenda.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(agenda);
    }
    
    public Set<Contato> pesquisarPorNome(String palavra) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato contato : agenda) {
            if(contato.getNome().startsWith(palavra)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato contato : agenda) {
            if(contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        System.out.println("Exibindo contatos:");
        agendaContatos.exibirContatos();

        // Adicionando Contatos
        agendaContatos.adicionarContato("Camila", 123456);
        System.out.println("Adicionando contato...");
        
        agendaContatos.adicionarContato("Camila", 0);
        System.out.println("Adicionando contato...");

        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        System.out.println("Adicionando contato...");

        agendaContatos.adicionarContato("Camila DIO", 654987);
        System.out.println("Adicionando contato...");

        agendaContatos.adicionarContato("Maria Silva", 1111111);
        System.out.println("Adicionando contato...");

        
        System.out.println("Exibindo contatos:");
        agendaContatos.exibirContatos();

        System.out.println("Pesquisando por nome: " + agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 5555555));

        System.out.println("Exibindo contatos:");
        agendaContatos.exibirContatos();
    }
}

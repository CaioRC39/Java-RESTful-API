package Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    // Atributo
    private Map<LocalDate, Evento> eventos;

    // Método Construtor
    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    // Adiciona um evento à agenda
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventos.put(data, new Evento(nome, atracao));
    }

    // Exibe a agenda de eventos em ordem crescente de data
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
        System.out.println(eventosTreeMap);
    }

    // Retorna o próximo evento que ocorrerá
    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    // Adiciona eventos à agenda
    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
    System.out.println("Adicionando evento à agenda...");

    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
    System.out.println("Adicionando evento à agenda...");

    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
    System.out.println("Adicionando evento à agenda...");

    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
    System.out.println("Adicionando evento à agenda...");

    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
    System.out.println("Adicionando evento à agenda...");

    // Exibe a agenda completa de eventos
    System.out.println("Exibindo a agenda de eventos:");
    agendaEventos.exibirAgenda();

    // Obtém e exibe o próximo evento na agenda
    System.out.println("Obtendo o próximo evento na agenda:");
    agendaEventos.obterProximoEvento();
    }
}

package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    // Atributo
    private List<Tarefa> tarefaList;

    // Método Construtor
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    // Adicionar tarefa
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // Remover tarefa
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>(); // Cria uma lista de tarefas para serem removidas, para, posteriormente, remover tudo de uma vez
        for (Tarefa t : tarefaList) { // Laço for para "rodar" a lista principal (tarefaList) e acrescentar à lista tarefasParaRemover
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover); // Removendo as tarefas selecionadas
    }

    // Obter número total de tarefas
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    // Obter as descrições das tarefas
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println("Adicionando tarefa...");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println("Adicionando tarefa...");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("Adicionando tarefa...");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("Removendo tarefas...");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
    }
}

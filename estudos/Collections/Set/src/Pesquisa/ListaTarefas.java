package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    // Atributo
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao, false));
    }
    
    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if(!tarefas.isEmpty()) {
            for(Tarefa t : tarefas) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefas.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }

        if(tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada");
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefas);
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefas) {
            if(t.isConclusao()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t: tarefas) {
            if(!t.isConclusao()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String descricao) {
        Tarefa tarefaMarcadaConcluida = null;
        for(Tarefa t : tarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConclusao(true);
                tarefaMarcadaConcluida = t;
            }
        }
        return tarefaMarcadaConcluida;
    }

    public Tarefa marcarTarefaPendente(String descricao) {
        Tarefa tarefaMarcadaPendente = null;
        for(Tarefa t : tarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConclusao(false);
                tarefaMarcadaPendente = t;
            }
        }
        return tarefaMarcadaPendente;
    }

    public void limparListaTarefas() {
        tarefas.clear();
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();
    
        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");
    
        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();
    
        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();
    
        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());
    
        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());
    
        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
    
        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());
    
        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();
    
        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
      }
}

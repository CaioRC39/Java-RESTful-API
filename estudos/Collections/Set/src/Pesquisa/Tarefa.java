package Pesquisa;

public class Tarefa {
    // Atributos
    private String descricao;
    private boolean conclusao;
    
    // Método construtor
    public Tarefa(String descricao, boolean conclusao) {
        this.descricao = descricao;
        this.conclusao = conclusao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConclusao() {
        return conclusao;
    }

    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", conclusao=" + conclusao + "]";
    }   
}

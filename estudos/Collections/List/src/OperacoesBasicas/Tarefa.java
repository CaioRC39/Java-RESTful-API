package OperacoesBasicas;
public class Tarefa {
    // Atributo
    private String descricao;

    // Método Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // get
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + "]";
    }
}

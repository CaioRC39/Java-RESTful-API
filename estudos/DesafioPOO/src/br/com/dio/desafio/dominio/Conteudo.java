package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    // Atributos
    protected static final double XP_PADRAO = 10d;

    protected String titulo;
    protected String descricao;    

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método
    public abstract double calcularXP();
    
}

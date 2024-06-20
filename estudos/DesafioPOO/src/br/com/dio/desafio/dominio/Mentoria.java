package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    //Atributos
    private LocalDate data;
    
    // Getter
    public LocalDate getData() {
        return data;
    }

    // Setter   
    public void setData(LocalDate data) {
        this.data = data;
    }

    // Método
    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
    
    // Formatação
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

    
}

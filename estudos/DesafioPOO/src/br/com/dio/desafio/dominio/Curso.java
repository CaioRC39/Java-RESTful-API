package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    //Atributos
    private int cargaHoraria;
    
    // Getter
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    // Setter
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Método
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    // Formatação
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }

    
}

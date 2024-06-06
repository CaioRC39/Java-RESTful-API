package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // Atributo
    private List<Livro> catalogo;

    // Método Construtor
    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    // Adicionar livro
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        catalogo.add(new Livro(titulo, autor, anoPublicacao));
    }

    // Pesquisar por autor
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> autoresLivros = new ArrayList<>();
        if(!catalogo.isEmpty()) {
            for(Livro autores : catalogo) {
                if(autores.getAutor().equalsIgnoreCase(autor)) {
                    autoresLivros.add(autores);
                }
            }
        }
        return autoresLivros;
    }

    // Pesquisar por intervalor de tempo (ano)
    public List<Livro> pesquisarPorIntevaloAnos(int anoInicial, int anoFinal) {
        List<Livro> anoLivros = new ArrayList<>();
        if(!catalogo.isEmpty()) {
            for(Livro ano : catalogo) {
                if(ano.getAnoPublicacao() >= anoInicial && ano.getAnoPublicacao() <= anoFinal) {
                    anoLivros.add(ano);
                }
            }
        }
        return anoLivros;
    }

    // Pesquisar livro por título
    public Livro pesquisarPorTitulo(String titulo) { // Retorna somente o primeiro valor (primeiro título encontrado)
        Livro tituloLivro = null;
        if(!catalogo.isEmpty()) {
            for(Livro title : catalogo) {
                if(title.getTitulo().equalsIgnoreCase(titulo)) {
                    tituloLivro = title;
                    break;
                }
            }
        }
        return tituloLivro;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        System.out.println("Adicionando livro...");

        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        System.out.println("Adicionando livro...");

        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        System.out.println("Adicionando livro...");

        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        System.out.println("Adicionando livro...");

        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);
        System.out.println("Adicionando livro...");

        System.out.println("Pesquisando por autor" + catalogoLivros.pesquisarPorAutor("Autor 2"));

        System.out.println("Pesquisando por ano" + catalogoLivros.pesquisarPorIntevaloAnos(2020, 2022));

        System.out.println("Pesquisando por título" + catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}

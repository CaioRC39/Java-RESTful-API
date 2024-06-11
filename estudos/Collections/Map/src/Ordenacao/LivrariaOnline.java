package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class LivrariaOnline {
    // Atributo
    private Map<String, Livro> livraria;

    // Método Construtor
    public LivrariaOnline() {
        this.livraria = new HashMap<>();
    }

    // Adiciona um livro à livraria, utilizando o ISBN como chave no Map
    public void adicionarLivro(String link, Livro livro) {
        livraria.put(link, livro);
    }

    // Remove um livro da livraria, dado o titulo do livro
    public void removerLivro(String titulo) {
        List<String> chavesRemover = new ArrayList<>(); // Lista para armazenar as chaves para serem removidas
        if(!livraria.isEmpty()) {
            for(Map.Entry<String, Livro> entry : livraria.entrySet()) { // Para cada entrada/item em "livraria"...
                if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)) { // Entrada acessa o valor do map (objeto Livro) e dele pega o título. Se o título do livro for igual ao titulo passado...
                    chavesRemover.add(entry.getKey()); // Entrada acessa a chave do map (pois remove-se de um map por chave)
                }
            }
            for(String chave : chavesRemover) { // Para cada chave/entrada/item em "chavesRemover"
                livraria.remove(chave); // Remove as entradas/chaves
            }
        } else {
            System.out.println("A livraria não contém livros");
        }
    }

    // Exibe os livros da livraria em ordem crescente de preço
    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
    List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livraria.entrySet());

    Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

    Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

    for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
      livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
    }

    return livrosOrdenadosPorPreco;
  }

  public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
    List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livraria.entrySet());

    Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

    Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

    for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
      livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
    }

    return livrosOrdenadosPorAutor;
  }

  public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
    Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
    for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
      Livro livro = entry.getValue();
      if (livro.getAutor().equals(autor)) {
        livrosPorAutor.put(entry.getKey(), livro);
      }
    }
    return livrosPorAutor;
  }

  public List<Livro> obterLivroMaisCaro() {
    List<Livro> livrosMaisCaros = new ArrayList<>();
    double precoMaisAlto = Double.MIN_VALUE;

    if (!livraria.isEmpty()) {
      for (Livro livro : livraria.values()) {
        if (livro.getPreco() > precoMaisAlto) {
          precoMaisAlto = livro.getPreco();
        }
      }
    } else {
      throw new NoSuchElementException("A livraria está vazia!");
    }

    for(Map.Entry<String, Livro> entry: livraria.entrySet()) {
      if(entry.getValue().getPreco() == precoMaisAlto) {
        Livro livroComPrecoMaisAlto = livraria.get(entry.getKey());
        livrosMaisCaros.add(livroComPrecoMaisAlto);
      }
    }
    return livrosMaisCaros;
  }

  public List<Livro> obterLivroMaisBarato() {
    List<Livro> livrosMaisBaratos = new ArrayList<>();
    double precoMaisBaixo = Double.MAX_VALUE;

    if (!livraria.isEmpty()) {
      for (Livro livro : livraria.values()) {
        if (livro.getPreco() < precoMaisBaixo) {
          precoMaisBaixo = livro.getPreco();
        }
      }
    } else {
      throw new NoSuchElementException("A livraria está vazia!");
    }

    for(Map.Entry<String, Livro> entry: livraria.entrySet()) {
      if(entry.getValue().getPreco() == precoMaisBaixo) {
        Livro livroComPrecoMaisBaixo = livraria.get(entry.getKey());
        livrosMaisBaratos.add(livroComPrecoMaisBaixo);
      }
    }
    return livrosMaisBaratos;
  }

  public static void main(String[] args) {
    LivrariaOnline livrariaOnline = new LivrariaOnline();
    // Adiciona os livros à livraria online
    livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
    livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
    livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
    livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
    livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
    livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

    // Exibe todos os livros ordenados por preço
    System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

    //Exibe todos os livros ordenados por autor
    System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

    // Pesquisa livros por autor
    String autorPesquisa = "Josh Malerman";
    livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

    // Obtém e exibe o livro mais caro
    System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

    // Obtém e exibe o livro mais barato
    System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

    // Remover um livro pelo título
    livrariaOnline.removerLivro("1984");
    System.out.println(livrariaOnline.livraria);

  }
    
}

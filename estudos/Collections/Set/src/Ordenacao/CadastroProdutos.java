package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    // Atributos
    private Set<Produto> produtos;

    // Método Construtor
    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    // Métodos

    // Adicionar produto ao cadastro
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtos.add(new Produto(nome, codigo, preco, quantidade));
    }

    // Exibir todos os produtos do cadastro em ordem alfabética pelo nome
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        return produtosPorNome;
    }

    // Exibir todos os produtos do cadastro em ordem alfabética pelo nome
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        System.out.println("Adicionando produto...");

        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
        System.out.println("Adicionando produto...");

        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
        System.out.println("Adicionando produto...");

        cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);
        System.out.println("Adicionando produto...");

        System.out.println("Exibindo produtos: " + cadastroProdutos.produtos);

        System.out.println("Exibindo produtos por nome: " + cadastroProdutos.exibirProdutosPorNome());

        System.out.println("Exibindo produtos por preço:" + cadastroProdutos.exibirProdutosPorPreco());
    }
}

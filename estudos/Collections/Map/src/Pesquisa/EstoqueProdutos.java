package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    // Atributo
    private Map<Long, Produto> estoque;

    // Método Construtor
    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    // Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço
    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        estoque.put(codigo, new Produto(nome, preco, quantidade));
    }
    
    // Exibe todos os produtos, suas quantidades em estoque e preços
    public void exibirProdutos() {
        if(!estoque.isEmpty()) {
            System.out.println(estoque);
        } else {
            System.out.println("O estoque está vazio");
        }
    }

    // Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoque.isEmpty()) {
            for(Produto p : estoque.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        } else {
            System.out.println("O estoque está vazio");
        }
        return valorTotalEstoque;
    }

    // Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoque.isEmpty()) {
            for(Produto p : estoque.values()) {
                if(p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        } else {
            System.out.println("O estoque está vazio");
        }
        return produtoMaisCaro;
    }

    // Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço
    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoque.isEmpty()) {
            for(Produto p : estoque.values()) {
                if(p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        } else {
            System.out.println("O estoque está vazio");
        }
        return produtoMaisBarato;
    }

    // Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço)
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Map<Produto, Double> produtos = new HashMap<>();
        double valorProduto = 0d;

        Produto produtoMaiorQuantidade = null;
        double maiorQuantidade = Double.MIN_VALUE;

        if(!estoque.isEmpty()) {
            for(Produto p : estoque.values()) {
                valorProduto = p.getQuantidade() * p.getPreco();
                produtos.put(p, valorProduto);

                if(produtos.get(p) > maiorQuantidade) {
                    produtoMaiorQuantidade = p;
                    maiorQuantidade = valorProduto;
                }
            }
        } else {
            System.out.println("O estoque está vazio");
        }
        return produtoMaiorQuantidade;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
    
        // Exibe o estoque vazio
        System.out.println("Exibindo produtos no estoque:");
        estoque.exibirProdutos();
    
        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        System.out.println("Adicionando produto ao estoque...");

        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        System.out.println("Adicionando produto ao estoque...");

        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        System.out.println("Adicionando produto ao estoque...");

        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
        System.out.println("Adicionando produto ao estoque...");

    
        // Exibe os produtos no estoque
        System.out.println("Exibindo produtos no estoque:");
        estoque.exibirProdutos();
    
        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
    
        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    
        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);
    
        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
      }
}

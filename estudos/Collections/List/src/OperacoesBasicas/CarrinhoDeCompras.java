package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // Atributo
    private List<Item> carrinho;

    // Método Construtor
    public CarrinhoDeCompras() {
      this.carrinho = new ArrayList<>();
    }

    // Adionar itens ao carrinho
    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    // Remover itens do carrinho
    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>(); // Cria uma lista de itens para serem removidos, para, posteriormente, remover tudo de uma vez
        for (Item i : carrinho) { // Laço for para "rodar" a lista principal (carrinho) e acrescentar à lista itensParaRemover
          if (i.getNome().equalsIgnoreCase(nome)) {
            itensParaRemover.add(i);
          }
        }
        carrinho.removeAll(itensParaRemover); // Removendo os itens selecionados
    }

    // Calcular o valor total dos itens no carrinho
    public double calcularValorTotal() {
        double valorTotal = 0d; // Criando uma variável de valor total
        for(Item i : carrinho) { // Laço for para "rodar" a lista principal (carrinho) e calcular o valor de cada item
            double valorItem = i.getPreco() * i.getQuantidade(); // Cálculo de cada item
            valorTotal += valorItem; // Somando tudo
        }
        return valorTotal; // Retornando o valor de todos os itens
    }

    // Exibir os itens do carinho
    public void exibirItens() {
      System.out.println(carrinho);
    }

    public static void main(String[] args) {
      CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

      // Adicionando itens ao carrinho
      carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
      System.out.println("Adicionando item ao carrinho...");
      
      carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
      System.out.println("Adicionando item ao carrinho...");

      carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
      System.out.println("Adicionando item ao carrinho...");

      carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);
      System.out.println("Adicionando item ao carrinho...");

      // Exibindo os itens no carrinho
      carrinhoDeCompras.exibirItens();

      // Removendo um item do carrinho
      carrinhoDeCompras.removerItem("Lápis");

      // Exibindo os itens atualizados no carrinho
      carrinhoDeCompras.exibirItens();

      // Calculando e exibindo o valor total da compra
      System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}

package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // Atributo
    private Set<String> palavras;

    // Método Construtor
    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }
    
    public void removerPalavra(String palavra) {
        if(palavras.contains(palavra)) {
            palavras.remove(palavra);
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavras.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavras);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        System.out.println("Adicionando palavra...");

        conjuntoLinguagens.adicionarPalavra("Python");
        System.out.println("Adicionando palavra...");
        
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        System.out.println("Adicionando palavra...");

        conjuntoLinguagens.adicionarPalavra("Python");
        System.out.println("Adicionando palavra...");

        conjuntoLinguagens.adicionarPalavra("C++");
        System.out.println("Adicionando palavra...");

        conjuntoLinguagens.adicionarPalavra("Ruby");
        System.out.println("Adicionando palavra...");

        // Exibindo as linguagens únicas no conjunto
        System.out.println("Exibindo palavras:");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        System.out.println("Removendo palavra...");
        System.out.println("Exibindo palavras:");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        System.out.println("Removendo palavra...");
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        System.out.println("Exibindo palavras:");
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}

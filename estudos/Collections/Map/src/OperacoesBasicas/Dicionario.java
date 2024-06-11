package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    // Atributo
    private Map<String, String> dicionario;

    // Método Construtor
    public Dicionario() {
        this.dicionario = new HashMap<>();
    } 

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        } else {
            System.out.println("O dicionário está vazio");
        }
        
    }

    public void exibirPalavras() {
        if(!dicionario.isEmpty()) {
            System.out.println(dicionario);
        } else {
            System.out.println("O dicionário está vazio");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = dicionario.get(palavra);
        if(!dicionario.isEmpty()) {
            return definicao;
        } else {
            return "O dicionário está vazio";
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
    
        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        System.out.println("Adicionando palavra ao dicionário...");

        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        System.out.println("Adicionando palavra ao dicionário...");

        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
        System.out.println("Adicionando palavra ao dicionário...");
    
        // Exibir todas as palavras
        System.out.println("Exibindo palavras:");
        dicionario.exibirPalavras();
    
        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);
    
        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println("Definição da linguagem 'csharp': " + definicaoCSharp);
    
        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        System.out.println("Removendo palavra do dicionário...");
        System.out.println("Exibindo palavras:");
        dicionario.exibirPalavras();
    }
}

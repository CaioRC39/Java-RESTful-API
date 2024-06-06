package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    // Atributo
    private List<Integer> numeros = new ArrayList<>();

    // Método construtor
    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    // Adicionar número à lista de números
    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    // Calcular soma de todos os números na lista
    public int calcularSoma() {
        int soma = 0;
        if(!numeros.isEmpty()) {
            for(Integer n : numeros) {
                soma += n;
            }
        }
        return soma;
    }

    // Encontrar o maior número na lista
    public int encontrarMaiorNumero() {
        int maior = 0;
        if(!numeros.isEmpty()) {
            for(Integer n : numeros) {
                if(n > maior) {
                    maior = n;
                }
            }
        }
        return maior;
    }

    // Encontrar o menor número na lista
    public int encontrarMenorNumero() {
        int menor = 0;
        if(!numeros.isEmpty()) {
            for(Integer n : numeros) {
                if(n < menor) {
                    menor = n;
                }
            }
        }
        return menor;
    }

    // Retornar uma lista contendo todos os números presentes na lista
    public void exibirNumeros() {
        System.out.println(numeros);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        System.out.println("Adicionando número à lista...");

        somaNumeros.adicionarNumero(0);
        System.out.println("Adicionando número à lista...");

        somaNumeros.adicionarNumero(0);
        System.out.println("Adicionando número à lista...");

        somaNumeros.adicionarNumero(-2);
        System.out.println("Adicionando número à lista...");

        somaNumeros.adicionarNumero(10);
        System.out.println("Adicionando número à lista...");

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

         // Encontrando e exibindo o maior número na lista
         System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

         // Encontrando e exibindo o menor número na lista
         System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}

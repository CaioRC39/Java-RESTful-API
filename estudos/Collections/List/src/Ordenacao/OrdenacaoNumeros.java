package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    // Atributo
    private List<Integer> numeros = new ArrayList<>();

    // Método Construtor
    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(numeros);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(numeros);
        numerosAscendente.sort(Collections.reverseOrder());
        return numerosAscendente;
    }

    public void exibirNumeros() {
        System.out.println(numeros);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        System.out.println("Adicionando número...");

        numeros.adicionarNumero(5);
        System.out.println("Adicionando número...");

        numeros.adicionarNumero(4);
        System.out.println("Adicionando número...");

        numeros.adicionarNumero(1);
        System.out.println("Adicionando número...");

        numeros.adicionarNumero(99);
        System.out.println("Adicionando número...");

        // Exibindo a lista de números adicionados
        System.out.println("Exibindo os números:");
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println("Ordenando os números:");
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        System.out.println("Exibindo os números:");
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println("Ordenando os números:");
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        System.out.println("Exibindo os números:");
        numeros.exibirNumeros();
    }
}

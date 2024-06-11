package Exemplos;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

// Como se fosse uma função, porém retorna valores do mesmo tipo da entrada; Usada para realizar operações de redução em pares de elementos

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // Usar o BinaryOperator para somar todos os números no Stream
        // int resultado = numeros.stream().reduce(0, somar);

        // Alternativamente
        // int resultado = numeros.stream().reduce(0, (num1, num2) -> num1 + num2); // Expressão Lambda
        int resultado = numeros.stream().reduce(0, Integer::sum); // Method Reference

        // Imprimir os resultados da soma
        System.out.println("A soma dos números é: " + resultado);
    }
}

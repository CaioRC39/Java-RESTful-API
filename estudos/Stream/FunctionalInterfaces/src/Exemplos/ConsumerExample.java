package Exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Consumer consome; Somente recebe argumentos, não retorna nada; Usada para realizar ações ou efeitos colaterais nos elementos do Stream sem modificá-los

public class ConsumerExample {
    public static void main(String[] args) throws Exception {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);

        /* Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 == 0) {
                System.out.println(numero);
            }
        };
        */

        // Usar o Consumer para imprimir números pares no Stream
        // numeros.stream().forEach(imprimirNumeroPar);

        /* Alternativamente:
        numeros.forEach(n -> { // Expressão Lambda
                if(n % 2 == 0) {
                    System.out.println(n);
                }
            }
        );
        */

        // Com Consumer
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
package Exemplos;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Supplier supre; Somente fornece saída, não recebe entradas; Usada para criar ou fornecer novos objetos de um determinado tipo

public class SupplierExample {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";
        
        /* Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(5)
        .collect(Collectors.toList());
        */

        /*
        List<String> listaSaudacoes = Stream.generate(saudacao)  // Gerando as "saudações", passando como parâmetro um Supplier
        .limit(5)                                                // Quantas vezes eu quero que a saudação seja gerada
        .toList();                                               // Todas as saudações geradas serão colocadas em um List
         */
        
         List<String> listaSaudacoes = Stream.generate( () -> "Olá, seja bem-vindo(a)!" )
         .limit(5)
         .toList(); 
        
        // listaSaudacoes.forEach(s -> System.out.println(s));

        // Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println); // Utilizando Method Reference
    }
}

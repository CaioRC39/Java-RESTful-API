import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    public static void main(String[] args) {
        double mesada = 50;
        int qtdDoces = 0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            
            System.out.println("Doce de valor: " + valorDoce + " adicionado ao carrinho");
            
            mesada = mesada - valorDoce;

            qtdDoces++;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho comprou " + qtdDoces + " doces");
        
    }
}

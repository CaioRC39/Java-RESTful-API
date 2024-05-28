package Autódromo;
public class Autodromo {
    public static void main(String[] args) {
        Carro f1 = new Carro();

        f1.setChassi("54351");
        f1.ligar();

        Moto z400 = new Moto();
        z400.setChassi("87817");
        z400.ligar();

        // Polimorfismo
        Veiculo coringa = f1; // coringa = z400;
        
        coringa.ligar();
    }
}

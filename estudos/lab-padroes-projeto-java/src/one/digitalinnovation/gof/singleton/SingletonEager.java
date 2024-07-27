package one.digitalinnovation.gof.singleton;

/*
 * Singleton "apressado".
 * @author CaioRC39
 */

public class SingletonEager {
    // Instância dele mesmo
    private static SingletonEager instancia = new SingletonEager();

    // Método construtor
    private SingletonEager() {
        super();
    }

    // Get instancia
    public static SingletonEager getInstancia() {
        return instancia;
    }
}

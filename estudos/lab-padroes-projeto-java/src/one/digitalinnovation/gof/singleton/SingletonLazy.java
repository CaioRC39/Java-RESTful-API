package one.digitalinnovation.gof.singleton;

/*
 * Singleton "preguiçoso".
 * @author CaioRC39
 */

public class SingletonLazy {
    // Instância dele mesmo
    private static SingletonLazy instancia;

    // Método construtor
    private SingletonLazy() {
        super();
    }

    // Get instancia
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}

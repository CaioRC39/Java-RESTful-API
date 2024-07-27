package one.digitalinnovation.gof.singleton;

/*
 * Singleton "Lazy Holder".
 * @author CaioRC39
 */

public class SingletonLazyHolder {
    // Detentor da instancia
    private static class InstanceHolder {
        // Instância dele mesmo
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    // Método construtor
    private SingletonLazyHolder() {
        super();
    }

    // Get instancia
    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}

package subsistema2.cep;

public class CepApi {
    // Instância dele mesmo
    private static CepApi instancia = new CepApi();

    // Método construtor
    private CepApi() {
        super();
    }

    // Get instancia
    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "São Paulo";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}

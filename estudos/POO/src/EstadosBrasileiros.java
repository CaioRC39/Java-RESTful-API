public enum EstadosBrasileiros {
    SAO_PAULO ("SP", "São Paulo", 11),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
    PIAUI ("PI", "Piauí", 13),
    MARANHAO ("MA","Maranhão", 14),
    CEARA ("CE", "Ceará", 15);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadosBrasileiros(String nome, String sigla, int ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public int getIbge() {
        return ibge;
    }
    
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}

public class SistemaIBGE {
    public static void main(String[] args) {
        for(EstadosBrasileiros e: EstadosBrasileiros.values()) {
            //System.out.println(e.getSigla() + " - " + e.getNome());
        }

        EstadosBrasileiros eb = EstadosBrasileiros.PIAUI;
        
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}

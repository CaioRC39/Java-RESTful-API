package one.digitalinnovation.gof.strategy;

public class Robo {
    // Estratégia de comportamento do robô/Atributo
    private Comportamento comportamento;

    // Setter
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }
    
}

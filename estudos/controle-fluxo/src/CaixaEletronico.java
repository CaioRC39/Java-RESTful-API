public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 18.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque concluído com êxito. Seu novo saldo é: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque. Seu saldo é: " + saldo);
        }
    }
}

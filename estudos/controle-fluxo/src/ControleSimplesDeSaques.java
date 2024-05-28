import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o limite diário de saque:");
        double limiteDiario = scanner.nextDouble();

            System.out.println("Informe o valor do saque (ou digite 0 para encerrar):");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Encerrando transações.");
            }

            if (valorSaque > limiteDiario) {
                System.out.println("Limite diário de saque atingido.");
            }

            // Se o saque for possível (não ultrapassa o limite diário)
            limiteDiario -= valorSaque;
            System.out.println("Saque realizado com sucesso. Limite restante: " + limiteDiario);

        // Fechamos o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}

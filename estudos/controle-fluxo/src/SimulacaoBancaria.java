import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 1000000000; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 

            System.out.println("Selecione a opção desejada:\n1. Depositar\n2. Sacar\n3. Consultar Saldo\n0. Encerrar");
            int opcao = scanner.nextInt(); 
        // TODO: Implemente as condições necessárias para avaliar a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch (opcao) {
                // Depositar
                case 1: {
                    System.out.println("Insira o valor que desejas depositar");
                    double deposito = scanner.nextDouble();

                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                }
                // Sacar
                case 2: {
                    System.out.println("Insira o valor que desejas sacar");
                    double saque = scanner.nextDouble();

                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso");
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                }
                // Consultar Saldo
                case 3: {
                    System.out.println("Saldo atual: " + saldo);
                    break;
                }
                // Encerrar
                case 0: {
                    System.out.println("Encerrando o programa");
                    break;
                }
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida: 
                default: {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }

            if (opcao == 0) {
                break;
            }
        }
        scanner.close();
    }
}
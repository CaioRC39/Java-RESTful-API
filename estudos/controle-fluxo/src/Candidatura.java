import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class Candidatura {
    public static void main(String[] args) {
            System.out.println("Processo seletivo");

            String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Gustavo"};

            for (String candidato : candidatos) {
                entrandoEmContato(candidato);
            }
    }

    public static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }

    public static void selecaoCandidatos() {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Gustavo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge", "João"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            candidatosAtual++;
        }
    }

    public static void imprimirSelecionados() {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Gustavo"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n°" + (indice+1) + " é o " + candidatos[indice]);
        }
    }

    public static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }
        } while (continuarTentando && tentativasRealizadas <= 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas);
        } else {
            System.out.println("Conseguimos contato com " + candidato + ", número máximo de tentativas realizadas: " + tentativasRealizadas);
        }
    }

    // Métodos auxiliares
    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static boolean atender() {
        return new Random().nextInt(3)==1;
    }
}
import java.util.Scanner; 

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String numeroConta = scanner.next();
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println("Erro: Numero de conta inválido. Digite exatamente 8 digitos.");
            //System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numerConta) throws IllegalArgumentException{
        if (numerConta.length() != 8) {
            throw new IllegalArgumentException();
        }
    }
}

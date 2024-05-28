import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMeExcecção {
    public static void main(String[] args) throws Exception {
        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Diga seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Olá! Me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " metros");

        scanner.close();
        }
        catch (InputMismatchException erroNumero) {
            System.err.println("Os campos idade e altura devem ser numéricos");
        }
    
    }

}

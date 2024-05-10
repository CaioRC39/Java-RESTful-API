package edu.caio.segundasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Caio";
        String sobrenome = "Rebouças";

        String nomeCompleto = nomeCompleto (primeiroNome, sobrenome);

        System.out.print (nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String sobrenome) {
        return primeiroNome + " " + sobrenome;
    }
}

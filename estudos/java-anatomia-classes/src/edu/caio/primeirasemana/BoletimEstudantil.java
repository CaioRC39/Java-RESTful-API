package edu.caio.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int media = 7;

        if (media < 6) {
            System.out.print ("Reprovado!");
        } else if (media == 6) {
            System.out.print ("Na trave!");
        } else {
            System.out.print ("Aprovado!");
        }
    }
}

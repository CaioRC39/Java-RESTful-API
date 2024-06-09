package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // Atributos
    private Set<Convidado> convidados;

    // Método Construtor
    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite) {
        Convidado convidadosParaRemover = null;
        for(Convidado c : convidados) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadosParaRemover = c;
                break;
            }
        }
        convidados.remove(convidadosParaRemover);
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        System.out.println(convidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        System.out.println("Adicionando convidado...");

        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        System.out.println("Adicionando convidado...");

        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        System.out.println("Adicionando convidado...");

        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);
        System.out.println("Adicionando convidado...");

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.removerConvidado(1234);
        System.out.println("Removendo convidado...");
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        System.out.println("Exibindo convidados:");
        conjuntoConvidados.exibirConvidados();
    }
}
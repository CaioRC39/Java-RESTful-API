package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    // Atributos
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    // Getters
    public String getNome() {
        return nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    // Métodos
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void desinscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.removeAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().remove(this);
    }

    public boolean seBootcampConcluido(Bootcamp bootcamp) {
        return conteudosConcluidos.containsAll(bootcamp.getConteudos());
    }

    public String gerarCertificado(Bootcamp bootcamp) {
        if(seBootcampConcluido(bootcamp)) {
            return "Certificado de Conclusão do Bootcamp: " + bootcamp.getNome() + "\nDev: " + this.nome;
        } else {
            return "Você ainda não completou todos os conteúdos";
        }
    }
    
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado(a) em nenhum conteúdo");
        }
    }

    public double calcularTotalXP() {
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
    }

    // Verificação
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
        result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (conteudosInscritos == null) {
            if (other.conteudosInscritos != null)
                return false;
        } else if (!conteudosInscritos.equals(other.conteudosInscritos))
            return false;
        if (conteudosConcluidos == null) {
            if (other.conteudosConcluidos != null)
                return false;
        } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
            return false;
        return true;
    }    
}

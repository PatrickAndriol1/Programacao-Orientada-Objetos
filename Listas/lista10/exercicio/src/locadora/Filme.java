package locadora;

import java.util.List;

public class Filme implements AudioVisual {
    private String titulo;
    private String diretor;
    private List<String> atores;

    public Filme(String titulo, String diretor, List<String> atores) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.atores = atores;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Filme: %s%nDiretor: %s%nAtores: %s%n", titulo, diretor, atores);
        System.out.println();
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }
    public String getDiretor() {
        return diretor;
    }
    public List<String> getAtores() {
        return atores;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public void setAtores(List<String> atores) {
        this.atores = atores;
    }
}

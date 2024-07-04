package locadora;

public class Jogo implements AudioVisual {
    private String titulo;
    private String plataforma;

    public Jogo(String titulo, String plataforma) {
        this.titulo = titulo;
        this.plataforma = plataforma;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Jogo: %s%nPlataforma Disponivel: %s%n", titulo, plataforma);
        System.out.println();
    }

    public String getTitulo() {
        return titulo;
    }
    public String getPlataforma() {
        return plataforma;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
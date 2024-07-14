public class Musica {
    private int id;
    private String titulo;
    private int duracaoEmSegundos;
    private boolean favoritada;

    public Musica(int id, String titulo, int duracaoEmSegundos, boolean favoritada) {
        this.id = id;
        this.titulo = titulo;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.favoritada = favoritada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public boolean isFavoritada() {
        return favoritada;
    }

    public void setFavoritada(boolean favoritada) {
        this.favoritada = favoritada;
    }
}
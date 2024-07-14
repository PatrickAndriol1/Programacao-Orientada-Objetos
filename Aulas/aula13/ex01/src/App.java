import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Musica> musicas = new ArrayList<>();

        musicas.addAll(new ArrayList<>(List.of(
            new Musica(1, "Thriller", 354, true),
            new Musica(2, "Hey Jude", 421, false),
            new Musica(3, "Bohemian Rhapsody", 357, false),
            new Musica(4, "Skyline Pidgeon", 210, true),
            new Musica(5, "Smooth Criminal", 412, true)
        )));

        for (Musica musica : musicas) {
            if (musica.isFavoritada()) {
                System.out.println(musica.getTitulo());
            }
        }

    }
}
